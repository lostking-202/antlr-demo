// Generated from t4/Feature.g4 by ANTLR 4.9.2
package t4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FeatureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DAY=8, LIMIT=9, 
		SECOND=10, MULTI_DIRECT=11, BINARY_LABEL=12, ORIGINAL=13, TIMEDIFF=14, 
		ISIN=15, COMBINE=16, DAYOFWEEK=17, HOUROFDAY=18, ISWEEKDAY=19, WINDOW_SUM=20, 
		STRING=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DAY", "LIMIT", 
			"SECOND", "MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", "TIMEDIFF", "ISIN", 
			"COMBINE", "DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", "WINDOW_SUM", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'d:'", "':'", "'s'", null, null, null, 
			"'multi_direct'", "'binary_label'", "'original'", "'timediff'", "'isin'", 
			"'combine'", "'dayofweek'", "'hourofday'", "'isweekday'", "'window_sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DAY", "LIMIT", "SECOND", 
			"MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", "TIMEDIFF", "ISIN", "COMBINE", 
			"DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", "WINDOW_SUM", "STRING"
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


	public FeatureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Feature.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t?\n\t\f\t\16\tB\13\t\3"+
		"\n\7\nE\n\n\f\n\16\nH\13\n\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00b5\n\26\f\26"+
		"\16\26\u00b8\13\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\3\2\63"+
		";\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2"+
		"\13\65\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23F\3\2\2\2\25I\3\2"+
		"\2\2\27P\3\2\2\2\31]\3\2\2\2\33j\3\2\2\2\35s\3\2\2\2\37|\3\2\2\2!\u0081"+
		"\3\2\2\2#\u0089\3\2\2\2%\u0093\3\2\2\2\'\u009d\3\2\2\2)\u00a7\3\2\2\2"+
		"+\u00b2\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7.\2"+
		"\2\62\b\3\2\2\2\63\64\7\60\2\2\64\n\3\2\2\2\65\66\7f\2\2\66\67\7<\2\2"+
		"\67\f\3\2\2\289\7<\2\29\16\3\2\2\2:;\7u\2\2;\20\3\2\2\2<@\t\2\2\2=?\t"+
		"\3\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\22\3\2\2\2B@\3\2\2\2C"+
		"E\t\3\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\24\3\2\2\2HF\3\2\2"+
		"\2IM\t\2\2\2JL\t\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\26\3\2"+
		"\2\2OM\3\2\2\2PQ\7o\2\2QR\7w\2\2RS\7n\2\2ST\7v\2\2TU\7k\2\2UV\7a\2\2V"+
		"W\7f\2\2WX\7k\2\2XY\7t\2\2YZ\7g\2\2Z[\7e\2\2[\\\7v\2\2\\\30\3\2\2\2]^"+
		"\7d\2\2^_\7k\2\2_`\7p\2\2`a\7c\2\2ab\7t\2\2bc\7{\2\2cd\7a\2\2de\7n\2\2"+
		"ef\7c\2\2fg\7d\2\2gh\7g\2\2hi\7n\2\2i\32\3\2\2\2jk\7q\2\2kl\7t\2\2lm\7"+
		"k\2\2mn\7i\2\2no\7k\2\2op\7p\2\2pq\7c\2\2qr\7n\2\2r\34\3\2\2\2st\7v\2"+
		"\2tu\7k\2\2uv\7o\2\2vw\7g\2\2wx\7f\2\2xy\7k\2\2yz\7h\2\2z{\7h\2\2{\36"+
		"\3\2\2\2|}\7k\2\2}~\7u\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080 \3\2\2\2"+
		"\u0081\u0082\7e\2\2\u0082\u0083\7q\2\2\u0083\u0084\7o\2\2\u0084\u0085"+
		"\7d\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7g\2\2\u0088"+
		"\"\3\2\2\2\u0089\u008a\7f\2\2\u008a\u008b\7c\2\2\u008b\u008c\7{\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7h\2\2\u008e\u008f\7y\2\2\u008f\u0090\7g\2\2"+
		"\u0090\u0091\7g\2\2\u0091\u0092\7m\2\2\u0092$\3\2\2\2\u0093\u0094\7j\2"+
		"\2\u0094\u0095\7q\2\2\u0095\u0096\7w\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7h\2\2\u0099\u009a\7f\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7{\2\2\u009c&\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7y\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7m\2\2"+
		"\u00a3\u00a4\7f\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7{\2\2\u00a6(\3\2\2"+
		"\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7f\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7a\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7o\2\2\u00b1*\3\2\2\2\u00b2"+
		"\u00b6\t\4\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7,\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\7\2@FM\u00b6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}