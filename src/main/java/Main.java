import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.Test1BaseVisitor;
import parser.Test1Lexer;
import parser.Test1Parser;

public class Main {
    public static  void main(String[] args){

        ANTLRInputStream inputStream = new ANTLRInputStream(
                "I would like to [b][i]emphasize[/i][/b] this and [u]underline [b]that[/b][/u] ." +
                        "Let's not forget to quote: [quote author=""]You're wrong![/quote]");

        Test1Lexer markupLexer = new Test1Lexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        Test1Parser markupParser = new Test1Parser(commonTokenStream);
      

    }
}
