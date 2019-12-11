// Generated from C:/Users/rafal/IntelliJIDEAProjects/Zad1/src/main/antlr4\GrammarJfk.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarJfkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		NEWLINE=17, WHITESPACE=18, WHITE=19, TAB=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NUMBER", "NEWLINE", 
			"WHITESPACE", "WHITE", "TAB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mov'", "','", "'int'", "'0x80'", "'push'", "'xor'", "'%eax'", 
			"'%ebx'", "'%ecx'", "'%edx'", "'('", "')'", "'*'", "'-'", "'+'", null, 
			null, null, "' '", "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUMBER", "NEWLINE", "WHITESPACE", "WHITE", "TAB"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GrammarJfkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarJfk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21c\n\21\r\21\16"+
		"\21d\3\22\5\22h\n\22\3\22\3\22\6\22l\n\22\r\22\16\22m\3\23\3\23\5\23r"+
		"\n\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\3\3\2\62"+
		";\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\61"+
		"\3\2\2\2\t\65\3\2\2\2\13:\3\2\2\2\r?\3\2\2\2\17C\3\2\2\2\21H\3\2\2\2\23"+
		"M\3\2\2\2\25R\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2"+
		"\37_\3\2\2\2!b\3\2\2\2#k\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3\2\2\2+,\7o\2"+
		"\2,-\7q\2\2-.\7x\2\2.\4\3\2\2\2/\60\7.\2\2\60\6\3\2\2\2\61\62\7k\2\2\62"+
		"\63\7p\2\2\63\64\7v\2\2\64\b\3\2\2\2\65\66\7\62\2\2\66\67\7z\2\2\678\7"+
		":\2\289\7\62\2\29\n\3\2\2\2:;\7r\2\2;<\7w\2\2<=\7u\2\2=>\7j\2\2>\f\3\2"+
		"\2\2?@\7z\2\2@A\7q\2\2AB\7t\2\2B\16\3\2\2\2CD\7\'\2\2DE\7g\2\2EF\7c\2"+
		"\2FG\7z\2\2G\20\3\2\2\2HI\7\'\2\2IJ\7g\2\2JK\7d\2\2KL\7z\2\2L\22\3\2\2"+
		"\2MN\7\'\2\2NO\7g\2\2OP\7e\2\2PQ\7z\2\2Q\24\3\2\2\2RS\7\'\2\2ST\7g\2\2"+
		"TU\7f\2\2UV\7z\2\2V\26\3\2\2\2WX\7*\2\2X\30\3\2\2\2YZ\7+\2\2Z\32\3\2\2"+
		"\2[\\\7,\2\2\\\34\3\2\2\2]^\7/\2\2^\36\3\2\2\2_`\7-\2\2` \3\2\2\2ac\t"+
		"\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\"\3\2\2\2fh\7\17\2\2g"+
		"f\3\2\2\2gh\3\2\2\2hi\3\2\2\2il\7\f\2\2jl\7\17\2\2kg\3\2\2\2kj\3\2\2\2"+
		"lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n$\3\2\2\2or\5\'\24\2pr\5)\25\2qo\3\2\2"+
		"\2qp\3\2\2\2r&\3\2\2\2st\7\"\2\2t(\3\2\2\2uv\7\13\2\2v*\3\2\2\2\b\2dg"+
		"kmq\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}