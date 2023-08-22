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
		T__9=10, T__10=11, T__11=12, STRING=13, NUM_INT=14, NUM_REAL=15, COR_HEX=16, 
		IDENT=17, COMENTARIO=18, DAR_ITEM=19, TELEPORTE=20, ENCANTAR=21, CRIAR_MONSTRO=22, 
		CONQUISTA=23, ALVO=24, ATRIBUICAO=25, NEGACAO=26, SEPARADOR_COMANDO=27, 
		VIRGULA=28, FIM_COMANDO=29, ERRO=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "STRING", "NUM_INT", "NUM_REAL", "COR_HEX", 
			"IDENT", "COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", "CRIAR_MONSTRO", 
			"CONQUISTA", "ALVO", "ATRIBUICAO", "NEGACAO", "SEPARADOR_COMANDO", "VIRGULA", 
			"FIM_COMANDO", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'encantamentos'", "'['", "']'", "'nome'", "'lore'", 
			"'inquebravel'", "'semIA'", "'invulneravel'", "'{'", "'}'", null, null, 
			null, null, null, null, "'dar_item'", null, "'encantar'", "'criar_monstro'", 
			"'conquista'", "'->'", "'='", "'-'", "':'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "NUM_INT", "NUM_REAL", "COR_HEX", "IDENT", "COMENTARIO", 
			"DAR_ITEM", "TELEPORTE", "ENCANTAR", "CRIAR_MONSTRO", "CONQUISTA", "ALVO", 
			"ATRIBUICAO", "NEGACAO", "SEPARADOR_COMANDO", "VIRGULA", "FIM_COMANDO", 
			"ERRO"
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
		case 15:
			COR_HEX_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COR_HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			6
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\16\3\16\3\17\6\17\u008d\n\17"+
		"\r\17\16\17\u008e\3\20\6\20\u0092\n\20\r\20\16\20\u0093\3\20\3\20\6\20"+
		"\u0098\n\20\r\20\16\20\u0099\5\20\u009c\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\7\22\u00a4\n\22\f\22\16\22\u00a7\13\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00ad\n\23\f\23\16\23\u00b0\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00c8\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\u00ae\2 \3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\7"+
		"\4\2\f\f$$\5\2\62;CHch\4\2C\\c|\6\2\62;C\\aac|\3\2\f\f\2\u0100\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3"+
		"\2\2\2\17Z\3\2\2\2\21_\3\2\2\2\23k\3\2\2\2\25q\3\2\2\2\27~\3\2\2\2\31"+
		"\u0080\3\2\2\2\33\u0082\3\2\2\2\35\u008c\3\2\2\2\37\u0091\3\2\2\2!\u009d"+
		"\3\2\2\2#\u00a1\3\2\2\2%\u00a8\3\2\2\2\'\u00b3\3\2\2\2)\u00c7\3\2\2\2"+
		"+\u00c9\3\2\2\2-\u00d2\3\2\2\2/\u00e0\3\2\2\2\61\u00ea\3\2\2\2\63\u00ed"+
		"\3\2\2\2\65\u00ef\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2\2\2;\u00f5\3\2\2"+
		"\2=\u00f7\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB\7+\2\2B\6\3\2\2\2CD\7g\2\2DE\7"+
		"p\2\2EF\7e\2\2FG\7c\2\2GH\7p\2\2HI\7v\2\2IJ\7c\2\2JK\7o\2\2KL\7g\2\2L"+
		"M\7p\2\2MN\7v\2\2NO\7q\2\2OP\7u\2\2P\b\3\2\2\2QR\7]\2\2R\n\3\2\2\2ST\7"+
		"_\2\2T\f\3\2\2\2UV\7p\2\2VW\7q\2\2WX\7o\2\2XY\7g\2\2Y\16\3\2\2\2Z[\7n"+
		"\2\2[\\\7q\2\2\\]\7t\2\2]^\7g\2\2^\20\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7s\2"+
		"\2bc\7w\2\2cd\7g\2\2de\7d\2\2ef\7t\2\2fg\7c\2\2gh\7x\2\2hi\7g\2\2ij\7"+
		"n\2\2j\22\3\2\2\2kl\7u\2\2lm\7g\2\2mn\7o\2\2no\7K\2\2op\7C\2\2p\24\3\2"+
		"\2\2qr\7k\2\2rs\7p\2\2st\7x\2\2tu\7w\2\2uv\7n\2\2vw\7p\2\2wx\7g\2\2xy"+
		"\7t\2\2yz\7c\2\2z{\7x\2\2{|\7g\2\2|}\7n\2\2}\26\3\2\2\2~\177\7}\2\2\177"+
		"\30\3\2\2\2\u0080\u0081\7\177\2\2\u0081\32\3\2\2\2\u0082\u0086\7$\2\2"+
		"\u0083\u0085\n\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7$\2\2\u008a\34\3\2\2\2\u008b\u008d\4\62;\2\u008c\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\36"+
		"\3\2\2\2\u0090\u0092\4\62;\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\3\2\2\2\u0095\u0097\7\60"+
		"\2\2\u0096\u0098\4\62;\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c \3\2\2\2\u009d\u009e\7%\2\2\u009e\u009f"+
		"\t\3\2\2\u009f\u00a0\b\21\2\2\u00a0\"\3\2\2\2\u00a1\u00a5\t\4\2\2\u00a2"+
		"\u00a4\t\5\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6$\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\n\6\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\b\23\3\2"+
		"\u00b2&\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7t\2"+
		"\2\u00b6\u00b7\7a\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7o\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7r\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c8\7g\2\2"+
		"\u00c5\u00c6\7v\2\2\u00c6\u00c8\7r\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc"+
		"\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\u00d1\7t\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2"+
		"\u00d7\u00d8\7a\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7q\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7q\2\2\u00df.\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u00e4\7s\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7c\2\2\u00e9\60\3\2"+
		"\2\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\7@\2\2\u00ec\62\3\2\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\66\3\2\2\2\u00f1\u00f2"+
		"\7<\2\2\u00f28\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7"+
		"=\2\2\u00f6<\3\2\2\2\u00f7\u00f8\13\2\2\2\u00f8>\3\2\2\2\13\2\u0086\u008e"+
		"\u0093\u0099\u009b\u00a5\u00ae\u00c7\4\3\21\2\3\23\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}