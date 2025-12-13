// Generated from Bcode.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		TYPE_BOOL=26, TYPE_NONE=27, TYPE_STRING=28, LITERAL_INTEGER=29, OPERATOR_ARITH=30, 
		OPERATOR_CMP=31, SYMBOL=32, STRUCTURE=33, LITERAL=34, ITEM=35, TYPE=36;
	public static final int
		RULE_start_ = 0, RULE_expr_arith = 1, RULE_expr_cmp = 2, RULE_var_def = 3, 
		RULE_var_asg = 4, RULE_var_reasg = 5, RULE_fnc_cprint = 6, RULE_stm_return = 7, 
		RULE_statement = 8, RULE_program = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "expr_arith", "expr_cmp", "var_def", "var_asg", "var_reasg", 
			"fnc_cprint", "stm_return", "statement", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'('", 
			"')'", "'{'", "'}'", "';'", "','", "'program'", "'returns'", "'return'", 
			"'cprint'", null, "'NONE'", null, null, "'\\n'", "'int'", "'bool'", "'none'", 
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
			"TYPE_BOOL", "TYPE_NONE", "TYPE_STRING", "LITERAL_INTEGER", "OPERATOR_ARITH", 
			"OPERATOR_CMP", "SYMBOL", "STRUCTURE", "LITERAL", "ITEM", "TYPE"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterStart_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitStart_(this);
		}
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
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
	public static class Expr_arithContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL() { return getTokens(BcodeParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(BcodeParser.LITERAL, i);
		}
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
		}
		public List<TerminalNode> OPERATOR_ARITH() { return getTokens(BcodeParser.OPERATOR_ARITH); }
		public TerminalNode OPERATOR_ARITH(int i) {
			return getToken(BcodeParser.OPERATOR_ARITH, i);
		}
		public Expr_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterExpr_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitExpr_arith(this);
		}
	}

	public final Expr_arithContext expr_arith() throws RecognitionException {
		Expr_arithContext _localctx = new Expr_arithContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==ITEM_VARNAME || _la==LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				match(OPERATOR_ARITH);
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==ITEM_VARNAME || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPERATOR_ARITH );
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
		public TerminalNode OPERATOR_CMP() { return getToken(BcodeParser.OPERATOR_CMP, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(BcodeParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(BcodeParser.LITERAL, i);
		}
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==ITEM_VARNAME || _la==LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(30);
			match(OPERATOR_CMP);
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==ITEM_VARNAME || _la==LITERAL) ) {
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
	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(BcodeParser.TYPE, 0); }
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitVar_def(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(TYPE);
			setState(34);
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
		public TerminalNode LITERAL() { return getToken(BcodeParser.LITERAL, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterVar_asg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitVar_asg(this);
		}
	}

	public final Var_asgContext var_asg() throws RecognitionException {
		Var_asgContext _localctx = new Var_asgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_asg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			var_def();
			setState(37);
			match(OPERATOR_ASSIGN);
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(38);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(39);
				match(SYMBOL_OPENPAR);
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(40);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(41);
					expr_cmp();
					}
					break;
				}
				setState(44);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 3:
				{
				setState(46);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(47);
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
		public TerminalNode LITERAL() { return getToken(BcodeParser.LITERAL, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterVar_reasg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitVar_reasg(this);
		}
	}

	public final Var_reasgContext var_reasg() throws RecognitionException {
		Var_reasgContext _localctx = new Var_reasgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_reasg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ITEM_VARNAME);
			setState(51);
			match(OPERATOR_ASSIGN);
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(52);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(53);
				match(SYMBOL_OPENPAR);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(55);
					expr_cmp();
					}
					break;
				}
				setState(58);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 3:
				{
				setState(60);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(61);
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
		public List<TerminalNode> LITERAL() { return getTokens(BcodeParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(BcodeParser.LITERAL, i);
		}
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
		}
		public Fnc_cprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnc_cprint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterFnc_cprint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitFnc_cprint(this);
		}
	}

	public final Fnc_cprintContext fnc_cprint() throws RecognitionException {
		Fnc_cprintContext _localctx = new Fnc_cprintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fnc_cprint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FUNCTION_CPRINT);
			setState(65);
			match(SYMBOL_OPENPAR);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ITEM_VARNAME || _la==LITERAL) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==ITEM_VARNAME || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
		public TerminalNode LITERAL() { return getToken(BcodeParser.LITERAL, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterStm_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitStm_return(this);
		}
	}

	public final Stm_returnContext stm_return() throws RecognitionException {
		Stm_returnContext _localctx = new Stm_returnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stm_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(STRUCTURE_RETURN);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(75);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(76);
				match(ITEM_VARNAME);
				}
				break;
			case 3:
				{
				setState(77);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(78);
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
		public Fnc_cprintContext fnc_cprint() {
			return getRuleContext(Fnc_cprintContext.class,0);
		}
		public Stm_returnContext stm_return() {
			return getRuleContext(Stm_returnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(81);
				expr_arith();
				}
				break;
			case 2:
				{
				setState(82);
				expr_cmp();
				}
				break;
			case 3:
				{
				setState(83);
				var_def();
				}
				break;
			case 4:
				{
				setState(84);
				var_asg();
				}
				break;
			case 5:
				{
				setState(85);
				var_reasg();
				}
				break;
			case 6:
				{
				setState(86);
				fnc_cprint();
				}
				break;
			case 7:
				{
				setState(87);
				stm_return();
				}
				break;
			}
			setState(90);
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
		public TerminalNode STRUCTURE_PROGRAM() { return getToken(BcodeParser.STRUCTURE_PROGRAM, 0); }
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public TerminalNode STRUCTURE_RETURNS() { return getToken(BcodeParser.STRUCTURE_RETURNS, 0); }
		public TerminalNode TYPE() { return getToken(BcodeParser.TYPE, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcodeListener ) ((BcodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(STRUCTURE_PROGRAM);
			setState(93);
			match(ITEM_VARNAME);
			setState(94);
			match(SYMBOL_OPENPAR);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(95);
				var_def();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_COMMA) {
					{
					setState(96);
					match(SYMBOL_COMMA);
					}
				}

				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(SYMBOL_CLOSEPAR);
			setState(105);
			match(STRUCTURE_RETURNS);
			setState(106);
			match(TYPE);
			setState(107);
			match(SYMBOL_OPENBRACE);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					statement();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(114);
			stm_return();
			setState(115);
			match(SYMBOL_CLOSEBRACE);
			setState(116);
			match(SYMBOL_SEMICOLON);
			setState(117);
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

	public static final String _serializedATN =
		"\u0004\u0001$x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001\f\u0001\u001b\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004+\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00041\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u00059\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005?\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007P\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bY\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\tb\b\t\u0005\td\b\t\n\t\f\tg\t\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tn\b\t\n\t\f\tq\t\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0001\u0002\u0000\u0016\u0016\"\"\u0083\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001d\u0001"+
		"\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b$\u0001\u0000\u0000"+
		"\u0000\n2\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000eJ\u0001"+
		"\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0003\u0012\t\u0000\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0007\u0000\u0000\u0000\u0017\u0018\u0005\u001e\u0000"+
		"\u0000\u0018\u001a\u0007\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0007\u0000\u0000\u0000\u001e\u001f\u0005\u001f\u0000"+
		"\u0000\u001f \u0007\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!"+
		"\"\u0005$\u0000\u0000\"#\u0005\u0016\u0000\u0000#\u0007\u0001\u0000\u0000"+
		"\u0000$%\u0003\u0006\u0003\u0000%0\u0005\t\u0000\u0000&1\u0005\"\u0000"+
		"\u0000\'*\u0005\n\u0000\u0000(+\u0003\u0002\u0001\u0000)+\u0003\u0004"+
		"\u0002\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0005\u000b\u0000\u0000-1\u0001\u0000\u0000\u0000"+
		".1\u0003\u0002\u0001\u0000/1\u0003\u0004\u0002\u00000&\u0001\u0000\u0000"+
		"\u00000\'\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000"+
		"\u0000\u00001\t\u0001\u0000\u0000\u000023\u0005\u0016\u0000\u00003>\u0005"+
		"\t\u0000\u00004?\u0005\"\u0000\u000058\u0005\n\u0000\u000069\u0003\u0002"+
		"\u0001\u000079\u0003\u0004\u0002\u000086\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\u000b\u0000\u0000"+
		";?\u0001\u0000\u0000\u0000<?\u0003\u0002\u0001\u0000=?\u0003\u0004\u0002"+
		"\u0000>4\u0001\u0000\u0000\u0000>5\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?\u000b\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0013\u0000\u0000AE\u0005\n\u0000\u0000BD\u0007\u0000\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HI\u0005\u000b\u0000\u0000I\r\u0001\u0000\u0000\u0000JO\u0005"+
		"\u0012\u0000\u0000KP\u0005\"\u0000\u0000LP\u0005\u0016\u0000\u0000MP\u0003"+
		"\u0002\u0001\u0000NP\u0003\u0004\u0002\u0000OK\u0001\u0000\u0000\u0000"+
		"OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000P\u000f\u0001\u0000\u0000\u0000QY\u0003\u0002\u0001\u0000RY\u0003"+
		"\u0004\u0002\u0000SY\u0003\u0006\u0003\u0000TY\u0003\b\u0004\u0000UY\u0003"+
		"\n\u0005\u0000VY\u0003\f\u0006\u0000WY\u0003\u000e\u0007\u0000XQ\u0001"+
		"\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\u000e"+
		"\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\u0005\u0010\u0000\u0000"+
		"]^\u0005\u0016\u0000\u0000^e\u0005\n\u0000\u0000_a\u0003\u0006\u0003\u0000"+
		"`b\u0005\u000f\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000dg\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\u000b\u0000\u0000"+
		"ij\u0005\u0011\u0000\u0000jk\u0005$\u0000\u0000ko\u0005\f\u0000\u0000"+
		"ln\u0003\u0010\b\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0003\u000e\u0007\u0000st\u0005\r\u0000"+
		"\u0000tu\u0005\u000e\u0000\u0000uv\u0005\u0000\u0000\u0001v\u0013\u0001"+
		"\u0000\u0000\u0000\u000b\u001b*08>EOXaeo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}