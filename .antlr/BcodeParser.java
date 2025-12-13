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
		ITEM_COMMENT=1, LITERAL_STRING=2, OPERATOR_ADD=3, OPERATOR_SUBTR=4, OPERATOR_MULT=5, 
		OPERATOR_DIV=6, OPERATOR_GTHAN=7, OPERATOR_LTHAN=8, OPERATOR_ASSIGN=9, 
		SYMBOL_OPENPAR=10, SYMBOL_CLOSEPAR=11, SYMBOL_OPENBRACE=12, SYMBOL_CLOSEBRACE=13, 
		SYMBOL_SEMICOLON=14, SYMBOL_COMMA=15, STRUCTURE_PROGRAM=16, STRUCTURE_RETURNS=17, 
		STRUCTURE_RETURN=18, FUNCTION_CPRINT=19, LITERAL_BOOL=20, LITERAL_NONE=21, 
		ITEM_VARNAME=22, ITEM_WHITESPACE=23, ITEM_NEWLINE=24, TYPE_INTEGER=25, 
		TYPE_BOOL=26, TYPE_NONE=27, TYPE_STRING=28, LITERAL_INTEGER=29;
	public static final int
		RULE_opr_arith = 0, RULE_opr_cmp = 1, RULE_sym = 2, RULE_str = 3, RULE_lit = 4, 
		RULE_itm = 5, RULE_typ = 6, RULE_expr_arith = 7, RULE_expr_cmp = 8, RULE_var_def = 9, 
		RULE_var_asg = 10, RULE_var_reasg = 11, RULE_fnc_cprint = 12, RULE_stm_return = 13, 
		RULE_statement = 14, RULE_program = 15, RULE_start_ = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"opr_arith", "opr_cmp", "sym", "str", "lit", "itm", "typ", "expr_arith", 
			"expr_cmp", "var_def", "var_asg", "var_reasg", "fnc_cprint", "stm_return", 
			"statement", "program", "start_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'('", 
			"')'", "'{'", "'}'", "';'", "','", "'program'", "'returns'", "'return'", 
			"'cprint'", null, "'NONE'", null, null, null, "'int'", "'bool'", "'none'", 
			"'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ITEM_COMMENT", "LITERAL_STRING", "OPERATOR_ADD", "OPERATOR_SUBTR", 
			"OPERATOR_MULT", "OPERATOR_DIV", "OPERATOR_GTHAN", "OPERATOR_LTHAN", 
			"OPERATOR_ASSIGN", "SYMBOL_OPENPAR", "SYMBOL_CLOSEPAR", "SYMBOL_OPENBRACE", 
			"SYMBOL_CLOSEBRACE", "SYMBOL_SEMICOLON", "SYMBOL_COMMA", "STRUCTURE_PROGRAM", 
			"STRUCTURE_RETURNS", "STRUCTURE_RETURN", "FUNCTION_CPRINT", "LITERAL_BOOL", 
			"LITERAL_NONE", "ITEM_VARNAME", "ITEM_WHITESPACE", "ITEM_NEWLINE", "TYPE_INTEGER", 
			"TYPE_BOOL", "TYPE_NONE", "TYPE_STRING", "LITERAL_INTEGER"
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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
		public TerminalNode STRUCTURE_PROGRAM() { return getToken(BcodeParser.STRUCTURE_PROGRAM, 0); }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 540016644L) != 0)) ) {
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
	public static class ItmContext extends ParserRuleContext {
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public TerminalNode ITEM_COMMENT() { return getToken(BcodeParser.ITEM_COMMENT, 0); }
		public TerminalNode ITEM_WHITESPACE() { return getToken(BcodeParser.ITEM_WHITESPACE, 0); }
		public TerminalNode ITEM_NEWLINE() { return getToken(BcodeParser.ITEM_NEWLINE, 0); }
		public ItmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itm; }
	}

	public final ItmContext itm() throws RecognitionException {
		ItmContext _localctx = new ItmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_itm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360130L) != 0)) ) {
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
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
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
				match(ITEM_VARNAME);
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
					match(ITEM_VARNAME);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0) );
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
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
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
				match(ITEM_VARNAME);
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
				match(ITEM_VARNAME);
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
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
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
	public static class Var_asgContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
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
		public Var_asgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asg; }
	}

	public final Var_asgContext var_asg() throws RecognitionException {
		Var_asgContext _localctx = new Var_asgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_asg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			var_def();
			setState(74);
			match(OPERATOR_ASSIGN);
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(75);
				lit();
				}
				break;
			case 2:
				{
				setState(76);
				match(SYMBOL_OPENPAR);
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(77);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(78);
					expr_cmp();
					}
					break;
				}
				setState(81);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 3:
				{
				setState(83);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(84);
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
	public static class Var_reasgContext extends ParserRuleContext {
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
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
			setState(87);
			match(ITEM_VARNAME);
			setState(88);
			match(OPERATOR_ASSIGN);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(89);
				lit();
				}
				break;
			case 2:
				{
				setState(90);
				match(SYMBOL_OPENPAR);
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(91);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(92);
					expr_cmp();
					}
					break;
				}
				setState(95);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 3:
				{
				setState(97);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(98);
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
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
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
			setState(101);
			match(FUNCTION_CPRINT);
			setState(102);
			match(SYMBOL_OPENPAR);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 544210948L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_STRING:
				case LITERAL_BOOL:
				case LITERAL_NONE:
				case LITERAL_INTEGER:
					{
					setState(103);
					lit();
					}
					break;
				case ITEM_VARNAME:
					{
					setState(104);
					match(ITEM_VARNAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
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
			setState(112);
			match(STRUCTURE_RETURN);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(113);
				lit();
				}
				break;
			case 2:
				{
				setState(114);
				match(ITEM_VARNAME);
				}
				break;
			case 3:
				{
				setState(115);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(116);
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
	public static class StatementContext extends ParserRuleContext {
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
		public Fnc_cprintContext fnc_cprint() {
			return getRuleContext(Fnc_cprintContext.class,0);
		}
		public Stm_returnContext stm_return() {
			return getRuleContext(Stm_returnContext.class,0);
		}
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				expr_arith();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				expr_cmp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				var_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				var_asg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				var_reasg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				fnc_cprint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				stm_return();
				setState(126);
				match(SYMBOL_SEMICOLON);
				}
				break;
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
		public TerminalNode STRUCTURE_PROGRAM() { return getToken(BcodeParser.STRUCTURE_PROGRAM, 0); }
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
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
		public TerminalNode EOF() { return getToken(BcodeParser.EOF, 0); }
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
			setState(130);
			match(STRUCTURE_PROGRAM);
			setState(131);
			match(ITEM_VARNAME);
			setState(132);
			match(SYMBOL_OPENPAR);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
				{
				{
				setState(133);
				var_def();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_COMMA) {
					{
					setState(134);
					match(SYMBOL_COMMA);
					}
				}

				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(SYMBOL_CLOSEPAR);
			setState(143);
			match(STRUCTURE_RETURNS);
			setState(144);
			typ();
			setState(145);
			match(SYMBOL_OPENBRACE);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					statement();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(152);
			stm_return();
			setState(153);
			match(SYMBOL_CLOSEBRACE);
			setState(154);
			match(SYMBOL_SEMICOLON);
			setState(155);
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
			setState(157);
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
		"\u0004\u0001\u001d\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nP\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nV\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b^\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bd\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\fj\b\f\n\f\f\fm\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rv\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0081\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0088\b\u000f\u0005\u000f\u008a\b"+
		"\u000f\n\u000f\f\u000f\u008d\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0094\b\u000f\n\u000f\f\u000f\u0097"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0007"+
		"\u0001\u0000\u0003\u0006\u0001\u0000\u0007\b\u0001\u0000\n\u000f\u0001"+
		"\u0000\u0010\u0012\u0003\u0000\u0002\u0002\u0014\u0015\u001d\u001d\u0002"+
		"\u0000\u0001\u0001\u0016\u0018\u0001\u0000\u0019\u001c\u00a9\u0000\"\u0001"+
		"\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000"+
		"\u0000\u0006(\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n,\u0001"+
		"\u0000\u0000\u0000\f.\u0001\u0000\u0000\u0000\u000e2\u0001\u0000\u0000"+
		"\u0000\u0010?\u0001\u0000\u0000\u0000\u0012F\u0001\u0000\u0000\u0000\u0014"+
		"I\u0001\u0000\u0000\u0000\u0016W\u0001\u0000\u0000\u0000\u0018e\u0001"+
		"\u0000\u0000\u0000\u001ap\u0001\u0000\u0000\u0000\u001c\u0080\u0001\u0000"+
		"\u0000\u0000\u001e\u0082\u0001\u0000\u0000\u0000 \u009d\u0001\u0000\u0000"+
		"\u0000\"#\u0007\u0000\u0000\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0007"+
		"\u0001\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0007\u0002\u0000"+
		"\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0007\u0003\u0000\u0000)\u0007"+
		"\u0001\u0000\u0000\u0000*+\u0007\u0004\u0000\u0000+\t\u0001\u0000\u0000"+
		"\u0000,-\u0007\u0005\u0000\u0000-\u000b\u0001\u0000\u0000\u0000./\u0007"+
		"\u0006\u0000\u0000/\r\u0001\u0000\u0000\u000003\u0003\b\u0004\u000013"+
		"\u0005\u0016\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u000039\u0001\u0000\u0000\u000047\u0003\u0000\u0000\u000058\u0003\b\u0004"+
		"\u000068\u0005\u0016\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<\u000f\u0001\u0000\u0000\u0000=@\u0003\b\u0004\u0000>@\u0005\u0016\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AD\u0003\u0002\u0001\u0000BE\u0003\b\u0004\u0000CE\u0005\u0016"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0011"+
		"\u0001\u0000\u0000\u0000FG\u0003\f\u0006\u0000GH\u0005\u0016\u0000\u0000"+
		"H\u0013\u0001\u0000\u0000\u0000IJ\u0003\u0012\t\u0000JU\u0005\t\u0000"+
		"\u0000KV\u0003\b\u0004\u0000LO\u0005\n\u0000\u0000MP\u0003\u000e\u0007"+
		"\u0000NP\u0003\u0010\b\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u000b\u0000\u0000RV\u0001\u0000"+
		"\u0000\u0000SV\u0003\u000e\u0007\u0000TV\u0003\u0010\b\u0000UK\u0001\u0000"+
		"\u0000\u0000UL\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WX\u0005\u0016\u0000"+
		"\u0000Xc\u0005\t\u0000\u0000Yd\u0003\b\u0004\u0000Z]\u0005\n\u0000\u0000"+
		"[^\u0003\u000e\u0007\u0000\\^\u0003\u0010\b\u0000][\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u000b"+
		"\u0000\u0000`d\u0001\u0000\u0000\u0000ad\u0003\u000e\u0007\u0000bd\u0003"+
		"\u0010\b\u0000cY\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0017\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0013\u0000\u0000fk\u0005\n\u0000\u0000gj\u0003\b\u0004"+
		"\u0000hj\u0005\u0016\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"no\u0005\u000b\u0000\u0000o\u0019\u0001\u0000\u0000\u0000pu\u0005\u0012"+
		"\u0000\u0000qv\u0003\b\u0004\u0000rv\u0005\u0016\u0000\u0000sv\u0003\u000e"+
		"\u0007\u0000tv\u0003\u0010\b\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u001b"+
		"\u0001\u0000\u0000\u0000w\u0081\u0003\u000e\u0007\u0000x\u0081\u0003\u0010"+
		"\b\u0000y\u0081\u0003\u0012\t\u0000z\u0081\u0003\u0014\n\u0000{\u0081"+
		"\u0003\u0016\u000b\u0000|\u0081\u0003\u0018\f\u0000}~\u0003\u001a\r\u0000"+
		"~\u007f\u0005\u000e\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"w\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000\u0000\u0080y\u0001"+
		"\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000"+
		"\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0081"+
		"\u001d\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0010\u0000\u0000\u0083"+
		"\u0084\u0005\u0016\u0000\u0000\u0084\u008b\u0005\n\u0000\u0000\u0085\u0087"+
		"\u0003\u0012\t\u0000\u0086\u0088\u0005\u000f\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0090\u0005"+
		"\u0011\u0000\u0000\u0090\u0091\u0003\f\u0006\u0000\u0091\u0095\u0005\f"+
		"\u0000\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u001a"+
		"\r\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a\u009b\u0005\u000e\u0000"+
		"\u0000\u009b\u009c\u0005\u0000\u0000\u0001\u009c\u001f\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0003\u001e\u000f\u0000\u009e!\u0001\u0000\u0000\u0000"+
		"\u001027;?DOU]ciku\u0080\u0087\u008b\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}