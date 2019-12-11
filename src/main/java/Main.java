import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.GrammarJfkLexer;
import parser.GrammarJfkParser;

public class Main {
    public static void main(String[] args) {
        Main mainProgrammObject = new Main();

            ANTLRInputStream inputStream = new ANTLRInputStream(
                    "xor             %ecx,%ebx \n");
        try {
            GrammarJfkLexer grammarJfkLexer = new GrammarJfkLexer(inputStream);
            grammarJfkLexer.removeErrorListeners();
            grammarJfkLexer.addErrorListener(GrammarErrorListener.INSTANCE);
            CommonTokenStream commonTokenStream = new CommonTokenStream(grammarJfkLexer);
            GrammarJfkParser grammarJfkParser = new GrammarJfkParser(commonTokenStream);

            GrammarJfkParser.CommandContext commandContext = grammarJfkParser.command();
            grammarJfkLexer.removeErrorListeners();
            grammarJfkLexer.addErrorListener(GrammarErrorListener.INSTANCE);
            GrammarVisitor grammarVisitor = new GrammarVisitor();
            CommandObject commandObject = grammarVisitor.visitCommand(commandContext);
            mainProgrammObject.recognizeCommand(commandObject);
        }
        catch (Exception e){
            System.out.println("Error");
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
            Registry.setRegistry(commandObject.getRegistry(), commandObject.getExpression());
            return true;
    }

    private boolean operateIntCommand(CommandObject commandObject) {
        return true;
    }

    private boolean operateXorCommand(CommandObject commandObject) {
        return true;
    }

    private boolean operatePushCommand(CommandObject commandObject) {
        return true;
    }
}
