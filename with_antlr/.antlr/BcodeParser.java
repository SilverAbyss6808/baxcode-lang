// Generated from c:/School/Honors Contracts/baxcode/with_antlr/Bcode.g4 by ANTLR 4.13.1
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
		OPERATOR_ADD=1, OPERATOR_SUBTR=2, OPERATOR_MULT=3, OPERATOR_DIV=4, OPERATOR_GTHAN=5, 
		OPERATOR_LTHAN=6, OPERATOR_ASSIGN=7, SYMBOL_OPENPAR=8, SYMBOL_CLOSEPAR=9, 
		SYMBOL_OPENBRACE=10, SYMBOL_CLOSEBRACE=11, SYMBOL_SEMICOLON=12, SYMBOL_COMMA=13, 
		STRUCTURE_PROGRAM=14, STRUCTURE_RETURNS=15, STRUCTURE_RETURN=16, FUNCTION_BASEROUND=17, 
		LITERAL_BOOL=18, LITERAL_NONE=19, LITERAL_STRING=20, LITERAL_INTEGER=21, 
		ITEM_VARNAME=22, ITEM_COMMENT=23, ITEM_WHITESPACE=24, ITEM_NEWLINE=25, 
		TYPE_INTEGER=26, TYPE_BOOL=27, TYPE_NONE=28, TYPE_STRING=29, OPERATOR=30, 
		SYMBOL=31, STRUCTURE=32, FUNCTION=33, LITERAL=34, ITEM=35, TYPE=36, STRUCTURE_FUNCTION=37;
	public static final int
		RULE_act_operator = 0, RULE_act_var_definition_noassign = 1, RULE_act_var_definition_assign = 2, 
		RULE_act_structure_def = 3, RULE_act_function_def = 4, RULE_act_program_def = 5, 
		RULE_action = 6, RULE_statement = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"act_operator", "act_var_definition_noassign", "act_var_definition_assign", 
			"act_structure_def", "act_function_def", "act_program_def", "action", 
			"statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'('", "')'", 
			"'{'", "'}'", "';'", "','", "'program'", "'returns'", "'return'", "'round'", 
			null, "'NONE'", null, null, null, "'//'", null, "'\\n'", "'int'", "'bool'", 
			"'none'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR_ADD", "OPERATOR_SUBTR", "OPERATOR_MULT", "OPERATOR_DIV", 
			"OPERATOR_GTHAN", "OPERATOR_LTHAN", "OPERATOR_ASSIGN", "SYMBOL_OPENPAR", 
			"SYMBOL_CLOSEPAR", "SYMBOL_OPENBRACE", "SYMBOL_CLOSEBRACE", "SYMBOL_SEMICOLON", 
			"SYMBOL_COMMA", "STRUCTURE_PROGRAM", "STRUCTURE_RETURNS", "STRUCTURE_RETURN", 
			"FUNCTION_BASEROUND", "LITERAL_BOOL", "LITERAL_NONE", "LITERAL_STRING", 
			"LITERAL_INTEGER", "ITEM_VARNAME", "ITEM_COMMENT", "ITEM_WHITESPACE", 
			"ITEM_NEWLINE", "TYPE_INTEGER", "TYPE_BOOL", "TYPE_NONE", "TYPE_STRING", 
			"OPERATOR", "SYMBOL", "STRUCTURE", "FUNCTION", "LITERAL", "ITEM", "TYPE", 
			"STRUCTURE_FUNCTION"
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
	public static class Act_operatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(BcodeParser.OPERATOR, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(BcodeParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(BcodeParser.LITERAL, i);
		}
		public List<TerminalNode> ITEM_VARNAME() { return getTokens(BcodeParser.ITEM_VARNAME); }
		public TerminalNode ITEM_VARNAME(int i) {
			return getToken(BcodeParser.ITEM_VARNAME, i);
		}
		public Act_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_operator; }
	}

	public final Act_operatorContext act_operator() throws RecognitionException {
		Act_operatorContext _localctx = new Act_operatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_act_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==ITEM_VARNAME || _la==LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(17);
			match(OPERATOR);
			setState(18);
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
	public static class Act_var_definition_noassignContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(BcodeParser.TYPE, 0); }
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public Act_var_definition_noassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_var_definition_noassign; }
	}

	public final Act_var_definition_noassignContext act_var_definition_noassign() throws RecognitionException {
		Act_var_definition_noassignContext _localctx = new Act_var_definition_noassignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_act_var_definition_noassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(TYPE);
			setState(21);
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
	public static class Act_var_definition_assignContext extends ParserRuleContext {
		public Act_var_definition_noassignContext act_var_definition_noassign() {
			return getRuleContext(Act_var_definition_noassignContext.class,0);
		}
		public TerminalNode OPERATOR_ASSIGN() { return getToken(BcodeParser.OPERATOR_ASSIGN, 0); }
		public TerminalNode LITERAL() { return getToken(BcodeParser.LITERAL, 0); }
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public Act_operatorContext act_operator() {
			return getRuleContext(Act_operatorContext.class,0);
		}
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public Act_var_definition_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_var_definition_assign; }
	}

	public final Act_var_definition_assignContext act_var_definition_assign() throws RecognitionException {
		Act_var_definition_assignContext _localctx = new Act_var_definition_assignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_act_var_definition_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			act_var_definition_noassign();
			setState(24);
			match(OPERATOR_ASSIGN);
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				{
				setState(25);
				match(LITERAL);
				}
				break;
			case SYMBOL_OPENPAR:
				{
				setState(26);
				match(SYMBOL_OPENPAR);
				setState(27);
				act_operator();
				setState(28);
				match(SYMBOL_CLOSEPAR);
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
	public static class Act_structure_defContext extends ParserRuleContext {
		public TerminalNode ITEM_VARNAME() { return getToken(BcodeParser.ITEM_VARNAME, 0); }
		public TerminalNode SYMBOL_OPENPAR() { return getToken(BcodeParser.SYMBOL_OPENPAR, 0); }
		public TerminalNode SYMBOL_CLOSEPAR() { return getToken(BcodeParser.SYMBOL_CLOSEPAR, 0); }
		public TerminalNode SYMBOL_OPENBRACE() { return getToken(BcodeParser.SYMBOL_OPENBRACE, 0); }
		public TerminalNode SYMBOL_CLOSEBRACE() { return getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0); }
		public List<Act_var_definition_noassignContext> act_var_definition_noassign() {
			return getRuleContexts(Act_var_definition_noassignContext.class);
		}
		public Act_var_definition_noassignContext act_var_definition_noassign(int i) {
			return getRuleContext(Act_var_definition_noassignContext.class,i);
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
		public Act_structure_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_structure_def; }
	}

	public final Act_structure_defContext act_structure_def() throws RecognitionException {
		Act_structure_defContext _localctx = new Act_structure_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_act_structure_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ITEM_VARNAME);
			setState(33);
			match(SYMBOL_OPENPAR);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(34);
				act_var_definition_noassign();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMBOL_COMMA) {
					{
					setState(35);
					match(SYMBOL_COMMA);
					}
				}

				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(SYMBOL_CLOSEPAR);
			setState(44);
			match(SYMBOL_OPENBRACE);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_SEMICOLON) {
				{
				{
				setState(45);
				statement();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(SYMBOL_CLOSEBRACE);
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
	public static class Act_function_defContext extends ParserRuleContext {
		public TerminalNode STRUCTURE_FUNCTION() { return getToken(BcodeParser.STRUCTURE_FUNCTION, 0); }
		public Act_structure_defContext act_structure_def() {
			return getRuleContext(Act_structure_defContext.class,0);
		}
		public Act_function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_function_def; }
	}

	public final Act_function_defContext act_function_def() throws RecognitionException {
		Act_function_defContext _localctx = new Act_function_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_act_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(STRUCTURE_FUNCTION);
			setState(54);
			act_structure_def();
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
	public static class Act_program_defContext extends ParserRuleContext {
		public TerminalNode STRUCTURE_PROGRAM() { return getToken(BcodeParser.STRUCTURE_PROGRAM, 0); }
		public Act_structure_defContext act_structure_def() {
			return getRuleContext(Act_structure_defContext.class,0);
		}
		public Act_program_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_program_def; }
	}

	public final Act_program_defContext act_program_def() throws RecognitionException {
		Act_program_defContext _localctx = new Act_program_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_act_program_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(STRUCTURE_PROGRAM);
			setState(57);
			act_structure_def();
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
	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode SYMBOL_SEMICOLON() { return getToken(BcodeParser.SYMBOL_SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			action();
			setState(62);
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

	public static final String _serializedATN =
		"\u0004\u0001%A\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003%\b\u0003\u0005\u0003\'\b\u0003\n\u0003\f\u0003"+
		"*\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003"+
		"\f\u00032\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0001\u0002\u0000\u0016\u0016\"\"<\u0000\u0010"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0017"+
		"\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b5\u0001\u0000"+
		"\u0000\u0000\n8\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e"+
		"=\u0001\u0000\u0000\u0000\u0010\u0011\u0007\u0000\u0000\u0000\u0011\u0012"+
		"\u0005\u001e\u0000\u0000\u0012\u0013\u0007\u0000\u0000\u0000\u0013\u0001"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0005$\u0000\u0000\u0015\u0016\u0005"+
		"\u0016\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0003"+
		"\u0002\u0001\u0000\u0018\u001e\u0005\u0007\u0000\u0000\u0019\u001f\u0005"+
		"\"\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000\u001b\u001c\u0003\u0000"+
		"\u0000\u0000\u001c\u001d\u0005\t\u0000\u0000\u001d\u001f\u0001\u0000\u0000"+
		"\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000"+
		"\u0000\u001f\u0005\u0001\u0000\u0000\u0000 !\u0005\u0016\u0000\u0000!"+
		"(\u0005\b\u0000\u0000\"$\u0003\u0002\u0001\u0000#%\u0005\r\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000"+
		"\u0000&\"\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000+,\u0005\t\u0000\u0000,0\u0005\n\u0000\u0000-/\u0003"+
		"\u000e\u0007\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000034\u0005\u000b\u0000\u00004\u0007\u0001"+
		"\u0000\u0000\u000056\u0005%\u0000\u000067\u0003\u0006\u0003\u00007\t\u0001"+
		"\u0000\u0000\u000089\u0005\u000e\u0000\u00009:\u0003\u0006\u0003\u0000"+
		":\u000b\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\r\u0001\u0000"+
		"\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005\f\u0000\u0000?\u000f\u0001"+
		"\u0000\u0000\u0000\u0004\u001e$(0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}