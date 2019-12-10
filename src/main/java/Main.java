import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.GrammarJfkLexer;
import parser.GrammarJfkParser;

public class Main {
    public static  void main(String[] args){

        ANTLRInputStream inputStream = new ANTLRInputStream(
                "I would like to [b][i]emphasize[/i][/b] this and [u]underline [b]that[/b][/u] ." +
                        "Let's not forget to quote: [quote author=""]You're wrong![/quote]");

        GrammarJfkLexer markupLexer = new GrammarJfkLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        GrammarJfkParser markupParser = new GrammarJfkParser(commonTokenStream);


    }
}
