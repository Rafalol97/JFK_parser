import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.GrammarJfkLexer;
import parser.GrammarJfkParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        Main mainProgrammObject = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Registry.stack.add(null);
        try {
            while ((line=bufferedReader.readLine())!=null) {
                ANTLRInputStream inputStream = new ANTLRInputStream(line);
                try {
                    GrammarJfkLexer grammarJfkLexer = new GrammarJfkLexer(inputStream);

                    grammarJfkLexer.removeErrorListeners();
                    grammarJfkLexer.addErrorListener(new GrammarErrorListener());

                    CommonTokenStream commonTokenStream = new CommonTokenStream(grammarJfkLexer);
                    GrammarJfkParser grammarJfkParser = new GrammarJfkParser(commonTokenStream);


                    grammarJfkParser.removeErrorListeners();
                    grammarJfkParser.addErrorListener(new GrammarErrorListener());

                    GrammarJfkParser.CommandContext commandContext = grammarJfkParser.command();
                    GrammarVisitor grammarVisitor = new GrammarVisitor();
                    CommandObject commandObject = grammarVisitor.visitCommand(commandContext);
                    mainProgrammObject.recognizeCommand(commandObject);
                } catch (Exception e) {
                    System.out.println("Error " + line) ;
                }
            }
        }
        catch (IOException e){
            System.out.println("FILE ERROR");
        }
    }

    public boolean recognizeCommand(CommandObject commandObject) {
        if (commandObject.getCommand() == CommandObject.Command.MOV) {
            return operateMovCommand(commandObject);
        } else if (commandObject.getCommand() == CommandObject.Command.INT) {
            return operateIntCommand(commandObject);
        } else if (commandObject.getCommand() == CommandObject.Command.XOR) {
            return operateXorCommand(commandObject);
        } else {
            return operatePushCommand(commandObject);
        }
    }

    private boolean operateMovCommand(CommandObject commandObject) {
        if (commandObject.getUnknownFlag()) {
            Registry.setRegistry(commandObject.getRegistry(), null);
        } else {
            Registry.setRegistry(commandObject.getRegistry(), commandObject.getExpression());
        }
        return true;
    }

    private boolean operateIntCommand(CommandObject commandObject) {
        if (Registry.stack.isEmpty()) {
            System.out.println("???");
            return false;
        } else {
            Integer popped = Registry.stack.remove(Registry.stack.size()-1);
            if (popped == null) {
                System.out.println("???");
            } else {
                System.out.println(popped);
            }
            return true;
        }

    }
    //TODO %ebx^%ebx = 0
    private boolean operateXorCommand(CommandObject commandObject) {
        Integer a1 = commandObject.getExpression();
        String registryTo = commandObject.getRegistry();

        if (commandObject.getUnknownFlag() || Registry.parseRegistry(registryTo) == null) {
            Registry.setRegistry(commandObject.getRegistry(), null);
        } else {
            Registry.setRegistry(registryTo, Registry.parseRegistry(registryTo) ^ commandObject.getExpression());
        }

        return true;
    }

    private boolean operatePushCommand(CommandObject commandObject) {
        if (commandObject.getUnknownFlag()) {
            Registry.stack.add(null);
        }
        else {
            Registry.stack.add(commandObject.getExpression());
        }

        return true;
    }
}
