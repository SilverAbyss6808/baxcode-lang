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
		RULE_opr_arith = 0, RULE_opr_cmp = 1, RULE_sym = 2, RULE_str = 3, RULE_lit = 4, 
		RULE_var = 5, RULE_typ = 6, RULE_expr_arith = 7, RULE_expr_cmp = 8, RULE_var_def = 9, 
		RULE_var_asg = 10, RULE_var_reasg = 11, RULE_fnc_cprint = 12, RULE_stm_return = 13, 
		RULE_statement = 14, RULE_program = 15, RULE_start_ = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"opr_arith", "opr_cmp", "sym", "str", "lit", "var", "typ", "expr_arith", 
			"expr_cmp", "var_def", "var_asg", "var_reasg", "fnc_cprint", "stm_return", 
			"statement", "program", "start_"
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
		enterRule(_localctx, 0, RULE_opr_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		enterRule(_localctx, 2, RULE_opr_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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
	public static class SymContext extends ParserRuleContext {
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public TerminalNode SYMBOL_OPENBRACE() { return getToken(BcodeParser.SYMBOL_OPENBRACE, 0); }
		public TerminalNode SYMBOL_CLOSEBRACE() { return getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0); }
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public TerminalNode SYMBOL_COMMA() { return getToken(BcodeParser.SYMBOL_COMMA, 0); }
		public SymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sym; }
	}

	public final SymContext sym() throws RecognitionException {
		SymContext _localctx = new SymContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
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
	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRUCTURE_RETURNS() { return getToken(BcodeParser.STRUCTURE_RETURNS, 0); }
		public TerminalNode STRUCTURE_RETURN() { return getToken(BcodeParser.STRUCTURE_RETURN, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==STRUCTURE_RETURNS || _la==STRUCTURE_RETURN) ) {
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
	public static class LitContext extends ParserRuleContext {
		public TerminalNode LITERAL_BOOL() { return getToken(BcodeParser.LITERAL_BOOL, 0); }
		public TerminalNode LITERAL_NONE() { return getToken(BcodeParser.LITERAL_NONE, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(BcodeParser.LITERAL_STRING, 0); }
		public TerminalNode LITERAL_INTEGER() { return getToken(BcodeParser.LITERAL_INTEGER, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ITEM_VARNAME);
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
			setState(46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_arithContext extends ParserRuleContext {
		public List<LitContext> lit() {
			return getRuleContexts(LitContext.class);
		}
		public LitContext lit(int i) {
			return getRuleContext(LitContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<Opr_arithContext> opr_arith() {
			return getRuleContexts(Opr_arithContext.class);
		}
		public Opr_arithContext opr_arith(int i) {
			return getRuleContext(Opr_arithContext.class,i);
		}
		public Expr_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arith; }
	}

	public final Expr_arithContext expr_arith() throws RecognitionException {
		Expr_arithContext _localctx = new Expr_arithContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_STRING:
			case LITERAL_BOOL:
			case LITERAL_NONE:
			case LITERAL_INTEGER:
				{
				setState(48);
				lit();
				}
				break;
			case ITEM_VARNAME:
				{
				setState(49);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				opr_arith();
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_STRING:
				case LITERAL_BOOL:
				case LITERAL_NONE:
				case LITERAL_INTEGER:
					{
					setState(53);
					lit();
					}
					break;
				case ITEM_VARNAME:
					{
					setState(54);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0) );
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
	public static class Expr_cmpContext extends ParserRuleContext {
		public Opr_cmpContext opr_cmp() {
			return getRuleContext(Opr_cmpContext.class,0);
		}
		public List<LitContext> lit() {
			return getRuleContexts(LitContext.class);
		}
		public LitContext lit(int i) {
			return getRuleContext(LitContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_STRING:
			case LITERAL_BOOL:
			case LITERAL_NONE:
			case LITERAL_INTEGER:
				{
				setState(61);
				lit();
				}
				break;
			case ITEM_VARNAME:
				{
				setState(62);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			opr_cmp();
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_STRING:
			case LITERAL_BOOL:
			case LITERAL_NONE:
			case LITERAL_INTEGER:
				{
				setState(66);
				lit();
				}
				break;
			case ITEM_VARNAME:
				{
				setState(67);
				var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_defContext extends ParserRuleContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			typ();
			setState(71);
			var();
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
	public static class Var_asgContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public TerminalNode OPERATOR_ASSIGN() { return getToken(BcodeParser.OPERATOR_ASSIGN, 0); }
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public Var_asgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asg; }
	}

	public final Var_asgContext var_asg() throws RecognitionException {
		Var_asgContext _localctx = new Var_asgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_asg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			var_def();
			setState(74);
			match(OPERATOR_ASSIGN);
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(75);
				lit();
				}
				break;
			case 2:
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_OPENPAR) {
					{
					setState(76);
					match(SYMBOL_OPENPAR);
					}
				}

				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(79);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(80);
					expr_cmp();
					}
					break;
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_CLOSEPAR) {
					{
					setState(83);
					match(SYMBOL_CLOSEPAR);
					}
				}

				}
				break;
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
	public static class Var_reasgContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode OPERATOR_ASSIGN() { return getToken(BcodeParser.OPERATOR_ASSIGN, 0); }
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Var_reasgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_reasg; }
	}

	public final Var_reasgContext var_reasg() throws RecognitionException {
		Var_reasgContext _localctx = new Var_reasgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_reasg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			var();
			setState(89);
			match(OPERATOR_ASSIGN);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(90);
				lit();
				}
				break;
			case 2:
				{
				setState(91);
				match(SYMBOL_OPENPAR);
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(92);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(93);
					expr_cmp();
					}
					break;
				}
				setState(96);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 3:
				{
				setState(98);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(99);
				expr_cmp();
				}
				break;
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
	public static class Fnc_cprintContext extends ParserRuleContext {
		public TerminalNode FUNCTION_CPRINT() { return getToken(BcodeParser.FUNCTION_CPRINT, 0); }
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public List<LitContext> lit() {
			return getRuleContexts(LitContext.class);
		}
		public LitContext lit(int i) {
			return getRuleContext(LitContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Fnc_cprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnc_cprint; }
	}

	public final Fnc_cprintContext fnc_cprint() throws RecognitionException {
		Fnc_cprintContext _localctx = new Fnc_cprintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fnc_cprint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FUNCTION_CPRINT);
			setState(103);
			match(SYMBOL_OPENPAR);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566231072L) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_STRING:
				case LITERAL_BOOL:
				case LITERAL_NONE:
				case LITERAL_INTEGER:
					{
					setState(104);
					lit();
					}
					break;
				case ITEM_VARNAME:
					{
					setState(105);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(SYMBOL_CLOSEPAR);
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
	public static class Stm_returnContext extends ParserRuleContext {
		public TerminalNode STRUCTURE_RETURN() { return getToken(BcodeParser.STRUCTURE_RETURN, 0); }
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Stm_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_return; }
	}

	public final Stm_returnContext stm_return() throws RecognitionException {
		Stm_returnContext _localctx = new Stm_returnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(STRUCTURE_RETURN);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(114);
				lit();
				}
				break;
			case 2:
				{
				setState(115);
				var();
				}
				break;
			case 3:
				{
				setState(116);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(117);
				expr_cmp();
				}
				break;
			}
			setState(120);
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Var_asgContext var_asg() {
			return getRuleContext(Var_asgContext.class,0);
		}
		public Var_reasgContext var_reasg() {
			return getRuleContext(Var_reasgContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Fnc_cprintContext fnc_cprint() {
			return getRuleContext(Fnc_cprintContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(122);
				expr_arith();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644704L) != 0)) {
					{
					{
					setState(123);
					statement();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(129);
				expr_cmp();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644704L) != 0)) {
					{
					{
					setState(130);
					statement();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(136);
				var_def();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644704L) != 0)) {
					{
					{
					setState(137);
					statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				{
				setState(143);
				var_asg();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644704L) != 0)) {
					{
					{
					setState(144);
					statement();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				{
				setState(150);
				var_reasg();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644704L) != 0)) {
					{
					{
					setState(151);
					statement();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				{
				setState(157);
				var();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644704L) != 0)) {
					{
					{
					setState(158);
					statement();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				{
				setState(164);
				fnc_cprint();
				}
				break;
			}
			setState(167);
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
	public static class ProgramContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public TerminalNode STRUCTURE_RETURNS() { return getToken(BcodeParser.STRUCTURE_RETURNS, 0); }
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public TerminalNode SYMBOL_OPENBRACE() { return getToken(BcodeParser.SYMBOL_OPENBRACE, 0); }
		public Stm_returnContext stm_return() {
			return getRuleContext(Stm_returnContext.class,0);
		}
		public TerminalNode SYMBOL_CLOSEBRACE() { return getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0); }
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 30, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__0);
			setState(170);
			var();
			setState(171);
			match(SYMBOL_OPENPAR);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
				{
				{
				setState(172);
				var_def();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_COMMA) {
					{
					setState(173);
					match(SYMBOL_COMMA);
					}
				}

				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(SYMBOL_CLOSEPAR);
			setState(182);
			match(STRUCTURE_RETURNS);
			setState(183);
			typ();
			setState(184);
			match(SYMBOL_OPENBRACE);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(185);
					statement();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(191);
			stm_return();
			setState(192);
			match(SYMBOL_CLOSEBRACE);
			setState(193);
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
		enterRule(_localctx, 32, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u00073\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u00078\b\u0007\u0004\u0007:\b\u0007\u000b\u0007\f\u0007;\u0001\b\u0001"+
		"\b\u0003\b@\b\b\u0001\b\u0001\b\u0001\b\u0003\bE\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nN\b\n\u0001\n\u0001\n\u0003"+
		"\nR\b\n\u0001\n\u0003\nU\b\n\u0003\nW\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b_\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000be\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\fk\b\f\n\f\f\fn\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rw\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e}\b\u000e\n\u000e\f\u000e\u0080\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0084\b\u000e\n\u000e\f\u000e\u0087"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u008b\b\u000e\n\u000e\f\u000e"+
		"\u008e\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0092\b\u000e\n\u000e"+
		"\f\u000e\u0095\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0099\b\u000e"+
		"\n\u000e\f\u000e\u009c\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a0"+
		"\b\u000e\n\u000e\f\u000e\u00a3\t\u000e\u0001\u000e\u0003\u000e\u00a6\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00af\b\u000f\u0005\u000f\u00b1\b\u000f"+
		"\n\u000f\f\u000f\u00b4\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00bb\b\u000f\n\u000f\f\u000f\u00be\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u00bc\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0006\u0001\u0000"+
		"\u0006\t\u0001\u0000\n\u000b\u0001\u0000\r\u0012\u0001\u0000\u0013\u0014"+
		"\u0003\u0000\u0005\u0005\u0016\u0017\u001d\u001d\u0001\u0000\u0019\u001c"+
		"\u00d5\u0000\"\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000"+
		"\u0004&\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b*\u0001"+
		"\u0000\u0000\u0000\n,\u0001\u0000\u0000\u0000\f.\u0001\u0000\u0000\u0000"+
		"\u000e2\u0001\u0000\u0000\u0000\u0010?\u0001\u0000\u0000\u0000\u0012F"+
		"\u0001\u0000\u0000\u0000\u0014I\u0001\u0000\u0000\u0000\u0016X\u0001\u0000"+
		"\u0000\u0000\u0018f\u0001\u0000\u0000\u0000\u001aq\u0001\u0000\u0000\u0000"+
		"\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00a9\u0001\u0000\u0000\u0000"+
		" \u00c3\u0001\u0000\u0000\u0000\"#\u0007\u0000\u0000\u0000#\u0001\u0001"+
		"\u0000\u0000\u0000$%\u0007\u0001\u0000\u0000%\u0003\u0001\u0000\u0000"+
		"\u0000&\'\u0007\u0002\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0007"+
		"\u0003\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0007\u0004\u0000"+
		"\u0000+\t\u0001\u0000\u0000\u0000,-\u0005\u0018\u0000\u0000-\u000b\u0001"+
		"\u0000\u0000\u0000./\u0007\u0005\u0000\u0000/\r\u0001\u0000\u0000\u0000"+
		"03\u0003\b\u0004\u000013\u0003\n\u0005\u000020\u0001\u0000\u0000\u0000"+
		"21\u0001\u0000\u0000\u000039\u0001\u0000\u0000\u000047\u0003\u0000\u0000"+
		"\u000058\u0003\b\u0004\u000068\u0003\n\u0005\u000075\u0001\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000094\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<\u000f\u0001\u0000\u0000\u0000=@\u0003\b\u0004\u0000"+
		">@\u0003\n\u0005\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AD\u0003\u0002\u0001\u0000BE\u0003\b\u0004\u0000"+
		"CE\u0003\n\u0005\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"E\u0011\u0001\u0000\u0000\u0000FG\u0003\f\u0006\u0000GH\u0003\n\u0005"+
		"\u0000H\u0013\u0001\u0000\u0000\u0000IJ\u0003\u0012\t\u0000JV\u0005\f"+
		"\u0000\u0000KW\u0003\b\u0004\u0000LN\u0005\r\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OR\u0003"+
		"\u000e\u0007\u0000PR\u0003\u0010\b\u0000QO\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SU\u0005\u000e\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VK\u0001\u0000\u0000\u0000VM\u0001\u0000\u0000\u0000W\u0015\u0001"+
		"\u0000\u0000\u0000XY\u0003\n\u0005\u0000Yd\u0005\f\u0000\u0000Ze\u0003"+
		"\b\u0004\u0000[^\u0005\r\u0000\u0000\\_\u0003\u000e\u0007\u0000]_\u0003"+
		"\u0010\b\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`"+
		"\u0001\u0000\u0000\u0000`a\u0005\u000e\u0000\u0000ae\u0001\u0000\u0000"+
		"\u0000be\u0003\u000e\u0007\u0000ce\u0003\u0010\b\u0000dZ\u0001\u0000\u0000"+
		"\u0000d[\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000e\u0017\u0001\u0000\u0000\u0000fg\u0005\u0015\u0000\u0000"+
		"gl\u0005\r\u0000\u0000hk\u0003\b\u0004\u0000ik\u0003\n\u0005\u0000jh\u0001"+
		"\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000op\u0005\u000e\u0000\u0000p\u0019\u0001"+
		"\u0000\u0000\u0000qv\u0005\u0014\u0000\u0000rw\u0003\b\u0004\u0000sw\u0003"+
		"\n\u0005\u0000tw\u0003\u000e\u0007\u0000uw\u0003\u0010\b\u0000vr\u0001"+
		"\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0011\u0000"+
		"\u0000y\u001b\u0001\u0000\u0000\u0000z~\u0003\u000e\u0007\u0000{}\u0003"+
		"\u001c\u000e\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u00a6\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0085"+
		"\u0003\u0010\b\u0000\u0082\u0084\u0003\u001c\u000e\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u00a6\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c\u0003"+
		"\u0012\t\u0000\u0089\u008b\u0003\u001c\u000e\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u00a6\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0093\u0003\u0014"+
		"\n\u0000\u0090\u0092\u0003\u001c\u000e\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u00a6\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u009a\u0003\u0016\u000b"+
		"\u0000\u0097\u0099\u0003\u001c\u000e\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a6\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a1\u0003\n\u0005\u0000"+
		"\u009e\u00a0\u0003\u001c\u000e\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003\u0018\f\u0000\u00a5"+
		"z\u0001\u0000\u0000\u0000\u00a5\u0081\u0001\u0000\u0000\u0000\u00a5\u0088"+
		"\u0001\u0000\u0000\u0000\u00a5\u008f\u0001\u0000\u0000\u0000\u00a5\u0096"+
		"\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0011\u0000\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0001\u0000\u0000\u00aa\u00ab\u0003\n\u0005\u0000\u00ab\u00b2\u0005"+
		"\r\u0000\u0000\u00ac\u00ae\u0003\u0012\t\u0000\u00ad\u00af\u0005\u0012"+
		"\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000e"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0013\u0000\u0000\u00b7\u00b8\u0003\f\u0006"+
		"\u0000\u00b8\u00bc\u0005\u000f\u0000\u0000\u00b9\u00bb\u0003\u001c\u000e"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0003\u001a\r\u0000\u00c0\u00c1\u0005\u0010\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0011\u0000\u0000\u00c2\u001f\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4!\u0001\u0000\u0000\u0000\u0018"+
		"27;?DMQTV^djlv~\u0085\u008c\u0093\u009a\u00a1\u00a5\u00ae\u00b2\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}