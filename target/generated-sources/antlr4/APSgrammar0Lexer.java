// Generated from APSgrammar0.g4 by ANTLR 4.4

	package antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APSgrammar0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, IDENT=24, 
		NUM=25, SPACE=26, ESC=27, LINE_COMMENT=28, COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "IDENT", "NUM", "SPACE", 
		"ESC", "LINE_COMMENT", "COMMENT"
	};


	public APSgrammar0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "APSgrammar0.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u0096\n\31\f\31\16\31\u0099\13"+
		"\31\3\32\5\32\u009c\n\32\3\32\6\32\u009f\n\32\r\32\16\32\u00a0\3\33\6"+
		"\33\u00a4\n\33\r\33\16\33\u00a5\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\7\35\u00b1\n\35\f\35\16\35\u00b4\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u00be\n\36\f\36\16\36\u00c1\13\36\3\36\3\36\3\36"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\7\2$$^^ppttvv\4\2\f\f\17\17\3\2\61\61\3\2,,\u00cd\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2"+
		"\2\2\5A\3\2\2\2\7G\3\2\2\2\tL\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17T\3\2\2"+
		"\2\21X\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33k\3\2"+
		"\2\2\35n\3\2\2\2\37r\3\2\2\2!v\3\2\2\2#z\3\2\2\2%}\3\2\2\2\'\177\3\2\2"+
		"\2)\u0081\3\2\2\2+\u0085\3\2\2\2-\u0089\3\2\2\2/\u008f\3\2\2\2\61\u0093"+
		"\3\2\2\2\63\u009b\3\2\2\2\65\u00a3\3\2\2\2\67\u00a9\3\2\2\29\u00ac\3\2"+
		"\2\2;\u00b7\3\2\2\2=>\7c\2\2>?\7f\2\2?@\7f\2\2@\4\3\2\2\2AB\7Y\2\2BC\7"+
		"J\2\2CD\7K\2\2DE\7N\2\2EF\7G\2\2F\6\3\2\2\2GH\7v\2\2HI\7t\2\2IJ\7w\2\2"+
		"JK\7g\2\2K\b\3\2\2\2LM\7u\2\2MN\7w\2\2NO\7d\2\2O\n\3\2\2\2PQ\7=\2\2Q\f"+
		"\3\2\2\2RS\7]\2\2S\16\3\2\2\2TU\7o\2\2UV\7w\2\2VW\7n\2\2W\20\3\2\2\2X"+
		"Y\7K\2\2YZ\7H\2\2Z\22\3\2\2\2[\\\7_\2\2\\\24\3\2\2\2]^\7d\2\2^_\7q\2\2"+
		"_`\7q\2\2`a\7n\2\2a\26\3\2\2\2bc\7q\2\2cd\7t\2\2d\30\3\2\2\2ef\7E\2\2"+
		"fg\7Q\2\2gh\7P\2\2hi\7U\2\2ij\7V\2\2j\32\3\2\2\2kl\7n\2\2lm\7v\2\2m\34"+
		"\3\2\2\2no\7X\2\2op\7C\2\2pq\7T\2\2q\36\3\2\2\2rs\7f\2\2st\7k\2\2tu\7"+
		"x\2\2u \3\2\2\2vw\7k\2\2wx\7p\2\2xy\7v\2\2y\"\3\2\2\2z{\7g\2\2{|\7s\2"+
		"\2|$\3\2\2\2}~\7*\2\2~&\3\2\2\2\177\u0080\7+\2\2\u0080(\3\2\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2\2\u0084*\3\2\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7q\2\2\u0087\u0088\7v\2\2\u0088,\3\2\2\2\u0089"+
		"\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2"+
		"\u008d\u008e\7g\2\2\u008e.\3\2\2\2\u008f\u0090\7U\2\2\u0090\u0091\7G\2"+
		"\2\u0091\u0092\7V\2\2\u0092\60\3\2\2\2\u0093\u0097\t\2\2\2\u0094\u0096"+
		"\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\62\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7/\2\2"+
		"\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f"+
		"\t\4\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\64\3\2\2\2\u00a2\u00a4\t\5\2\2\u00a3\u00a2\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\b\33\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7^\2\2\u00aa"+
		"\u00ab\t\6\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7\61\2"+
		"\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\n\7\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\b\35\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7\61\2"+
		"\2\u00b8\u00b9\7,\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00be"+
		"\n\b\2\2\u00bc\u00be\n\t\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\b\36\2\2\u00c6<\3\2\2\2\n\2\u0097\u009b\u00a0"+
		"\u00a5\u00b2\u00bd\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}