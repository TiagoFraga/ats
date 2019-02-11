// Generated from src/antlr4/ATS.g4 by ANTLR 4.7.1

  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.time.format.DateTimeFormatter;
  import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, MAIL=17, 
		LETRA=18, CHAR=19, PONTO=20, VIRGULA=21, PONTO_VIRGULA=22, MENOS=23, NUMERO=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "MAIL", 
		"LETRA", "CHAR", "PONTO", "VIRGULA", "PONTO_VIRGULA", "MENOS", "NUMERO", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'logout'", "'recusar viagem'", "'viajar'", "'solicitar'", "'('", 
		"')'", "'login'", "'\"'", "'registar empresa'", "'registar condutor'", 
		"'registar cliente'", "'registar helicoptero'", "'empresa'", "'registar carrinha'", 
		"'registar carro'", "'registar mota'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "MAIL", "LETRA", "CHAR", "PONTO", "VIRGULA", 
		"PONTO_VIRGULA", "MENOS", "NUMERO", "WS"
	};
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


	  UMeR umer = new UMeR();
	  User utilizador = null;
	  
	  private String unquote(String str) {
	    return str.substring(1,str.length()-1);
	  }


	public ATSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ATS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u011a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00ea\n\22\r\22\16\22\u00eb"+
		"\3\22\3\22\6\22\u00f0\n\22\r\22\16\22\u00f1\3\22\3\22\6\22\u00f6\n\22"+
		"\r\22\16\22\u00f7\3\22\5\22\u00fb\n\22\3\22\7\22\u00fe\n\22\f\22\16\22"+
		"\u0101\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\6\31\u0110\n\31\r\31\16\31\u0111\3\32\6\32\u0115\n\32\r\32\16"+
		"\32\u0116\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\3\2\f\6\2-AC\\aac|\4\2C\\c|\6\2C\\c|\u00c9\u00c9\u00e9\u00e9\b"+
		"\2##%),-\61\61ABaa\3\2\60\60\3\2..\3\2==\3\2//\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5<\3\2\2\2\7K\3\2"+
		"\2\2\tR\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21f\3\2\2\2\23h\3"+
		"\2\2\2\25y\3\2\2\2\27\u008b\3\2\2\2\31\u009c\3\2\2\2\33\u00b1\3\2\2\2"+
		"\35\u00b9\3\2\2\2\37\u00cb\3\2\2\2!\u00da\3\2\2\2#\u00e9\3\2\2\2%\u0102"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u0106\3\2\2\2+\u0108\3\2\2\2-\u010a\3\2\2\2"+
		"/\u010c\3\2\2\2\61\u010f\3\2\2\2\63\u0114\3\2\2\2\65\66\7n\2\2\66\67\7"+
		"q\2\2\678\7i\2\289\7q\2\29:\7w\2\2:;\7v\2\2;\4\3\2\2\2<=\7t\2\2=>\7g\2"+
		"\2>?\7e\2\2?@\7w\2\2@A\7u\2\2AB\7c\2\2BC\7t\2\2CD\7\"\2\2DE\7x\2\2EF\7"+
		"k\2\2FG\7c\2\2GH\7i\2\2HI\7g\2\2IJ\7o\2\2J\6\3\2\2\2KL\7x\2\2LM\7k\2\2"+
		"MN\7c\2\2NO\7l\2\2OP\7c\2\2PQ\7t\2\2Q\b\3\2\2\2RS\7u\2\2ST\7q\2\2TU\7"+
		"n\2\2UV\7k\2\2VW\7e\2\2WX\7k\2\2XY\7v\2\2YZ\7c\2\2Z[\7t\2\2[\n\3\2\2\2"+
		"\\]\7*\2\2]\f\3\2\2\2^_\7+\2\2_\16\3\2\2\2`a\7n\2\2ab\7q\2\2bc\7i\2\2"+
		"cd\7k\2\2de\7p\2\2e\20\3\2\2\2fg\7$\2\2g\22\3\2\2\2hi\7t\2\2ij\7g\2\2"+
		"jk\7i\2\2kl\7k\2\2lm\7u\2\2mn\7v\2\2no\7c\2\2op\7t\2\2pq\7\"\2\2qr\7g"+
		"\2\2rs\7o\2\2st\7r\2\2tu\7t\2\2uv\7g\2\2vw\7u\2\2wx\7c\2\2x\24\3\2\2\2"+
		"yz\7t\2\2z{\7g\2\2{|\7i\2\2|}\7k\2\2}~\7u\2\2~\177\7v\2\2\177\u0080\7"+
		"c\2\2\u0080\u0081\7t\2\2\u0081\u0082\7\"\2\2\u0082\u0083\7e\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\u0087\7w\2\2"+
		"\u0087\u0088\7v\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\26\3\2"+
		"\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7i\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7t\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7e\2\2\u0095\u0096\7n\2"+
		"\2\u0096\u0097\7k\2\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7g\2\2\u009b\30\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7i\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7\"\2"+
		"\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7r\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\32\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7"+
		"r\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7c\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc"+
		"\7i\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3\7e\2"+
		"\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\36\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7i\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7c\2\2"+
		"\u00d2\u00d3\7t\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6"+
		"\7c\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		" \3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7i\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\u00e2\7t\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7c\2\2\u00e7\"\3\2\2\2\u00e8\u00ea"+
		"\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7B\2\2\u00ee\u00f0\t\3"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\7\60\2\2\u00f4\u00f6\t"+
		"\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\7\60\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\t\3\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100$\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\t\4\2\2\u0103&\3\2"+
		"\2\2\u0104\u0105\t\5\2\2\u0105(\3\2\2\2\u0106\u0107\t\6\2\2\u0107*\3\2"+
		"\2\2\u0108\u0109\t\7\2\2\u0109,\3\2\2\2\u010a\u010b\t\b\2\2\u010b.\3\2"+
		"\2\2\u010c\u010d\t\t\2\2\u010d\60\3\2\2\2\u010e\u0110\t\n\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\62\3\2\2\2\u0113\u0115\t\13\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\b\32\2\2\u0119\64\3\2\2\2\n\2\u00eb\u00f1\u00f7\u00fa\u00ff\u0111\u0116"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}