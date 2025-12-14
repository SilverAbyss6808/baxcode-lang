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
		RULE_start_ = 0, RULE_program = 1, RULE_statement = 2, RULE_expr_arith = 3, 
		RULE_expr_cmp = 4, RULE_var_def = 5, RULE_var_asg = 6, RULE_var_reasg = 7, 
		RULE_fnc_cprint = 8, RULE_stm_return = 9, RULE_opr_arith = 10, RULE_opr_cmp = 11, 
		RULE_sym = 12, RULE_str = 13, RULE_lit = 14, RULE_var = 15, RULE_typ = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "program", "statement", "expr_arith", "expr_cmp", "var_def", 
			"var_asg", "var_reasg", "fnc_cprint", "stm_return", "opr_arith", "opr_cmp", 
			"sym", "str", "lit", "var", "typ"
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
			setState(34);
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
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			var();
			setState(38);
			match(SYMBOL_OPENPAR);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
				{
				{
				setState(39);
				var_def();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_COMMA) {
					{
					setState(40);
					match(SYMBOL_COMMA);
					}
				}

				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(SYMBOL_CLOSEPAR);
			setState(49);
			match(STRUCTURE_RETURNS);
			setState(50);
			typ();
			setState(51);
			match(SYMBOL_OPENBRACE);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(52);
					statement();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(58);
			stm_return();
			setState(59);
			match(SYMBOL_CLOSEBRACE);
			setState(60);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(62);
				expr_arith();
				}
				break;
			case 2:
				{
				setState(63);
				expr_cmp();
				}
				break;
			case 3:
				{
				setState(64);
				var_def();
				}
				break;
			case 4:
				{
				setState(65);
				var_asg();
				}
				break;
			case 5:
				{
				setState(66);
				var_reasg();
				}
				break;
			case 6:
				{
				setState(67);
				var();
				}
				break;
			case 7:
				{
				setState(68);
				fnc_cprint();
				}
				break;
			}
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
		enterRule(_localctx, 6, RULE_expr_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_STRING:
			case LITERAL_BOOL:
			case LITERAL_NONE:
			case LITERAL_INTEGER:
				{
				setState(73);
				lit();
				}
				break;
			case ITEM_VARNAME:
				{
				setState(74);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				opr_arith();
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_STRING:
				case LITERAL_BOOL:
				case LITERAL_NONE:
				case LITERAL_INTEGER:
					{
					setState(78);
					lit();
					}
					break;
				case ITEM_VARNAME:
					{
					setState(79);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(84); 
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
		enterRule(_localctx, 8, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_STRING:
			case LITERAL_BOOL:
			case LITERAL_NONE:
			case LITERAL_INTEGER:
				{
				setState(86);
				lit();
				}
				break;
			case ITEM_VARNAME:
				{
				setState(87);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			opr_cmp();
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_STRING:
			case LITERAL_BOOL:
			case LITERAL_NONE:
			case LITERAL_INTEGER:
				{
				setState(91);
				lit();
				}
				break;
			case ITEM_VARNAME:
				{
				setState(92);
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
		enterRule(_localctx, 10, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			typ();
			setState(96);
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
		enterRule(_localctx, 12, RULE_var_asg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			var_def();
			setState(99);
			match(OPERATOR_ASSIGN);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(100);
				lit();
				}
				break;
			case 2:
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_OPENPAR) {
					{
					setState(101);
					match(SYMBOL_OPENPAR);
					}
				}

				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(104);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(105);
					expr_cmp();
					}
					break;
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_CLOSEPAR) {
					{
					setState(108);
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
		enterRule(_localctx, 14, RULE_var_reasg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			var();
			setState(114);
			match(OPERATOR_ASSIGN);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(115);
				lit();
				}
				break;
			case 2:
				{
				setState(116);
				match(SYMBOL_OPENPAR);
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(117);
					expr_arith();
					}
					break;
				case 2:
					{
					setState(118);
					expr_cmp();
					}
					break;
				}
				setState(121);
				match(SYMBOL_CLOSEPAR);
				}
				break;
			case 3:
				{
				setState(123);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(124);
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
		enterRule(_localctx, 16, RULE_fnc_cprint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FUNCTION_CPRINT);
			setState(128);
			match(SYMBOL_OPENPAR);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566231072L) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_STRING:
				case LITERAL_BOOL:
				case LITERAL_NONE:
				case LITERAL_INTEGER:
					{
					setState(129);
					lit();
					}
					break;
				case ITEM_VARNAME:
					{
					setState(130);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		enterRule(_localctx, 18, RULE_stm_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(STRUCTURE_RETURN);
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(139);
				lit();
				}
				break;
			case 2:
				{
				setState(140);
				var();
				}
				break;
			case 3:
				{
				setState(141);
				expr_arith();
				}
				break;
			case 4:
				{
				setState(142);
				expr_cmp();
				}
				break;
			}
			setState(145);
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
		enterRule(_localctx, 20, RULE_opr_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 22, RULE_opr_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 24, RULE_sym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 26, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 28, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 30, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 32, RULE_typ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0005"+
		"\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003"+
		"\u0004\u0003S\b\u0003\u000b\u0003\f\u0003T\u0001\u0004\u0001\u0004\u0003"+
		"\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004^\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"k\b\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0003\u0006p\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007x\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007~\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0084\b\b\n\b"+
		"\f\b\u0087\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u0090\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u00017\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0006\u0001\u0000\u0006\t\u0001\u0000\n\u000b\u0001\u0000\r\u0012"+
		"\u0001\u0000\u0013\u0014\u0003\u0000\u0005\u0005\u0016\u0017\u001d\u001d"+
		"\u0001\u0000\u0019\u001c\u00ab\u0000\"\u0001\u0000\u0000\u0000\u0002$"+
		"\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006K\u0001\u0000"+
		"\u0000\u0000\bX\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fb"+
		"\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010\u007f\u0001"+
		"\u0000\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u0093\u0001"+
		"\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u0097\u0001"+
		"\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u009b\u0001"+
		"\u0000\u0000\u0000\u001e\u009d\u0001\u0000\u0000\u0000 \u009f\u0001\u0000"+
		"\u0000\u0000\"#\u0003\u0002\u0001\u0000#\u0001\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0001\u0000\u0000%&\u0003\u001e\u000f\u0000&-\u0005\r\u0000\u0000"+
		"\')\u0003\n\u0005\u0000(*\u0005\u0012\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"01\u0005\u000e\u0000\u000012\u0005\u0013\u0000\u000023\u0003 \u0010\u0000"+
		"37\u0005\u000f\u0000\u000046\u0003\u0004\u0002\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003"+
		"\u0012\t\u0000;<\u0005\u0010\u0000\u0000<=\u0005\u0011\u0000\u0000=\u0003"+
		"\u0001\u0000\u0000\u0000>F\u0003\u0006\u0003\u0000?F\u0003\b\u0004\u0000"+
		"@F\u0003\n\u0005\u0000AF\u0003\f\u0006\u0000BF\u0003\u000e\u0007\u0000"+
		"CF\u0003\u001e\u000f\u0000DF\u0003\u0010\b\u0000E>\u0001\u0000\u0000\u0000"+
		"E?\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000"+
		"\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0011\u0000\u0000H\u0005"+
		"\u0001\u0000\u0000\u0000IL\u0003\u001c\u000e\u0000JL\u0003\u001e\u000f"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LR\u0001\u0000"+
		"\u0000\u0000MP\u0003\u0014\n\u0000NQ\u0003\u001c\u000e\u0000OQ\u0003\u001e"+
		"\u000f\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QS\u0001"+
		"\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0007\u0001\u0000"+
		"\u0000\u0000VY\u0003\u001c\u000e\u0000WY\u0003\u001e\u000f\u0000XV\u0001"+
		"\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z]\u0003\u0016\u000b\u0000[^\u0003\u001c\u000e\u0000\\^\u0003\u001e\u000f"+
		"\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\t\u0001\u0000"+
		"\u0000\u0000_`\u0003 \u0010\u0000`a\u0003\u001e\u000f\u0000a\u000b\u0001"+
		"\u0000\u0000\u0000bc\u0003\n\u0005\u0000co\u0005\f\u0000\u0000dp\u0003"+
		"\u001c\u000e\u0000eg\u0005\r\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hk\u0003\u0006\u0003\u0000"+
		"ik\u0003\b\u0004\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000ln\u0005\u000e\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000od\u0001\u0000"+
		"\u0000\u0000of\u0001\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u0003"+
		"\u001e\u000f\u0000r}\u0005\f\u0000\u0000s~\u0003\u001c\u000e\u0000tw\u0005"+
		"\r\u0000\u0000ux\u0003\u0006\u0003\u0000vx\u0003\b\u0004\u0000wu\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0005\u000e\u0000\u0000z~\u0001\u0000\u0000\u0000{~\u0003\u0006\u0003"+
		"\u0000|~\u0003\b\u0004\u0000}s\u0001\u0000\u0000\u0000}t\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u000f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u0015\u0000\u0000\u0080\u0085\u0005"+
		"\r\u0000\u0000\u0081\u0084\u0003\u001c\u000e\u0000\u0082\u0084\u0003\u001e"+
		"\u000f\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000e"+
		"\u0000\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008f\u0005\u0014"+
		"\u0000\u0000\u008b\u0090\u0003\u001c\u000e\u0000\u008c\u0090\u0003\u001e"+
		"\u000f\u0000\u008d\u0090\u0003\u0006\u0003\u0000\u008e\u0090\u0003\b\u0004"+
		"\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0011\u0000"+
		"\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000\u0000"+
		"\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0001\u0000"+
		"\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0002\u0000"+
		"\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0003\u0000"+
		"\u0000\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0004\u0000"+
		"\u0000\u009c\u001d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0018\u0000"+
		"\u0000\u009e\u001f\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0005\u0000"+
		"\u0000\u00a0!\u0001\u0000\u0000\u0000\u0012)-7EKPTX]fjmow}\u0083\u0085"+
		"\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}