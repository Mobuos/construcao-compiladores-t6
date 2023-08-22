// Generated from /home/recoaro/Codes/UFSCAR/2023/Compiladores/construcao-compiladores-t6/antlr/minecraftCommands.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minecraftCommandsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRING=11, NUM_INT=12, NUM_REAL=13, COR_HEX=14, IDENT=15, COMENTARIO=16, 
		DAR_ITEM=17, TELEPORTE=18, ENCANTAR=19, CRIAR_MONSTRO=20, CONQUISTA=21, 
		ALVO=22, ATRIBUICAO=23, NEGACAO=24, SEPARADOR_COMANDO=25, VIRGULA=26, 
		FIM_COMANDO=27, ERRO=28;
	public static final int
		RULE_coordenadas = 0, RULE_cmd_dar_item = 1, RULE_cmd_teleporte = 2, RULE_cmd_encantar = 3, 
		RULE_cmd_criar_monstro = 4, RULE_cmd_conquista = 5, RULE_cmd_atribuicao = 6, 
		RULE_mod_encantamento = 7, RULE_mod_exibicao = 8, RULE_modificadores_monstro = 9, 
		RULE_modificador_monstro = 10, RULE_modificadores_item = 11, RULE_modificador_item = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"coordenadas", "cmd_dar_item", "cmd_teleporte", "cmd_encantar", "cmd_criar_monstro", 
			"cmd_conquista", "cmd_atribuicao", "mod_encantamento", "mod_exibicao", 
			"modificadores_monstro", "modificador_monstro", "modificadores_item", 
			"modificador_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'encantamentos'", "'['", "']'", "'nome'", "'lore'", 
			"'cor'", "'{'", "'}'", null, null, null, null, null, null, "'dar_item'", 
			null, "'encantar'", "'criar_monstro'", "'conquista'", "'->'", "'='", 
			"'-'", "':'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUM_INT", "NUM_REAL", "COR_HEX", "IDENT", "COMENTARIO", "DAR_ITEM", 
			"TELEPORTE", "ENCANTAR", "CRIAR_MONSTRO", "CONQUISTA", "ALVO", "ATRIBUICAO", 
			"NEGACAO", "SEPARADOR_COMANDO", "VIRGULA", "FIM_COMANDO", "ERRO"
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
	public String getGrammarFileName() { return "minecraftCommands.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minecraftCommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CoordenadasContext extends ParserRuleContext {
		public List<TerminalNode> NUM_REAL() { return getTokens(minecraftCommandsParser.NUM_REAL); }
		public TerminalNode NUM_REAL(int i) {
			return getToken(minecraftCommandsParser.NUM_REAL, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public CoordenadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenadas; }
	}

	public final CoordenadasContext coordenadas() throws RecognitionException {
		CoordenadasContext _localctx = new CoordenadasContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(NUM_REAL);
			setState(28);
			match(VIRGULA);
			setState(29);
			match(NUM_REAL);
			setState(30);
			match(VIRGULA);
			setState(31);
			match(NUM_REAL);
			setState(32);
			match(T__1);
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

	public static class Cmd_dar_itemContext extends ParserRuleContext {
		public TerminalNode DAR_ITEM() { return getToken(minecraftCommandsParser.DAR_ITEM, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public TerminalNode FIM_COMANDO() { return getToken(minecraftCommandsParser.FIM_COMANDO, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public Modificadores_itemContext modificadores_item() {
			return getRuleContext(Modificadores_itemContext.class,0);
		}
		public Cmd_dar_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_dar_item; }
	}

	public final Cmd_dar_itemContext cmd_dar_item() throws RecognitionException {
		Cmd_dar_itemContext _localctx = new Cmd_dar_itemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd_dar_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DAR_ITEM);
			setState(35);
			match(SEPARADOR_COMANDO);
			setState(36);
			match(STRING);
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(37);
				match(VIRGULA);
				setState(38);
				match(NUM_INT);
				}
				break;
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(41);
				match(VIRGULA);
				setState(42);
				modificadores_item();
				}
			}

			{
			setState(45);
			match(ALVO);
			setState(46);
			match(STRING);
			}
			setState(48);
			match(FIM_COMANDO);
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

	public static class Cmd_teleporteContext extends ParserRuleContext {
		public TerminalNode TELEPORTE() { return getToken(minecraftCommandsParser.TELEPORTE, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(minecraftCommandsParser.FIM_COMANDO, 0); }
		public Cmd_teleporteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_teleporte; }
	}

	public final Cmd_teleporteContext cmd_teleporte() throws RecognitionException {
		Cmd_teleporteContext _localctx = new Cmd_teleporteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd_teleporte);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELEPORTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(TELEPORTE);
				setState(51);
				match(SEPARADOR_COMANDO);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(52);
					match(STRING);
					setState(53);
					match(ALVO);
					}
				}

				setState(56);
				match(VIRGULA);
				setState(57);
				match(STRING);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				coordenadas();
				setState(59);
				match(FIM_COMANDO);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cmd_encantarContext extends ParserRuleContext {
		public TerminalNode ENCANTAR() { return getToken(minecraftCommandsParser.ENCANTAR, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public TerminalNode FIM_COMANDO() { return getToken(minecraftCommandsParser.FIM_COMANDO, 0); }
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public Cmd_encantarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_encantar; }
	}

	public final Cmd_encantarContext cmd_encantar() throws RecognitionException {
		Cmd_encantarContext _localctx = new Cmd_encantarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd_encantar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ENCANTAR);
			setState(64);
			match(SEPARADOR_COMANDO);
			setState(65);
			match(STRING);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(66);
				match(VIRGULA);
				setState(67);
				match(NUM_INT);
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(70);
				match(ALVO);
				setState(71);
				match(STRING);
				}
			}

			setState(74);
			match(FIM_COMANDO);
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

	public static class Cmd_criar_monstroContext extends ParserRuleContext {
		public TerminalNode CRIAR_MONSTRO() { return getToken(minecraftCommandsParser.CRIAR_MONSTRO, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode FIM_COMANDO() { return getToken(minecraftCommandsParser.FIM_COMANDO, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public Modificadores_monstroContext modificadores_monstro() {
			return getRuleContext(Modificadores_monstroContext.class,0);
		}
		public Cmd_criar_monstroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_criar_monstro; }
	}

	public final Cmd_criar_monstroContext cmd_criar_monstro() throws RecognitionException {
		Cmd_criar_monstroContext _localctx = new Cmd_criar_monstroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd_criar_monstro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CRIAR_MONSTRO);
			setState(77);
			match(SEPARADOR_COMANDO);
			setState(78);
			match(STRING);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(79);
				match(VIRGULA);
				setState(80);
				coordenadas();
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(83);
				match(VIRGULA);
				setState(84);
				modificadores_monstro();
				}
			}

			setState(87);
			match(FIM_COMANDO);
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

	public static class Cmd_conquistaContext extends ParserRuleContext {
		public TerminalNode CONQUISTA() { return getToken(minecraftCommandsParser.CONQUISTA, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public TerminalNode FIM_COMANDO() { return getToken(minecraftCommandsParser.FIM_COMANDO, 0); }
		public TerminalNode NEGACAO() { return getToken(minecraftCommandsParser.NEGACAO, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public Cmd_conquistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_conquista; }
	}

	public final Cmd_conquistaContext cmd_conquista() throws RecognitionException {
		Cmd_conquistaContext _localctx = new Cmd_conquistaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_conquista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CONQUISTA);
			setState(90);
			match(SEPARADOR_COMANDO);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(91);
				match(NEGACAO);
				}
			}

			setState(94);
			match(STRING);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(95);
				match(ALVO);
				setState(96);
				match(STRING);
				}
			}

			setState(99);
			match(FIM_COMANDO);
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

	public static class Cmd_atribuicaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(minecraftCommandsParser.ATRIBUICAO, 0); }
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public Modificadores_itemContext modificadores_item() {
			return getRuleContext(Modificadores_itemContext.class,0);
		}
		public Modificadores_monstroContext modificadores_monstro() {
			return getRuleContext(Modificadores_monstroContext.class,0);
		}
		public Cmd_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atribuicao; }
	}

	public final Cmd_atribuicaoContext cmd_atribuicao() throws RecognitionException {
		Cmd_atribuicaoContext _localctx = new Cmd_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_atribuicao);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(IDENT);
				setState(102);
				match(ATRIBUICAO);
				setState(103);
				coordenadas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				modificadores_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				modificadores_monstro();
				}
				break;
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

	public static class Mod_encantamentoContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public Mod_encantamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_encantamento; }
	}

	public final Mod_encantamentoContext mod_encantamento() throws RecognitionException {
		Mod_encantamentoContext _localctx = new Mod_encantamentoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mod_encantamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			match(SEPARADOR_COMANDO);
			setState(111);
			match(T__3);
			setState(112);
			match(T__0);
			setState(113);
			match(STRING);
			setState(114);
			match(VIRGULA);
			setState(115);
			match(NUM_INT);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(116);
				match(T__1);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__4);
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

	public static class Mod_exibicaoContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode COR_HEX() { return getToken(minecraftCommandsParser.COR_HEX, 0); }
		public Mod_exibicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_exibicao; }
	}

	public final Mod_exibicaoContext mod_exibicao() throws RecognitionException {
		Mod_exibicaoContext _localctx = new Mod_exibicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mod_exibicao);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(124);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(125);
					match(T__6);
					setState(126);
					match(SEPARADOR_COMANDO);
					setState(127);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__7);
				setState(131);
				match(SEPARADOR_COMANDO);
				setState(132);
				match(COR_HEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Modificadores_monstroContext extends ParserRuleContext {
		public List<Modificador_monstroContext> modificador_monstro() {
			return getRuleContexts(Modificador_monstroContext.class);
		}
		public Modificador_monstroContext modificador_monstro(int i) {
			return getRuleContext(Modificador_monstroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public Modificadores_monstroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadores_monstro; }
	}

	public final Modificadores_monstroContext modificadores_monstro() throws RecognitionException {
		Modificadores_monstroContext _localctx = new Modificadores_monstroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modificadores_monstro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__8);
			setState(136);
			modificador_monstro();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(137);
				match(VIRGULA);
				setState(138);
				modificador_monstro();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__9);
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

	public static class Modificador_monstroContext extends ParserRuleContext {
		public Modificador_monstroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador_monstro; }
	}

	public final Modificador_monstroContext modificador_monstro() throws RecognitionException {
		Modificador_monstroContext _localctx = new Modificador_monstroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modificador_monstro);
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

	public static class Modificadores_itemContext extends ParserRuleContext {
		public List<Modificador_itemContext> modificador_item() {
			return getRuleContexts(Modificador_itemContext.class);
		}
		public Modificador_itemContext modificador_item(int i) {
			return getRuleContext(Modificador_itemContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public Modificadores_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadores_item; }
	}

	public final Modificadores_itemContext modificadores_item() throws RecognitionException {
		Modificadores_itemContext _localctx = new Modificadores_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modificadores_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__8);
			setState(149);
			modificador_item();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(150);
				match(VIRGULA);
				setState(151);
				modificador_item();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__9);
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

	public static class Modificador_itemContext extends ParserRuleContext {
		public Mod_encantamentoContext mod_encantamento() {
			return getRuleContext(Mod_encantamentoContext.class,0);
		}
		public Mod_exibicaoContext mod_exibicao() {
			return getRuleContext(Mod_exibicaoContext.class,0);
		}
		public Modificador_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador_item; }
	}

	public final Modificador_itemContext modificador_item() throws RecognitionException {
		Modificador_itemContext _localctx = new Modificador_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modificador_item);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				mod_encantamento();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				mod_exibicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\3\5\5\5G"+
		"\n\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6T\n\6\3\6\3\6\5\6"+
		"X\n\6\3\6\3\6\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\3\7\5\7d\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tx\n\t\f"+
		"\t\16\t{\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n\3\n\5\n\u0088"+
		"\n\n\3\13\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091\13\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e\13\r\3\r\3\r"+
		"\3\16\3\16\5\16\u00a4\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\2\2\u00ab\2\34\3\2\2\2\4$\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nN\3\2\2\2"+
		"\f[\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2"+
		"\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u00a3\3\2\2\2\34\35\7\3\2\2\35\36"+
		"\7\17\2\2\36\37\7\34\2\2\37 \7\17\2\2 !\7\34\2\2!\"\7\17\2\2\"#\7\4\2"+
		"\2#\3\3\2\2\2$%\7\23\2\2%&\7\33\2\2&)\7\r\2\2\'(\7\34\2\2(*\7\16\2\2)"+
		"\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+,\7\34\2\2,.\5\30\r\2-+\3\2\2\2-.\3\2\2"+
		"\2./\3\2\2\2/\60\7\30\2\2\60\61\7\r\2\2\61\62\3\2\2\2\62\63\7\35\2\2\63"+
		"\5\3\2\2\2\64\65\7\24\2\2\658\7\33\2\2\66\67\7\r\2\2\679\7\30\2\28\66"+
		"\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\34\2\2;@\7\r\2\2<=\5\2\2\2=>\7\35\2\2"+
		">@\3\2\2\2?\64\3\2\2\2?<\3\2\2\2@\7\3\2\2\2AB\7\25\2\2BC\7\33\2\2CF\7"+
		"\r\2\2DE\7\34\2\2EG\7\16\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HI\7\30\2\2"+
		"IK\7\r\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\35\2\2M\t\3\2\2\2NO\7\26"+
		"\2\2OP\7\33\2\2PS\7\r\2\2QR\7\34\2\2RT\5\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3"+
		"\2\2\2UV\7\34\2\2VX\5\24\13\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\35\2\2"+
		"Z\13\3\2\2\2[\\\7\27\2\2\\^\7\33\2\2]_\7\32\2\2^]\3\2\2\2^_\3\2\2\2_`"+
		"\3\2\2\2`c\7\r\2\2ab\7\30\2\2bd\7\r\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2"+
		"ef\7\35\2\2f\r\3\2\2\2gh\7\21\2\2hi\7\31\2\2in\5\2\2\2jn\7\r\2\2kn\5\30"+
		"\r\2ln\5\24\13\2mg\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\17\3\2\2\2o"+
		"p\7\5\2\2pq\7\33\2\2qr\7\6\2\2rs\7\3\2\2st\7\r\2\2tu\7\34\2\2uy\7\16\2"+
		"\2vx\7\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2"+
		"\2|}\7\7\2\2}\21\3\2\2\2~\u0083\7\b\2\2\177\u0080\7\t\2\2\u0080\u0081"+
		"\7\33\2\2\u0081\u0083\7\r\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0083\u0088"+
		"\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7\33\2\2\u0086\u0088\7\20\2\2"+
		"\u0087\u0082\3\2\2\2\u0087\u0084\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a"+
		"\7\13\2\2\u008a\u008f\5\26\f\2\u008b\u008c\7\34\2\2\u008c\u008e\5\26\f"+
		"\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\f\2\2\u0093"+
		"\25\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\7\13\2\2"+
		"\u0097\u009c\5\32\16\2\u0098\u0099\7\34\2\2\u0099\u009b\5\32\16\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0"+
		"\31\3\2\2\2\u00a1\u00a4\5\20\t\2\u00a2\u00a4\5\22\n\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\33\3\2\2\2\23)-8?FJSW^cmy\u0082\u0087\u008f"+
		"\u009c\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}