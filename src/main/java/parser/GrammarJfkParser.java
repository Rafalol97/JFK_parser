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
		NEWLINE=17, WHITESPACE=18;
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
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUMBER", "NEWLINE", "WHITESPACE"
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegistryContext registry() {
			return getRuleContext(RegistryContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GrammarJfkParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
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
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				match(WHITESPACE);
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(20);
			expression(0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(21);
				match(WHITESPACE);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(T__1);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(28);
				match(WHITESPACE);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			registry();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(35);
				match(WHITESPACE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(NEWLINE);
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
		public TerminalNode WHITESPACE() { return getToken(GrammarJfkParser.WHITESPACE, 0); }
		public TerminalNode NEWLINE() { return getToken(GrammarJfkParser.NEWLINE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__2);
			setState(44);
			match(WHITESPACE);
			setState(45);
			match(T__3);
			setState(46);
			match(NEWLINE);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GrammarJfkParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
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
			setState(48);
			match(T__4);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				match(WHITESPACE);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(54);
			expression(0);
			setState(55);
			match(NEWLINE);
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
		public List<RegistryContext> registry() {
			return getRuleContexts(RegistryContext.class);
		}
		public RegistryContext registry(int i) {
			return getRuleContext(RegistryContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(GrammarJfkParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(GrammarJfkParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(GrammarJfkParser.WHITESPACE, i);
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
			setState(57);
			match(T__5);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(WHITESPACE);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(63);
			registry();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(64);
				match(WHITESPACE);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__1);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(71);
				match(WHITESPACE);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			registry();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(78);
				match(WHITESPACE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(NEWLINE);
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
			setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(88);
				mov();
				}
				break;
			case T__2:
				{
				setState(89);
				intc();
				}
				break;
			case T__4:
				{
				setState(90);
				push();
				}
				break;
			case T__5:
				{
				setState(91);
				xor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(95);
				match(NUMBER);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				{
				setState(96);
				registry();
				}
				break;
			case T__10:
				{
				setState(97);
				match(T__10);
				setState(98);
				((ExpressionContext)_localctx).inner = expression(0);
				setState(99);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(104);
							match(WHITESPACE);
							}
							}
							setState(109);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(110);
						((ExpressionContext)_localctx).operator = match(T__12);
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(111);
							match(WHITESPACE);
							}
							}
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(117);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(119);
							match(WHITESPACE);
							}
							}
							setState(124);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(125);
						((ExpressionContext)_localctx).operator = match(T__13);
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(126);
							match(WHITESPACE);
							}
							}
							setState(131);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(132);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(134);
							match(WHITESPACE);
							}
							}
							setState(139);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(140);
						((ExpressionContext)_localctx).operator = match(T__14);
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(141);
							match(WHITESPACE);
							}
							}
							setState(146);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(147);
						((ExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u009c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r"+
		"\2\16\2\24\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\7\2 \n\2\f\2\16"+
		"\2#\13\2\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\6\4\65\n\4\r\4\16\4\66\3\4\3\4\3\4\3\5\3\5\6\5>\n\5\r\5\16\5"+
		"?\3\5\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5"+
		"\3\5\7\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7_\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b"+
		"\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3"+
		"\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b"+
		"\16\b\u008d\13\b\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\7\b\u0097"+
		"\n\b\f\b\16\b\u009a\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\3\3\2\t\f\2\u00ab"+
		"\2\20\3\2\2\2\4-\3\2\2\2\6\62\3\2\2\2\b;\3\2\2\2\nX\3\2\2\2\f^\3\2\2\2"+
		"\16g\3\2\2\2\20\22\7\3\2\2\21\23\7\24\2\2\22\21\3\2\2\2\23\24\3\2\2\2"+
		"\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\32\5\16\b\2\27\31\7\24\2"+
		"\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2"+
		"\2\34\32\3\2\2\2\35!\7\4\2\2\36 \7\24\2\2\37\36\3\2\2\2 #\3\2\2\2!\37"+
		"\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$(\5\n\6\2%\'\7\24\2\2&%\3\2\2"+
		"\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\23\2\2,\3\3"+
		"\2\2\2-.\7\5\2\2./\7\24\2\2/\60\7\6\2\2\60\61\7\23\2\2\61\5\3\2\2\2\62"+
		"\64\7\7\2\2\63\65\7\24\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\678\3\2\2\289\5\16\b\29:\7\23\2\2:\7\3\2\2\2;=\7\b\2\2<>\7"+
		"\24\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AE\5\n\6\2BD"+
		"\7\24\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2"+
		"HL\7\4\2\2IK\7\24\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2"+
		"\2NL\3\2\2\2OS\5\n\6\2PR\7\24\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TV\3\2\2\2US\3\2\2\2VW\7\23\2\2W\t\3\2\2\2XY\t\2\2\2Y\13\3\2\2\2Z"+
		"_\5\2\2\2[_\5\4\3\2\\_\5\6\4\2]_\5\b\5\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2"+
		"\2^]\3\2\2\2_\r\3\2\2\2`a\b\b\1\2ah\7\22\2\2bh\5\n\6\2cd\7\r\2\2de\5\16"+
		"\b\2ef\7\16\2\2fh\3\2\2\2g`\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\u0098\3\2\2\2"+
		"im\f\5\2\2jl\7\24\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2"+
		"\2om\3\2\2\2pt\7\17\2\2qs\7\24\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2uw\3\2\2\2vt\3\2\2\2w\u0097\5\16\b\6x|\f\4\2\2y{\7\24\2\2zy\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0083\7\20"+
		"\2\2\u0080\u0082\7\24\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0097\5\16\b\5\u0087\u008b\f\3\2\2\u0088\u008a\7\24\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\7\21\2\2\u008f"+
		"\u0091\7\24\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\5\16\b\4\u0096i\3\2\2\2\u0096x\3\2\2\2\u0096\u0087\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\17\3\2\2"+
		"\2\u009a\u0098\3\2\2\2\25\24\32!(\66?ELS^gmt|\u0083\u008b\u0092\u0096"+
		"\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}