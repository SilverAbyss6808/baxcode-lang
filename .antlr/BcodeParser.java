// Generated from c:/random downloads/Code/Python/baxcode-lang/Bcode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ITEM_COMMENT=2, ITEM_WHITESPACE=3, ITEM_NEWLINE=4, LITERAL_STRING=5, 
		OPERATOR_ADD=6, OPERATOR_SUBTR=7, OPERATOR_MULT=8, OPERATOR_DIV=9, OPERATOR_GTHAN=10, 
		OPERATOR_LTHAN=11, OPERATOR_ASSIGN=12, SYMBOL_OPENPAR=13, SYMBOL_CLOSEPAR=14, 
		SYMBOL_OPENBRACE=15, SYMBOL_CLOSEBRACE=16, SYMBOL_SEMICOLON=17, SYMBOL_COMMA=18, 
		STRUCTURE_RETURNS=19, STRUCTURE_RETURN=20, FUNCTION_CPRINT=21, LITERAL_BOOL=22, 
		LITERAL_NONE=23, ITEM_VARNAME=24, TYPE_INTEGER=25, TYPE_BOOL=26, TYPE_NONE=27, 
		TYPE_STRING=28, LITERAL_INTEGER=29;
	public static final int
		RULE_start_ = 0, RULE_program = 1, RULE_expression = 2, RULE_line = 3, 
		RULE_opr_arith = 4, RULE_opr_cmp = 5, RULE_typ = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "program", "expression", "line", "opr_arith", "opr_cmp", "typ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'>'", "'<'", "'='", "'('", "')'", "'{'", "'}'", "';'", "','", "'returns'", 
			"'return'", "'cprint'", null, "'NONE'", null, "'int'", "'bool'", "'none'", 
			"'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ITEM_COMMENT", "ITEM_WHITESPACE", "ITEM_NEWLINE", "LITERAL_STRING", 
			"OPERATOR_ADD", "OPERATOR_SUBTR", "OPERATOR_MULT", "OPERATOR_DIV", "OPERATOR_GTHAN", 
			"OPERATOR_LTHAN", "OPERATOR_ASSIGN", "SYMBOL_OPENPAR", "SYMBOL_CLOSEPAR", 
			"SYMBOL_OPENBRACE", "SYMBOL_CLOSEBRACE", "SYMBOL_SEMICOLON", "SYMBOL_COMMA", 
			"STRUCTURE_RETURNS", "STRUCTURE_RETURN", "FUNCTION_CPRINT", "LITERAL_BOOL", 
			"LITERAL_NONE", "ITEM_VARNAME", "TYPE_INTEGER", "TYPE_BOOL", "TYPE_NONE", 
			"TYPE_STRING", "LITERAL_INTEGER"
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
	public String getGrammarFileName() { return "Bcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Context extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			program();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public TerminalNode STRUCTURE_RETURNS() { return getToken(BcodeParser.STRUCTURE_RETURNS, 0); }
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public TerminalNode SYMBOL_OPENBRACE() { return getToken(BcodeParser.SYMBOL_OPENBRACE, 0); }
		public TerminalNode SYMBOL_CLOSEBRACE() { return getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0); }
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> SYMBOL_COMMA() { return getTokens(BcodeParser.SYMBOL_COMMA); }
		public TerminalNode SYMBOL_COMMA(int i) {
			return getToken(BcodeParser.SYMBOL_COMMA, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			match(ITEM_VARNAME);
			setState(18);
			match(SYMBOL_OPENPAR);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1072693280L) != 0)) {
				{
				{
				setState(19);
				expression(0);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_COMMA) {
					{
					setState(20);
					match(SYMBOL_COMMA);
					}
				}

				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(SYMBOL_CLOSEPAR);
			setState(29);
			match(STRUCTURE_RETURNS);
			setState(30);
			typ();
			setState(31);
			match(SYMBOL_OPENBRACE);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(32);
					line();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(38);
			match(SYMBOL_CLOSEBRACE);
			setState(39);
			match(SYMBOL_SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fnc_cprintContext extends ExpressionContext {
		public TerminalNode FUNCTION_CPRINT() { return getToken(BcodeParser.FUNCTION_CPRINT, 0); }
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public Fnc_cprintContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_arithContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Opr_arithContext opr_arith() {
			return getRuleContext(Opr_arithContext.class,0);
		}
		public Expr_arithContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_asgContext extends ExpressionContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public TerminalNode OPERATOR_ASSIGN() { return getToken(BcodeParser.OPERATOR_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_asgContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_defContext extends ExpressionContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public Var_defContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpressionContext {
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LitContext extends ExpressionContext {
		public TerminalNode LITERAL_BOOL() { return getToken(BcodeParser.LITERAL_BOOL, 0); }
		public TerminalNode LITERAL_NONE() { return getToken(BcodeParser.LITERAL_NONE, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(BcodeParser.LITERAL_STRING, 0); }
		public TerminalNode LITERAL_INTEGER() { return getToken(BcodeParser.LITERAL_INTEGER, 0); }
		public LitContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Stm_returnContext extends ExpressionContext {
		public TerminalNode STRUCTURE_RETURN() { return getToken(BcodeParser.STRUCTURE_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stm_returnContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new Var_asgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(42);
				typ();
				setState(43);
				match(ITEM_VARNAME);
				setState(44);
				match(OPERATOR_ASSIGN);
				setState(45);
				expression(6);
				}
				break;
			case 2:
				{
				_localctx = new Var_defContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				typ();
				setState(48);
				match(ITEM_VARNAME);
				}
				break;
			case 3:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(ITEM_VARNAME);
				}
				break;
			case 4:
				{
				_localctx = new Fnc_cprintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(FUNCTION_CPRINT);
				setState(52);
				match(SYMBOL_OPENPAR);
				setState(53);
				expression(0);
				setState(54);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 5:
				{
				_localctx = new Stm_returnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(STRUCTURE_RETURN);
				setState(57);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549453856L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_arithContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(61);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(62);
					opr_arith();
					setState(63);
					expression(8);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			expression(0);
			setState(71);
			match(SYMBOL_SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opr_arithContext extends ParserRuleContext {
		public TerminalNode OPERATOR_ADD() { return getToken(BcodeParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUBTR() { return getToken(BcodeParser.OPERATOR_SUBTR, 0); }
		public TerminalNode OPERATOR_MULT() { return getToken(BcodeParser.OPERATOR_MULT, 0); }
		public TerminalNode OPERATOR_DIV() { return getToken(BcodeParser.OPERATOR_DIV, 0); }
		public Opr_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr_arith; }
	}

	public final Opr_arithContext opr_arith() throws RecognitionException {
		Opr_arithContext _localctx = new Opr_arithContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_opr_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opr_cmpContext extends ParserRuleContext {
		public TerminalNode OPERATOR_GTHAN() { return getToken(BcodeParser.OPERATOR_GTHAN, 0); }
		public TerminalNode OPERATOR_LTHAN() { return getToken(BcodeParser.OPERATOR_LTHAN, 0); }
		public Opr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr_cmp; }
	}

	public final Opr_cmpContext opr_cmp() throws RecognitionException {
		Opr_cmpContext _localctx = new Opr_cmpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opr_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==OPERATOR_GTHAN || _la==OPERATOR_LTHAN) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypContext extends ParserRuleContext {
		public TerminalNode TYPE_INTEGER() { return getToken(BcodeParser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(BcodeParser.TYPE_BOOL, 0); }
		public TerminalNode TYPE_NONE() { return getToken(BcodeParser.TYPE_NONE, 0); }
		public TerminalNode TYPE_STRING() { return getToken(BcodeParser.TYPE_STRING, 0); }
		public TypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ; }
	}

	public final TypContext typ() throws RecognitionException {
		TypContext _localctx = new TypContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001dP\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016"+
		"\b\u0001\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\"\b"+
		"\u0001\n\u0001\f\u0001%\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001#\u0001\u0004\u0007\u0000\u0002\u0004\u0006\b"+
		"\n\f\u0000\u0004\u0003\u0000\u0005\u0005\u0016\u0017\u001d\u001d\u0001"+
		"\u0000\u0006\t\u0001\u0000\n\u000b\u0001\u0000\u0019\u001cQ\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000"+
		"\u0000\nK\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0005\u0001\u0000\u0000\u0011\u0012\u0005\u0018\u0000\u0000\u0012\u0019"+
		"\u0005\r\u0000\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014\u0016\u0005"+
		"\u0012\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0013\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u000e\u0000\u0000\u001d\u001e\u0005\u0013\u0000\u0000\u001e\u001f\u0003"+
		"\f\u0006\u0000\u001f#\u0005\u000f\u0000\u0000 \"\u0003\u0006\u0003\u0000"+
		"! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0010\u0000\u0000\'(\u0005\u0011\u0000\u0000(\u0003"+
		"\u0001\u0000\u0000\u0000)*\u0006\u0002\uffff\uffff\u0000*+\u0003\f\u0006"+
		"\u0000+,\u0005\u0018\u0000\u0000,-\u0005\f\u0000\u0000-.\u0003\u0004\u0002"+
		"\u0006.<\u0001\u0000\u0000\u0000/0\u0003\f\u0006\u000001\u0005\u0018\u0000"+
		"\u00001<\u0001\u0000\u0000\u00002<\u0005\u0018\u0000\u000034\u0005\u0015"+
		"\u0000\u000045\u0005\r\u0000\u000056\u0003\u0004\u0002\u000067\u0005\u000e"+
		"\u0000\u00007<\u0001\u0000\u0000\u000089\u0005\u0014\u0000\u00009<\u0003"+
		"\u0004\u0002\u0002:<\u0007\u0000\u0000\u0000;)\u0001\u0000\u0000\u0000"+
		";/\u0001\u0000\u0000\u0000;2\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<C\u0001\u0000"+
		"\u0000\u0000=>\n\u0007\u0000\u0000>?\u0003\b\u0004\u0000?@\u0003\u0004"+
		"\u0002\b@B\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000BE\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005"+
		"\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0003\u0004\u0002"+
		"\u0000GH\u0005\u0011\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0007"+
		"\u0001\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0007\u0002\u0000\u0000"+
		"L\u000b\u0001\u0000\u0000\u0000MN\u0007\u0003\u0000\u0000N\r\u0001\u0000"+
		"\u0000\u0000\u0005\u0015\u0019#;C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}