import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.GrammarJfkLexer;
import parser.GrammarJfkParser;

public class Main {
    public static  void main(String[] args){

        ANTLRInputStream inputStream = new ANTLRInputStream(
               "xor %ecx,%ebx \n");

        GrammarJfkLexer grammarJfkLexer = new GrammarJfkLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(grammarJfkLexer);
        GrammarJfkParser grammarJfkParser = new GrammarJfkParser(commonTokenStream);

        GrammarJfkParser.CommandContext commandContext = grammarJfkParser.command();
        GrammarVisitor grammarVisitor = new GrammarVisitor();
        System.out.println(grammarVisitor.visitCommand(commandContext).getRegistry());


    }
}
