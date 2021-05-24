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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SUBTRACT=8, MULTIPLY=9, 
		DIVIDE=10, ADD=11, LOG=12, REGRESSION_LABEL=13, SPLIT=14, SPLIT_KEY=15, 
		WINDOW_MAX=16, WINDOW_MIN=17, WINDOW_AVG=18, WINDOW_UNIQUE_COUNT=19, WINDOW_COUNT=20, 
		WINDOW_TOP1_RATIO=21, DAY=22, LIMIT=23, SECOND=24, MULTI_DIRECT=25, BINARY_LABEL=26, 
		ORIGINAL=27, TIMEDIFF=28, ISIN=29, COMBINE=30, DAYOFWEEK=31, HOUROFDAY=32, 
		ISWEEKDAY=33, WINDOW_SUM=34, STRING=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "ADD", "LOG", "REGRESSION_LABEL", "SPLIT", "SPLIT_KEY", "WINDOW_MAX", 
			"WINDOW_MIN", "WINDOW_AVG", "WINDOW_UNIQUE_COUNT", "WINDOW_COUNT", "WINDOW_TOP1_RATIO", 
			"DAY", "LIMIT", "SECOND", "MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", 
			"TIMEDIFF", "ISIN", "COMBINE", "DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", 
			"WINDOW_SUM", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'d:'", "':'", "'s'", "'subtract'", 
			"'multiply'", "'divide'", "'add'", "'log'", "'regression_label'", "'split'", 
			"'split_key'", "'window_max'", "'window_min'", "'window_avg'", "'window_unique_count'", 
			"'window_count'", "'window_top1_ratio'", null, null, null, "'multi_direct'", 
			"'binary_label'", "'original'", "'timediff'", "'isin'", "'combine'", 
			"'dayofweek'", "'hourofday'", "'isweekday'", "'window_sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "ADD", "LOG", "REGRESSION_LABEL", "SPLIT", "SPLIT_KEY", "WINDOW_MAX", 
			"WINDOW_MIN", "WINDOW_AVG", "WINDOW_UNIQUE_COUNT", "WINDOW_COUNT", "WINDOW_TOP1_RATIO", 
			"DAY", "LIMIT", "SECOND", "MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", 
			"TIMEDIFF", "ISIN", "COMBINE", "DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", 
			"WINDOW_SUM", "STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00f1\n\27\f\27"+
		"\16\27\u00f4\13\27\3\30\3\30\7\30\u00f8\n\30\f\30\16\30\u00fb\13\30\3"+
		"\31\3\31\7\31\u00ff\n\31\f\31\16\31\u0102\13\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\7$\u0168\n$\f$\16"+
		"$\u016b\13$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;"+
		"C\\aac|\2\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2"+
		"\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23a\3\2\2\2\25j\3\2\2\2\27q\3"+
		"\2\2\2\31u\3\2\2\2\33y\3\2\2\2\35\u008a\3\2\2\2\37\u0090\3\2\2\2!\u009a"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00b0\3\2\2\2\'\u00bb\3\2\2\2)\u00cf\3\2\2\2"+
		"+\u00dc\3\2\2\2-\u00ee\3\2\2\2/\u00f5\3\2\2\2\61\u00fc\3\2\2\2\63\u0103"+
		"\3\2\2\2\65\u0110\3\2\2\2\67\u011d\3\2\2\29\u0126\3\2\2\2;\u012f\3\2\2"+
		"\2=\u0134\3\2\2\2?\u013c\3\2\2\2A\u0146\3\2\2\2C\u0150\3\2\2\2E\u015a"+
		"\3\2\2\2G\u0165\3\2\2\2IJ\7*\2\2J\4\3\2\2\2KL\7+\2\2L\6\3\2\2\2MN\7.\2"+
		"\2N\b\3\2\2\2OP\7\60\2\2P\n\3\2\2\2QR\7f\2\2RS\7<\2\2S\f\3\2\2\2TU\7<"+
		"\2\2U\16\3\2\2\2VW\7u\2\2W\20\3\2\2\2XY\7u\2\2YZ\7w\2\2Z[\7d\2\2[\\\7"+
		"v\2\2\\]\7t\2\2]^\7c\2\2^_\7e\2\2_`\7v\2\2`\22\3\2\2\2ab\7o\2\2bc\7w\2"+
		"\2cd\7n\2\2de\7v\2\2ef\7k\2\2fg\7r\2\2gh\7n\2\2hi\7{\2\2i\24\3\2\2\2j"+
		"k\7f\2\2kl\7k\2\2lm\7x\2\2mn\7k\2\2no\7f\2\2op\7g\2\2p\26\3\2\2\2qr\7"+
		"c\2\2rs\7f\2\2st\7f\2\2t\30\3\2\2\2uv\7n\2\2vw\7q\2\2wx\7i\2\2x\32\3\2"+
		"\2\2yz\7t\2\2z{\7g\2\2{|\7i\2\2|}\7t\2\2}~\7g\2\2~\177\7u\2\2\177\u0080"+
		"\7u\2\2\u0080\u0081\7k\2\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7a\2\2\u0084\u0085\7n\2\2\u0085\u0086\7c\2\2\u0086\u0087\7d\2\2"+
		"\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089\34\3\2\2\2\u008a\u008b\7"+
		"u\2\2\u008b\u008c\7r\2\2\u008c\u008d\7n\2\2\u008d\u008e\7k\2\2\u008e\u008f"+
		"\7v\2\2\u008f\36\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7r\2\2\u0092\u0093"+
		"\7n\2\2\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095\u0096\7a\2\2\u0096"+
		"\u0097\7m\2\2\u0097\u0098\7g\2\2\u0098\u0099\7{\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7y\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7f\2\2"+
		"\u009e\u009f\7q\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2"+
		"\7o\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7z\2\2\u00a4\"\3\2\2\2\u00a5\u00a6"+
		"\7y\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7f\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7a\2\2\u00ac\u00ad\7o\2\2"+
		"\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af$\3\2\2\2\u00b0\u00b1\7y\2"+
		"\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7a\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7x\2\2\u00b9\u00ba\7i\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7y\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7q\2\2"+
		"\u00c0\u00c1\7y\2\2\u00c1\u00c2\7a\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4"+
		"\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7s\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7q\2\2"+
		"\u00cb\u00cc\7w\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce(\3\2\2"+
		"\2\u00cf\u00d0\7y\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7f\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7y\2\2\u00d5\u00d6\7a\2\2\u00d6"+
		"\u00d7\7e\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2"+
		"\u00da\u00db\7v\2\2\u00db*\3\2\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7k\2"+
		"\2\u00de\u00df\7p\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2"+
		"\7y\2\2\u00e2\u00e3\7a\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7r\2\2\u00e6\u00e7\7\63\2\2\u00e7\u00e8\7a\2\2\u00e8\u00e9\7t\2"+
		"\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7q\2\2\u00ed,\3\2\2\2\u00ee\u00f2\t\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		".\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\t\2\2\2\u00f6\u00f8\t\3\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\60\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0100\t\2\2\2\u00fd"+
		"\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\62\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104"+
		"\7o\2\2\u0104\u0105\7w\2\2\u0105\u0106\7n\2\2\u0106\u0107\7v\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7a\2\2\u0109\u010a\7f\2\2\u010a\u010b\7k\2\2"+
		"\u010b\u010c\7t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7e\2\2\u010e\u010f"+
		"\7v\2\2\u010f\64\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112\7k\2\2\u0112\u0113"+
		"\7p\2\2\u0113\u0114\7c\2\2\u0114\u0115\7t\2\2\u0115\u0116\7{\2\2\u0116"+
		"\u0117\7a\2\2\u0117\u0118\7n\2\2\u0118\u0119\7c\2\2\u0119\u011a\7d\2\2"+
		"\u011a\u011b\7g\2\2\u011b\u011c\7n\2\2\u011c\66\3\2\2\2\u011d\u011e\7"+
		"q\2\2\u011e\u011f\7t\2\2\u011f\u0120\7k\2\2\u0120\u0121\7i\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125"+
		"8\3\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7k\2\2\u0128\u0129\7o\2\2\u0129"+
		"\u012a\7g\2\2\u012a\u012b\7f\2\2\u012b\u012c\7k\2\2\u012c\u012d\7h\2\2"+
		"\u012d\u012e\7h\2\2\u012e:\3\2\2\2\u012f\u0130\7k\2\2\u0130\u0131\7u\2"+
		"\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133<\3\2\2\2\u0134\u0135\7"+
		"e\2\2\u0135\u0136\7q\2\2\u0136\u0137\7o\2\2\u0137\u0138\7d\2\2\u0138\u0139"+
		"\7k\2\2\u0139\u013a\7p\2\2\u013a\u013b\7g\2\2\u013b>\3\2\2\2\u013c\u013d"+
		"\7f\2\2\u013d\u013e\7c\2\2\u013e\u013f\7{\2\2\u013f\u0140\7q\2\2\u0140"+
		"\u0141\7h\2\2\u0141\u0142\7y\2\2\u0142\u0143\7g\2\2\u0143\u0144\7g\2\2"+
		"\u0144\u0145\7m\2\2\u0145@\3\2\2\2\u0146\u0147\7j\2\2\u0147\u0148\7q\2"+
		"\2\u0148\u0149\7w\2\2\u0149\u014a\7t\2\2\u014a\u014b\7q\2\2\u014b\u014c"+
		"\7h\2\2\u014c\u014d\7f\2\2\u014d\u014e\7c\2\2\u014e\u014f\7{\2\2\u014f"+
		"B\3\2\2\2\u0150\u0151\7k\2\2\u0151\u0152\7u\2\2\u0152\u0153\7y\2\2\u0153"+
		"\u0154\7g\2\2\u0154\u0155\7g\2\2\u0155\u0156\7m\2\2\u0156\u0157\7f\2\2"+
		"\u0157\u0158\7c\2\2\u0158\u0159\7{\2\2\u0159D\3\2\2\2\u015a\u015b\7y\2"+
		"\2\u015b\u015c\7k\2\2\u015c\u015d\7p\2\2\u015d\u015e\7f\2\2\u015e\u015f"+
		"\7q\2\2\u015f\u0160\7y\2\2\u0160\u0161\7a\2\2\u0161\u0162\7u\2\2\u0162"+
		"\u0163\7w\2\2\u0163\u0164\7o\2\2\u0164F\3\2\2\2\u0165\u0169\t\4\2\2\u0166"+
		"\u0168\t\5\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016aH\3\2\2\2\u016b\u0169\3\2\2\2\7\2\u00f2"+
		"\u00f9\u0100\u0169\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}