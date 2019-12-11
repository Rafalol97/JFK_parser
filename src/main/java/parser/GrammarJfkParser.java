// Generated from C:/Users/rafal/IntelliJIDEAProjects/Zad1/src/main/antlr4\GrammarJfk.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarJfkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		NEWLINE=17, WHITESPACE=18, WHITE=19, TAB=20;
	public static final int
		RULE_mov = 0, RULE_intc = 1, RULE_push = 2, RULE_xor = 3, RULE_registry = 4, 
		RULE_command = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"mov", "intc", "push", "xor", "registry", "command", "expression"
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

	@Override
	public String getGrammarFileName() { return "GrammarJfk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarJfkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MovContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegistryContext registry() {
			return getRuleContext(RegistryContext.class,0);
		}
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitMov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitMov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mov);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(WHITESPACE);
			setState(16);
			expression(0);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(17);
				match(WHITESPACE);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(T__1);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(24);
				match(WHITESPACE);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			registry();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(31);
				match(WHITESPACE);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntcContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
		}
		public IntcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterIntc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitIntc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitIntc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntcContext intc() throws RecognitionException {
		IntcContext _localctx = new IntcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_intc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			match(WHITESPACE);
			setState(39);
			match(T__3);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(40);
				match(WHITESPACE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_push);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			setState(47);
			match(WHITESPACE);
			setState(48);
			expression(0);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(49);
				match(WHITESPACE);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegistryContext registry() {
			return getRuleContext(RegistryContext.class,0);
		}
		public XorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorContext xor() throws RecognitionException {
		XorContext _localctx = new XorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_xor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			match(WHITESPACE);
			setState(57);
			expression(0);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(58);
				match(WHITESPACE);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__1);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(65);
				match(WHITESPACE);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			registry();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(72);
				match(WHITESPACE);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistryContext extends ParserRuleContext {
		public RegistryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterRegistry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitRegistry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitRegistry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistryContext registry() throws RecognitionException {
		RegistryContext _localctx = new RegistryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_registry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarJfkParser.EOF, 0); }
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public IntcContext intc() {
			return getRuleContext(IntcContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public XorContext xor() {
			return getRuleContext(XorContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(80);
				mov();
				}
				break;
			case T__2:
				{
				setState(81);
				intc();
				}
				break;
			case T__4:
				{
				setState(82);
				push();
				}
				break;
			case T__5:
				{
				setState(83);
				xor();
				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			setState(86);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public ExpressionContext inner;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode NUMBER() { return getToken(GrammarJfkParser.NUMBER, 0); }
		public RegistryContext registry() {
			return getRuleContext(RegistryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJfkListener ) ((GrammarJfkListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJfkVisitor ) return ((GrammarJfkVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(89);
				match(NUMBER);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				{
				setState(90);
				registry();
				}
				break;
			case T__10:
				{
				setState(91);
				match(T__10);
				setState(92);
				((ExpressionContext)_localctx).inner = expression(0);
				setState(93);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(98);
							match(WHITESPACE);
							}
							}
							setState(103);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(104);
						((ExpressionContext)_localctx).operator = match(T__12);
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(105);
							match(WHITESPACE);
							}
							}
							setState(110);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(111);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(113);
							match(WHITESPACE);
							}
							}
							setState(118);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(119);
						((ExpressionContext)_localctx).operator = match(T__13);
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(120);
							match(WHITESPACE);
							}
							}
							setState(125);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(126);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(128);
							match(WHITESPACE);
							}
							}
							setState(133);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(134);
						((ExpressionContext)_localctx).operator = match(T__14);
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(135);
							match(WHITESPACE);
							}
							}
							setState(140);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(141);
						((ExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\7\2"+
		"#\n\2\f\2\16\2&\13\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3"+
		"\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13"+
		"\5\3\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7W\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"b\n\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b"+
		"\3\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13"+
		"\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\7\b\u008b\n\b"+
		"\f\b\16\b\u008e\13\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\2\3\16"+
		"\t\2\4\6\b\n\f\16\2\3\3\2\t\f\2\u00a5\2\20\3\2\2\2\4\'\3\2\2\2\6\60\3"+
		"\2\2\2\b9\3\2\2\2\nP\3\2\2\2\fV\3\2\2\2\16a\3\2\2\2\20\21\7\3\2\2\21\22"+
		"\7\24\2\2\22\26\5\16\b\2\23\25\7\24\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26"+
		"\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\35\7\4\2\2\32"+
		"\34\7\24\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		" \3\2\2\2\37\35\3\2\2\2 $\5\n\6\2!#\7\24\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'(\7\5\2\2()\7\24\2\2)-\7\6\2\2"+
		"*,\7\24\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/-\3\2\2"+
		"\2\60\61\7\7\2\2\61\62\7\24\2\2\62\66\5\16\b\2\63\65\7\24\2\2\64\63\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2"+
		"\29:\7\b\2\2:;\7\24\2\2;?\5\16\b\2<>\7\24\2\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\7\4\2\2CE\7\24\2\2DC\3\2\2\2EH"+
		"\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IM\5\n\6\2JL\7\24\2\2"+
		"KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3\2\2\2PQ\t\2\2"+
		"\2Q\13\3\2\2\2RW\5\2\2\2SW\5\4\3\2TW\5\6\4\2UW\5\b\5\2VR\3\2\2\2VS\3\2"+
		"\2\2VT\3\2\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\2\2\3Y\r\3\2\2\2Z[\b"+
		"\b\1\2[b\7\22\2\2\\b\5\n\6\2]^\7\r\2\2^_\5\16\b\2_`\7\16\2\2`b\3\2\2\2"+
		"aZ\3\2\2\2a\\\3\2\2\2a]\3\2\2\2b\u0092\3\2\2\2cg\f\5\2\2df\7\24\2\2ed"+
		"\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jn\7\17\2\2"+
		"km\7\24\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2"+
		"\2q\u0091\5\16\b\6rv\f\4\2\2su\7\24\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y}\7\20\2\2z|\7\24\2\2{z\3\2\2\2|\177\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0091\5\16"+
		"\b\5\u0081\u0085\f\3\2\2\u0082\u0084\7\24\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008c\7\21\2\2\u0089\u008b\7\24\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\16\b\4\u0090"+
		"c\3\2\2\2\u0090r\3\2\2\2\u0090\u0081\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\17\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\24\26\35$-\66?FMVagnv}\u0085\u008c\u0090\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}