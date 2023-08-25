// Generated from /home/recoaro/Codes/UFSCAR/2023/Compiladores/construcao-compiladores-t6/antlr/minecraftCommands.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minecraftCommandsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, CADEIA_N_FECHADA=15, 
		NUM_INT=16, NUM_REAL=17, COR_HEX=18, WS=19, COMENTARIO=20, DAR_ITEM=21, 
		TELEPORTE=22, ENCANTAR=23, CRIAR_MONSTRO=24, CONQUISTA=25, ALVO=26, ATRIBUICAO=27, 
		NEGACAO=28, SEPARADOR_COMANDO=29, VIRGULA=30, FIM_COMANDO=31, IDENT=32, 
		ERRO=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "STRING", "CADEIA_N_FECHADA", "NUM_INT", 
			"NUM_REAL", "COR_HEX", "WS", "COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", 
			"CRIAR_MONSTRO", "CONQUISTA", "ALVO", "ATRIBUICAO", "NEGACAO", "SEPARADOR_COMANDO", 
			"VIRGULA", "FIM_COMANDO", "IDENT", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'~'", "'encantamento'", "'+'", "'nome'", "'lore'", 
			"'inquebravel'", "'semIA'", "'invulneravel'", "'vida'", "'{'", "'}'", 
			null, null, null, null, null, null, null, "'dar_item'", null, "'encantar'", 
			"'criar_monstro'", "'conquista'", "'->'", "'='", "'-'", "':'", "','", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "CADEIA_N_FECHADA", "NUM_INT", "NUM_REAL", "COR_HEX", 
			"WS", "COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", "CRIAR_MONSTRO", 
			"CONQUISTA", "ALVO", "ATRIBUICAO", "NEGACAO", "SEPARADOR_COMANDO", "VIRGULA", 
			"FIM_COMANDO", "IDENT", "ERRO"
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


	public minecraftCommandsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minecraftCommands.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			self.skip()
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			self.skip()
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17\u008f\n\17\f\17\16\17"+
		"\u0092\13\17\3\17\3\17\3\20\3\20\7\20\u0098\n\20\f\20\16\20\u009b\13\20"+
		"\3\20\3\20\3\21\6\21\u00a0\n\21\r\21\16\21\u00a1\3\22\6\22\u00a5\n\22"+
		"\r\22\16\22\u00a6\3\22\3\22\6\22\u00ab\n\22\r\22\16\22\u00ac\5\22\u00af"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\7\25\u00c0\n\25\f\25\16\25\u00c3\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00db\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u010d\n!"+
		"\f!\16!\u0110\13!\3\"\3\"\4\u0099\u00c1\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\b\4\2\f\f$$\5"+
		"\2\62;CHch\5\2\13\f\17\17\"\"\3\2\f\f\4\2C\\c|\6\2\62;C\\aac|\2\u011b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2"+
		"\2\7I\3\2\2\2\tK\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17_\3\2\2\2\21d\3\2\2"+
		"\2\23p\3\2\2\2\25v\3\2\2\2\27\u0083\3\2\2\2\31\u0088\3\2\2\2\33\u008a"+
		"\3\2\2\2\35\u008c\3\2\2\2\37\u0095\3\2\2\2!\u009f\3\2\2\2#\u00a4\3\2\2"+
		"\2%\u00b0\3\2\2\2\'\u00b8\3\2\2\2)\u00bb\3\2\2\2+\u00c6\3\2\2\2-\u00da"+
		"\3\2\2\2/\u00dc\3\2\2\2\61\u00e5\3\2\2\2\63\u00f3\3\2\2\2\65\u00fd\3\2"+
		"\2\2\67\u0100\3\2\2\29\u0102\3\2\2\2;\u0104\3\2\2\2=\u0106\3\2\2\2?\u0108"+
		"\3\2\2\2A\u010a\3\2\2\2C\u0111\3\2\2\2EF\7*\2\2F\4\3\2\2\2GH\7+\2\2H\6"+
		"\3\2\2\2IJ\7\u0080\2\2J\b\3\2\2\2KL\7g\2\2LM\7p\2\2MN\7e\2\2NO\7c\2\2"+
		"OP\7p\2\2PQ\7v\2\2QR\7c\2\2RS\7o\2\2ST\7g\2\2TU\7p\2\2UV\7v\2\2VW\7q\2"+
		"\2W\n\3\2\2\2XY\7-\2\2Y\f\3\2\2\2Z[\7p\2\2[\\\7q\2\2\\]\7o\2\2]^\7g\2"+
		"\2^\16\3\2\2\2_`\7n\2\2`a\7q\2\2ab\7t\2\2bc\7g\2\2c\20\3\2\2\2de\7k\2"+
		"\2ef\7p\2\2fg\7s\2\2gh\7w\2\2hi\7g\2\2ij\7d\2\2jk\7t\2\2kl\7c\2\2lm\7"+
		"x\2\2mn\7g\2\2no\7n\2\2o\22\3\2\2\2pq\7u\2\2qr\7g\2\2rs\7o\2\2st\7K\2"+
		"\2tu\7C\2\2u\24\3\2\2\2vw\7k\2\2wx\7p\2\2xy\7x\2\2yz\7w\2\2z{\7n\2\2{"+
		"|\7p\2\2|}\7g\2\2}~\7t\2\2~\177\7c\2\2\177\u0080\7x\2\2\u0080\u0081\7"+
		"g\2\2\u0081\u0082\7n\2\2\u0082\26\3\2\2\2\u0083\u0084\7x\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7f\2\2\u0086\u0087\7c\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\7}\2\2\u0089\32\3\2\2\2\u008a\u008b\7\177\2\2\u008b\34\3\2\2\2\u008c"+
		"\u0090\7$\2\2\u008d\u008f\n\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7$\2\2\u0094\36\3\2\2\2\u0095\u0099\7$\2\2"+
		"\u0096\u0098\n\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7=\2\2\u009d \3\2\2\2\u009e\u00a0\4\62;\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\"\3\2\2\2"+
		"\u00a3\u00a5\4\62;\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ae\3\2\2\2\u00a8\u00aa\7\60\2\2"+
		"\u00a9\u00ab\4\62;\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af$\3\2\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\t\3\2\2\u00b2"+
		"\u00b3\t\3\2\2\u00b3\u00b4\t\3\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\t\3"+
		"\2\2\u00b6\u00b7\t\3\2\2\u00b7&\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9\u00ba"+
		"\b\24\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7\61\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00c0\n\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\b\25\3\2\u00c5*\3\2\2\2\u00c6\u00c7\7f\2\2"+
		"\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7a\2\2\u00ca\u00cb"+
		"\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7o\2\2\u00ce"+
		",\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2\2"+
		"\u00d6\u00d7\7v\2\2\u00d7\u00db\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00db"+
		"\7r\2\2\u00da\u00cf\3\2\2\2\u00da\u00d8\3\2\2\2\u00db.\3\2\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7t\2\2"+
		"\u00e4\60\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7"+
		"k\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec"+
		"\7o\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7u\2\2\u00ef"+
		"\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7q\2\2\u00f2\62\3\2\2\2\u00f3"+
		"\u00f4\7e\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7s\2\2"+
		"\u00f7\u00f8\7w\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb\u00fc\7c\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7/\2\2\u00fe\u00ff"+
		"\7@\2\2\u00ff\66\3\2\2\2\u0100\u0101\7?\2\2\u01018\3\2\2\2\u0102\u0103"+
		"\7/\2\2\u0103:\3\2\2\2\u0104\u0105\7<\2\2\u0105<\3\2\2\2\u0106\u0107\7"+
		".\2\2\u0107>\3\2\2\2\u0108\u0109\7=\2\2\u0109@\3\2\2\2\u010a\u010e\t\6"+
		"\2\2\u010b\u010d\t\7\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fB\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0111\u0112\13\2\2\2\u0112D\3\2\2\2\f\2\u0090\u0099\u00a1\u00a6\u00ac"+
		"\u00ae\u00c1\u00da\u010e\4\3\24\2\3\25\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}