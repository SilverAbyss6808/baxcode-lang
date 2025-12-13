// Generated from c:/random downloads/Code/Python/baxcode-lang/Bcode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BcodeLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ITEM_COMMENT", "LITERAL_STRING", "OPERATOR_ADD", "OPERATOR_SUBTR", "OPERATOR_MULT", 
			"OPERATOR_DIV", "OPERATOR_GTHAN", "OPERATOR_LTHAN", "OPERATOR_ASSIGN", 
			"SYMBOL_OPENPAR", "SYMBOL_CLOSEPAR", "SYMBOL_OPENBRACE", "SYMBOL_CLOSEBRACE", 
			"SYMBOL_SEMICOLON", "SYMBOL_COMMA", "STRUCTURE_PROGRAM", "STRUCTURE_RETURNS", 
			"STRUCTURE_RETURN", "FUNCTION_CPRINT", "LITERAL_BOOL", "LITERAL_NONE", 
			"ITEM_VARNAME", "ITEM_WHITESPACE", "ITEM_NEWLINE", "TYPE_INTEGER", "TYPE_BOOL", 
			"TYPE_NONE", "TYPE_STRING", "LITERAL_INTEGER"
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


	public BcodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bcode.g4"; }

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
		"\u0004\u0000\u001d\u00b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0088"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0091\b\u0015\n\u0015\f\u0015\u0094\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0004\u001c\u00b4\b\u001c\u000b\u001c\f\u001c\u00b5\u0000\u0000\u001d"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0006\u0001\u0000"+
		"\n\n\u0001\u0000AZ\u0004\u000009AZ__az\u0002\u0000\t\t  \u0002\u0000\n"+
		"\n\r\r\u0001\u000009\u00b9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001"+
		"\u0000\u0000\u0000\u0003B\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000"+
		"\u0000\u0007H\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000b"+
		"L\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fP\u0001\u0000"+
		"\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000"+
		"\u0015V\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019Z"+
		"\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000\u001d^\u0001"+
		"\u0000\u0000\u0000\u001f`\u0001\u0000\u0000\u0000!h\u0001\u0000\u0000"+
		"\u0000#p\u0001\u0000\u0000\u0000%w\u0001\u0000\u0000\u0000\'\u0087\u0001"+
		"\u0000\u0000\u0000)\u0089\u0001\u0000\u0000\u0000+\u008e\u0001\u0000\u0000"+
		"\u0000-\u0095\u0001\u0000\u0000\u0000/\u0099\u0001\u0000\u0000\u00001"+
		"\u009d\u0001\u0000\u0000\u00003\u00a1\u0001\u0000\u0000\u00005\u00a6\u0001"+
		"\u0000\u0000\u00007\u00ab\u0001\u0000\u0000\u00009\u00b3\u0001\u0000\u0000"+
		"\u0000;<\u0005/\u0000\u0000<=\u0005/\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">?\b\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0000\u0000\u0000"+
		"A\u0002\u0001\u0000\u0000\u0000BC\u0005\"\u0000\u0000CD\b\u0000\u0000"+
		"\u0000DE\u0005\"\u0000\u0000E\u0004\u0001\u0000\u0000\u0000FG\u0005+\u0000"+
		"\u0000G\u0006\u0001\u0000\u0000\u0000HI\u0005-\u0000\u0000I\b\u0001\u0000"+
		"\u0000\u0000JK\u0005*\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005/"+
		"\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005>\u0000\u0000O\u000e\u0001"+
		"\u0000\u0000\u0000PQ\u0005<\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000"+
		"RS\u0005=\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005(\u0000\u0000"+
		"U\u0014\u0001\u0000\u0000\u0000VW\u0005)\u0000\u0000W\u0016\u0001\u0000"+
		"\u0000\u0000XY\u0005{\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000Z[\u0005"+
		"}\u0000\u0000[\u001a\u0001\u0000\u0000\u0000\\]\u0005;\u0000\u0000]\u001c"+
		"\u0001\u0000\u0000\u0000^_\u0005,\u0000\u0000_\u001e\u0001\u0000\u0000"+
		"\u0000`a\u0005p\u0000\u0000ab\u0005r\u0000\u0000bc\u0005o\u0000\u0000"+
		"cd\u0005g\u0000\u0000de\u0005r\u0000\u0000ef\u0005a\u0000\u0000fg\u0005"+
		"m\u0000\u0000g \u0001\u0000\u0000\u0000hi\u0005r\u0000\u0000ij\u0005e"+
		"\u0000\u0000jk\u0005t\u0000\u0000kl\u0005u\u0000\u0000lm\u0005r\u0000"+
		"\u0000mn\u0005n\u0000\u0000no\u0005s\u0000\u0000o\"\u0001\u0000\u0000"+
		"\u0000pq\u0005r\u0000\u0000qr\u0005e\u0000\u0000rs\u0005t\u0000\u0000"+
		"st\u0005u\u0000\u0000tu\u0005r\u0000\u0000uv\u0005n\u0000\u0000v$\u0001"+
		"\u0000\u0000\u0000wx\u0005c\u0000\u0000xy\u0005p\u0000\u0000yz\u0005r"+
		"\u0000\u0000z{\u0005i\u0000\u0000{|\u0005n\u0000\u0000|}\u0005t\u0000"+
		"\u0000}&\u0001\u0000\u0000\u0000~\u007f\u0005T\u0000\u0000\u007f\u0080"+
		"\u0005R\u0000\u0000\u0080\u0081\u0005U\u0000\u0000\u0081\u0088\u0005E"+
		"\u0000\u0000\u0082\u0083\u0005F\u0000\u0000\u0083\u0084\u0005A\u0000\u0000"+
		"\u0084\u0085\u0005L\u0000\u0000\u0085\u0086\u0005S\u0000\u0000\u0086\u0088"+
		"\u0005E\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000"+
		"\u0000\u0000\u0088(\u0001\u0000\u0000\u0000\u0089\u008a\u0005N\u0000\u0000"+
		"\u008a\u008b\u0005O\u0000\u0000\u008b\u008c\u0005N\u0000\u0000\u008c\u008d"+
		"\u0005E\u0000\u0000\u008d*\u0001\u0000\u0000\u0000\u008e\u0092\u0007\u0001"+
		"\u0000\u0000\u008f\u0091\u0007\u0002\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093,\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0003\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u0016\u0000"+
		"\u0000\u0098.\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0004\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0006\u0017\u0000\u0000"+
		"\u009c0\u0001\u0000\u0000\u0000\u009d\u009e\u0005i\u0000\u0000\u009e\u009f"+
		"\u0005n\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a02\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005b\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000"+
		"\u00a3\u00a4\u0005o\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a54"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005n\u0000\u0000\u00a7\u00a8\u0005"+
		"o\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00aa\u0005e\u0000"+
		"\u0000\u00aa6\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005s\u0000\u0000\u00ac"+
		"\u00ad\u0005t\u0000\u0000\u00ad\u00ae\u0005r\u0000\u0000\u00ae\u00af\u0005"+
		"i\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005g\u0000"+
		"\u0000\u00b18\u0001\u0000\u0000\u0000\u00b2\u00b4\u0007\u0005\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6:\u0001\u0000\u0000\u0000\u0004\u0000\u0087\u0092\u00b5\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}