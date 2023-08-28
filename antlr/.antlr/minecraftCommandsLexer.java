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
		T__9=10, T__10=11, STRING=12, CADEIA_N_FECHADA=13, NUM_INT=14, NUM_REAL=15, 
		COR_HEX=16, WS=17, COMENTARIO=18, DAR_ITEM=19, TELEPORTE=20, ENCANTAR=21, 
		CRIAR_MOB=22, CONQUISTA=23, NOME=24, LORE=25, ALVO=26, ATRIBUICAO=27, 
		NEGACAO=28, ADICAO=29, SEPARADOR_COMANDO=30, VIRGULA=31, FIM_COMANDO=32, 
		IDENT=33, ERRO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "STRING", "CADEIA_N_FECHADA", "NUM_INT", "NUM_REAL", 
			"COR_HEX", "WS", "COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", "CRIAR_MOB", 
			"CONQUISTA", "NOME", "LORE", "ALVO", "ATRIBUICAO", "NEGACAO", "ADICAO", 
			"SEPARADOR_COMANDO", "VIRGULA", "FIM_COMANDO", "IDENT", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'~'", "'encantamento'", "'inquebravel'", "'nome_mob'", 
			"'semIA'", "'invulneravel'", "'vida'", "'{'", "'}'", null, null, null, 
			null, null, null, null, "'dar_item'", null, "'encantar'", "'criar_mob'", 
			"'conquista'", "'nome'", "'lore'", "'->'", "'='", "'-'", "'+'", "':'", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "CADEIA_N_FECHADA", "NUM_INT", "NUM_REAL", "COR_HEX", "WS", 
			"COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", "CRIAR_MOB", "CONQUISTA", 
			"NOME", "LORE", "ALVO", "ATRIBUICAO", "NEGACAO", "ADICAO", "SEPARADOR_COMANDO", 
			"VIRGULA", "FIM_COMANDO", "IDENT", "ERRO"
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
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\7\r\u008e\n\r\f\r\16\r\u0091\13\r\3\r\3\r\3\16\3"+
		"\16\7\16\u0097\n\16\f\16\16\16\u009a\13\16\3\16\3\16\3\17\6\17\u009f\n"+
		"\17\r\17\16\17\u00a0\3\20\6\20\u00a4\n\20\r\20\16\20\u00a5\3\20\3\20\6"+
		"\20\u00aa\n\20\r\20\16\20\u00ab\5\20\u00ae\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00bf\n\23"+
		"\f\23\16\23\u00c2\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00da"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\7\""+
		"\u0114\n\"\f\"\16\"\u0117\13\"\3#\3#\4\u0098\u00c0\2$\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\b"+
		"\4\2\f\f$$\5\2\62;CHch\5\2\13\f\17\17\"\"\3\2\f\f\4\2C\\c|\6\2\62;C\\"+
		"aac|\2\u0122\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13Z\3\2\2\2\rf\3\2\2\2"+
		"\17o\3\2\2\2\21u\3\2\2\2\23\u0082\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3"+
		"\2\2\2\31\u008b\3\2\2\2\33\u0094\3\2\2\2\35\u009e\3\2\2\2\37\u00a3\3\2"+
		"\2\2!\u00af\3\2\2\2#\u00b7\3\2\2\2%\u00ba\3\2\2\2\'\u00c5\3\2\2\2)\u00d9"+
		"\3\2\2\2+\u00db\3\2\2\2-\u00e4\3\2\2\2/\u00ee\3\2\2\2\61\u00f8\3\2\2\2"+
		"\63\u00fd\3\2\2\2\65\u0102\3\2\2\2\67\u0105\3\2\2\29\u0107\3\2\2\2;\u0109"+
		"\3\2\2\2=\u010b\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0118\3\2\2\2GH\7*\2\2H\4\3\2\2\2IJ\7+\2\2J\6\3\2\2\2KL\7\u0080\2\2L"+
		"\b\3\2\2\2MN\7g\2\2NO\7p\2\2OP\7e\2\2PQ\7c\2\2QR\7p\2\2RS\7v\2\2ST\7c"+
		"\2\2TU\7o\2\2UV\7g\2\2VW\7p\2\2WX\7v\2\2XY\7q\2\2Y\n\3\2\2\2Z[\7k\2\2"+
		"[\\\7p\2\2\\]\7s\2\2]^\7w\2\2^_\7g\2\2_`\7d\2\2`a\7t\2\2ab\7c\2\2bc\7"+
		"x\2\2cd\7g\2\2de\7n\2\2e\f\3\2\2\2fg\7p\2\2gh\7q\2\2hi\7o\2\2ij\7g\2\2"+
		"jk\7a\2\2kl\7o\2\2lm\7q\2\2mn\7d\2\2n\16\3\2\2\2op\7u\2\2pq\7g\2\2qr\7"+
		"o\2\2rs\7K\2\2st\7C\2\2t\20\3\2\2\2uv\7k\2\2vw\7p\2\2wx\7x\2\2xy\7w\2"+
		"\2yz\7n\2\2z{\7p\2\2{|\7g\2\2|}\7t\2\2}~\7c\2\2~\177\7x\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7n\2\2\u0081\22\3\2\2\2\u0082\u0083\7x\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7f\2\2\u0085\u0086\7c\2\2\u0086\24\3\2\2\2\u0087\u0088"+
		"\7}\2\2\u0088\26\3\2\2\2\u0089\u008a\7\177\2\2\u008a\30\3\2\2\2\u008b"+
		"\u008f\7$\2\2\u008c\u008e\n\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7$\2\2\u0093\32\3\2\2\2\u0094\u0098\7$\2\2"+
		"\u0095\u0097\n\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7=\2\2\u009c\34\3\2\2\2\u009d\u009f\4\62;\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\36"+
		"\3\2\2\2\u00a2\u00a4\4\62;\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad\3\2\2\2\u00a7\u00a9\7\60"+
		"\2\2\u00a8\u00aa\4\62;\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a7\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae \3\2\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1"+
		"\t\3\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\t\3\2\2\u00b3\u00b4\t\3\2\2\u00b4"+
		"\u00b5\t\3\2\2\u00b5\u00b6\t\3\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\t\4\2\2"+
		"\u00b8\u00b9\b\22\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc"+
		"\7\61\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\n\5\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\23\3\2\u00c4&\3\2\2\2\u00c5"+
		"\u00c6\7f\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7a\2\2"+
		"\u00c9\u00ca\7k\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7o\2\2\u00cd(\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7n\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7q\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7v\2\2\u00d6\u00da\7g\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00da\7r\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da*\3\2"+
		"\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7e\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7a\2\2"+
		"\u00ea\u00eb\7o\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7d\2\2\u00ed.\3\2\2"+
		"\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2"+
		"\7s\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7u\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\u00f7\7c\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7q\2\2\u00fa\u00fb\7o\2\2\u00fb\u00fc\7g\2\2\u00fc\62\3\2\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2"+
		"\u0101\64\3\2\2\2\u0102\u0103\7/\2\2\u0103\u0104\7@\2\2\u0104\66\3\2\2"+
		"\2\u0105\u0106\7?\2\2\u01068\3\2\2\2\u0107\u0108\7/\2\2\u0108:\3\2\2\2"+
		"\u0109\u010a\7-\2\2\u010a<\3\2\2\2\u010b\u010c\7<\2\2\u010c>\3\2\2\2\u010d"+
		"\u010e\7.\2\2\u010e@\3\2\2\2\u010f\u0110\7=\2\2\u0110B\3\2\2\2\u0111\u0115"+
		"\t\6\2\2\u0112\u0114\t\7\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116D\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0118\u0119\13\2\2\2\u0119F\3\2\2\2\f\2\u008f\u0098\u00a0\u00a5\u00ab"+
		"\u00ad\u00c0\u00d9\u0115\4\3\22\2\3\23\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}