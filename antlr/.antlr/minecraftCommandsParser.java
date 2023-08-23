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
		T__9=10, T__10=11, T__11=12, STRING=13, CADEIA_N_FECHADA=14, NUM_INT=15, 
		NUM_REAL=16, COR_HEX=17, WS=18, COORDENADA_TERMO=19, COMENTARIO=20, DAR_ITEM=21, 
		TELEPORTE=22, ENCANTAR=23, CRIAR_MONSTRO=24, CONQUISTA=25, ALVO=26, ATRIBUICAO=27, 
		NEGACAO=28, SEPARADOR_COMANDO=29, VIRGULA=30, FIM_COMANDO=31, IDENT=32, 
		ERRO=33;
	public static final int
		RULE_programa = 0, RULE_coordenadas = 1, RULE_origem_tp = 2, RULE_destino_tp = 3, 
		RULE_cmd = 4, RULE_cmd_dar_item = 5, RULE_cmd_teleporte = 6, RULE_cmd_encantar = 7, 
		RULE_cmd_criar_monstro = 8, RULE_cmd_conquista = 9, RULE_cmd_atribuicao = 10, 
		RULE_mod_encantamento = 11, RULE_mod_exibicao = 12, RULE_mod_inquebravel = 13, 
		RULE_mod_nome = 14, RULE_mod_semIA = 15, RULE_mod_invulneravel = 16, RULE_mod_vida = 17, 
		RULE_modificadores_monstro = 18, RULE_modificador_monstro = 19, RULE_modificadores_item = 20, 
		RULE_modificador_item = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "coordenadas", "origem_tp", "destino_tp", "cmd", "cmd_dar_item", 
			"cmd_teleporte", "cmd_encantar", "cmd_criar_monstro", "cmd_conquista", 
			"cmd_atribuicao", "mod_encantamento", "mod_exibicao", "mod_inquebravel", 
			"mod_nome", "mod_semIA", "mod_invulneravel", "mod_vida", "modificadores_monstro", 
			"modificador_monstro", "modificadores_item", "modificador_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'encantamento'", "'+'", "'nome'", "'lore'", "'inquebravel'", 
			"'semIA'", "'invulneravel'", "'vida'", "'{'", "'}'", null, null, null, 
			null, null, null, null, null, "'dar_item'", null, "'encantar'", "'criar_monstro'", 
			"'conquista'", "'->'", "'='", "'-'", "':'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "CADEIA_N_FECHADA", "NUM_INT", "NUM_REAL", "COR_HEX", 
			"WS", "COORDENADA_TERMO", "COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", 
			"CRIAR_MONSTRO", "CONQUISTA", "ALVO", "ATRIBUICAO", "NEGACAO", "SEPARADOR_COMANDO", 
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

	public static class ProgramaContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> FIM_COMANDO() { return getTokens(minecraftCommandsParser.FIM_COMANDO); }
		public TerminalNode FIM_COMANDO(int i) {
			return getToken(minecraftCommandsParser.FIM_COMANDO, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAR_ITEM) | (1L << TELEPORTE) | (1L << ENCANTAR) | (1L << CRIAR_MONSTRO) | (1L << CONQUISTA) | (1L << IDENT))) != 0)) {
				{
				{
				setState(44);
				cmd();
				setState(45);
				match(FIM_COMANDO);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CoordenadasContext extends ParserRuleContext {
		public List<TerminalNode> COORDENADA_TERMO() { return getTokens(minecraftCommandsParser.COORDENADA_TERMO); }
		public TerminalNode COORDENADA_TERMO(int i) {
			return getToken(minecraftCommandsParser.COORDENADA_TERMO, i);
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
		enterRule(_localctx, 2, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(COORDENADA_TERMO);
			setState(54);
			match(VIRGULA);
			setState(55);
			match(COORDENADA_TERMO);
			setState(56);
			match(VIRGULA);
			setState(57);
			match(COORDENADA_TERMO);
			setState(58);
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

	public static class Origem_tpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public Origem_tpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origem_tp; }
	}

	public final Origem_tpContext origem_tp() throws RecognitionException {
		Origem_tpContext _localctx = new Origem_tpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_origem_tp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
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

	public static class Destino_tpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public Destino_tpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destino_tp; }
	}

	public final Destino_tpContext destino_tp() throws RecognitionException {
		Destino_tpContext _localctx = new Destino_tpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_destino_tp);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(STRING);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				coordenadas();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(IDENT);
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

	public static class CmdContext extends ParserRuleContext {
		public Cmd_dar_itemContext cmd_dar_item() {
			return getRuleContext(Cmd_dar_itemContext.class,0);
		}
		public Cmd_teleporteContext cmd_teleporte() {
			return getRuleContext(Cmd_teleporteContext.class,0);
		}
		public Cmd_encantarContext cmd_encantar() {
			return getRuleContext(Cmd_encantarContext.class,0);
		}
		public Cmd_criar_monstroContext cmd_criar_monstro() {
			return getRuleContext(Cmd_criar_monstroContext.class,0);
		}
		public Cmd_conquistaContext cmd_conquista() {
			return getRuleContext(Cmd_conquistaContext.class,0);
		}
		public Cmd_atribuicaoContext cmd_atribuicao() {
			return getRuleContext(Cmd_atribuicaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAR_ITEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				cmd_dar_item();
				}
				break;
			case TELEPORTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				cmd_teleporte();
				}
				break;
			case ENCANTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				cmd_encantar();
				}
				break;
			case CRIAR_MONSTRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				cmd_criar_monstro();
				}
				break;
			case CONQUISTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				cmd_conquista();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				cmd_atribuicao();
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

	public static class Cmd_dar_itemContext extends ParserRuleContext {
		public TerminalNode DAR_ITEM() { return getToken(minecraftCommandsParser.DAR_ITEM, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public Modificadores_itemContext modificadores_item() {
			return getRuleContext(Modificadores_itemContext.class,0);
		}
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public Cmd_dar_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_dar_item; }
	}

	public final Cmd_dar_itemContext cmd_dar_item() throws RecognitionException {
		Cmd_dar_itemContext _localctx = new Cmd_dar_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_dar_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DAR_ITEM);
			setState(76);
			match(SEPARADOR_COMANDO);
			setState(77);
			match(STRING);
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
				match(VIRGULA);
				setState(79);
				match(NUM_INT);
				}
				break;
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(82);
				match(VIRGULA);
				setState(83);
				modificadores_item();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(86);
				match(ALVO);
				setState(87);
				match(STRING);
				}
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

	public static class Cmd_teleporteContext extends ParserRuleContext {
		public TerminalNode TELEPORTE() { return getToken(minecraftCommandsParser.TELEPORTE, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public Destino_tpContext destino_tp() {
			return getRuleContext(Destino_tpContext.class,0);
		}
		public Origem_tpContext origem_tp() {
			return getRuleContext(Origem_tpContext.class,0);
		}
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public Cmd_teleporteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_teleporte; }
	}

	public final Cmd_teleporteContext cmd_teleporte() throws RecognitionException {
		Cmd_teleporteContext _localctx = new Cmd_teleporteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_teleporte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(TELEPORTE);
			setState(91);
			match(SEPARADOR_COMANDO);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(92);
				origem_tp();
				setState(93);
				match(ALVO);
				}
				break;
			}
			setState(97);
			destino_tp();
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
		enterRule(_localctx, 14, RULE_cmd_encantar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ENCANTAR);
			setState(100);
			match(SEPARADOR_COMANDO);
			setState(101);
			match(STRING);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(102);
				match(VIRGULA);
				setState(103);
				match(NUM_INT);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(106);
				match(ALVO);
				setState(107);
				match(STRING);
				}
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

	public static class Cmd_criar_monstroContext extends ParserRuleContext {
		public TerminalNode CRIAR_MONSTRO() { return getToken(minecraftCommandsParser.CRIAR_MONSTRO, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
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
		enterRule(_localctx, 16, RULE_cmd_criar_monstro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CRIAR_MONSTRO);
			setState(111);
			match(SEPARADOR_COMANDO);
			setState(112);
			match(STRING);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(113);
				match(VIRGULA);
				setState(114);
				coordenadas();
				}
				break;
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(117);
				match(VIRGULA);
				setState(118);
				modificadores_monstro();
				}
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

	public static class Cmd_conquistaContext extends ParserRuleContext {
		public TerminalNode CONQUISTA() { return getToken(minecraftCommandsParser.CONQUISTA, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public TerminalNode NEGACAO() { return getToken(minecraftCommandsParser.NEGACAO, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public Cmd_conquistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_conquista; }
	}

	public final Cmd_conquistaContext cmd_conquista() throws RecognitionException {
		Cmd_conquistaContext _localctx = new Cmd_conquistaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd_conquista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CONQUISTA);
			setState(122);
			match(SEPARADOR_COMANDO);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(123);
				match(NEGACAO);
				}
			}

			setState(126);
			match(STRING);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(127);
				match(ALVO);
				setState(128);
				match(STRING);
				}
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
		enterRule(_localctx, 20, RULE_cmd_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENT);
			setState(132);
			match(ATRIBUICAO);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(133);
				coordenadas();
				}
				break;
			case 2:
				{
				setState(134);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(135);
				modificadores_item();
				}
				break;
			case 4:
				{
				setState(136);
				modificadores_monstro();
				}
				break;
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

	public static class Mod_encantamentoContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(minecraftCommandsParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(minecraftCommandsParser.NUM_INT, i);
		}
		public Mod_encantamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_encantamento; }
	}

	public final Mod_encantamentoContext mod_encantamento() throws RecognitionException {
		Mod_encantamentoContext _localctx = new Mod_encantamentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mod_encantamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__2);
			setState(140);
			match(SEPARADOR_COMANDO);
			setState(141);
			match(STRING);
			setState(142);
			match(VIRGULA);
			setState(143);
			match(NUM_INT);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(144);
				match(T__3);
				setState(145);
				match(STRING);
				setState(146);
				match(VIRGULA);
				setState(147);
				match(NUM_INT);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Mod_exibicaoContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public List<TerminalNode> COR_HEX() { return getTokens(minecraftCommandsParser.COR_HEX); }
		public TerminalNode COR_HEX(int i) {
			return getToken(minecraftCommandsParser.COR_HEX, i);
		}
		public Mod_exibicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_exibicao; }
	}

	public final Mod_exibicaoContext mod_exibicao() throws RecognitionException {
		Mod_exibicaoContext _localctx = new Mod_exibicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mod_exibicao);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__5);
				setState(155);
				match(SEPARADOR_COMANDO);
				setState(156);
				match(STRING);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULA) {
					{
					setState(157);
					match(VIRGULA);
					setState(158);
					match(COR_HEX);
					}
				}

				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(161);
					match(T__3);
					setState(162);
					match(STRING);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VIRGULA) {
						{
						setState(163);
						match(VIRGULA);
						setState(164);
						match(COR_HEX);
						}
					}

					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Mod_inquebravelContext extends ParserRuleContext {
		public Mod_inquebravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_inquebravel; }
	}

	public final Mod_inquebravelContext mod_inquebravel() throws RecognitionException {
		Mod_inquebravelContext _localctx = new Mod_inquebravelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mod_inquebravel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__6);
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

	public static class Mod_nomeContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public TerminalNode COR_HEX() { return getToken(minecraftCommandsParser.COR_HEX, 0); }
		public Mod_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_nome; }
	}

	public final Mod_nomeContext mod_nome() throws RecognitionException {
		Mod_nomeContext _localctx = new Mod_nomeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mod_nome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__4);
			setState(177);
			match(SEPARADOR_COMANDO);
			setState(178);
			match(STRING);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(179);
				match(VIRGULA);
				setState(180);
				match(COR_HEX);
				}
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

	public static class Mod_semIAContext extends ParserRuleContext {
		public Mod_semIAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_semIA; }
	}

	public final Mod_semIAContext mod_semIA() throws RecognitionException {
		Mod_semIAContext _localctx = new Mod_semIAContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mod_semIA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__7);
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

	public static class Mod_invulneravelContext extends ParserRuleContext {
		public Mod_invulneravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_invulneravel; }
	}

	public final Mod_invulneravelContext mod_invulneravel() throws RecognitionException {
		Mod_invulneravelContext _localctx = new Mod_invulneravelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mod_invulneravel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__8);
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

	public static class Mod_vidaContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode NUM_REAL() { return getToken(minecraftCommandsParser.NUM_REAL, 0); }
		public Mod_vidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_vida; }
	}

	public final Mod_vidaContext mod_vida() throws RecognitionException {
		Mod_vidaContext _localctx = new Mod_vidaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mod_vida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__9);
			setState(188);
			match(SEPARADOR_COMANDO);
			setState(189);
			match(NUM_REAL);
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
		public Modificador_monstroContext modificador_monstro() {
			return getRuleContext(Modificador_monstroContext.class,0);
		}
		public Modificadores_monstroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadores_monstro; }
	}

	public final Modificadores_monstroContext modificadores_monstro() throws RecognitionException {
		Modificadores_monstroContext _localctx = new Modificadores_monstroContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modificadores_monstro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__10);
			setState(192);
			modificador_monstro();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(193);
				match(T__11);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Modificador_monstroContext extends ParserRuleContext {
		public Mod_nomeContext mod_nome() {
			return getRuleContext(Mod_nomeContext.class,0);
		}
		public Mod_semIAContext mod_semIA() {
			return getRuleContext(Mod_semIAContext.class,0);
		}
		public Mod_vidaContext mod_vida() {
			return getRuleContext(Mod_vidaContext.class,0);
		}
		public Mod_invulneravelContext mod_invulneravel() {
			return getRuleContext(Mod_invulneravelContext.class,0);
		}
		public Modificador_monstroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador_monstro; }
	}

	public final Modificador_monstroContext modificador_monstro() throws RecognitionException {
		Modificador_monstroContext _localctx = new Modificador_monstroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modificador_monstro);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				mod_nome();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				mod_semIA();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				mod_vida();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				mod_invulneravel();
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

	public static class Modificadores_itemContext extends ParserRuleContext {
		public Modificador_itemContext modificador_item() {
			return getRuleContext(Modificador_itemContext.class,0);
		}
		public Modificadores_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadores_item; }
	}

	public final Modificadores_itemContext modificadores_item() throws RecognitionException {
		Modificadores_itemContext _localctx = new Modificadores_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modificadores_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__10);
			setState(206);
			modificador_item();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(207);
				match(T__11);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Modificador_itemContext extends ParserRuleContext {
		public Mod_encantamentoContext mod_encantamento() {
			return getRuleContext(Mod_encantamentoContext.class,0);
		}
		public Mod_exibicaoContext mod_exibicao() {
			return getRuleContext(Mod_exibicaoContext.class,0);
		}
		public Mod_inquebravelContext mod_inquebravel() {
			return getRuleContext(Mod_inquebravelContext.class,0);
		}
		public Modificador_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador_item; }
	}

	public final Modificador_itemContext modificador_item() throws RecognitionException {
		Modificador_itemContext _localctx = new Modificador_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modificador_item);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				mod_encantamento();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				mod_exibicao();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				mod_inquebravel();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\5\5D\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"S\n\7\3\7\3\7\5\7W\n\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\nv\n\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\13\5\13\177\n\13\3\13\3\13\3"+
		"\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\16\3\16\5\16\u00a8\n\16"+
		"\7\16\u00aa\n\16\f\16\16\16\u00ad\13\16\5\16\u00af\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00b8\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u00c5\n\24\f\24\16\24\u00c8\13\24\3\25\3\25"+
		"\3\25\3\25\5\25\u00ce\n\25\3\26\3\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6"+
		"\13\26\3\27\3\27\3\27\5\27\u00db\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,\2\3\4\2\17\17\"\"\2\u00e8\2\63\3\2\2\2\4\66"+
		"\3\2\2\2\6>\3\2\2\2\bC\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16\\\3\2\2\2\20e"+
		"\3\2\2\2\22p\3\2\2\2\24{\3\2\2\2\26\u0085\3\2\2\2\30\u008d\3\2\2\2\32"+
		"\u00ae\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b9\3\2\2\2\"\u00bb"+
		"\3\2\2\2$\u00bd\3\2\2\2&\u00c1\3\2\2\2(\u00cd\3\2\2\2*\u00cf\3\2\2\2,"+
		"\u00da\3\2\2\2./\5\n\6\2/\60\7!\2\2\60\62\3\2\2\2\61.\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\7"+
		"\3\2\2\678\7\25\2\289\7 \2\29:\7\25\2\2:;\7 \2\2;<\7\25\2\2<=\7\4\2\2"+
		"=\5\3\2\2\2>?\t\2\2\2?\7\3\2\2\2@D\7\17\2\2AD\5\4\3\2BD\7\"\2\2C@\3\2"+
		"\2\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EL\5\f\7\2FL\5\16\b\2GL\5\20\t\2HL"+
		"\5\22\n\2IL\5\24\13\2JL\5\26\f\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2"+
		"\2KI\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2MN\7\27\2\2NO\7\37\2\2OR\7\17\2\2PQ"+
		"\7 \2\2QS\7\21\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TU\7 \2\2UW\5*\26\2VT"+
		"\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XY\7\34\2\2Y[\7\17\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\r\3\2\2\2\\]\7\30\2\2]a\7\37\2\2^_\5\6\4\2_`\7\34\2\2`b\3\2\2\2a^\3"+
		"\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\b\5\2d\17\3\2\2\2ef\7\31\2\2fg\7\37\2\2"+
		"gj\7\17\2\2hi\7 \2\2ik\7\21\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lm\7\34\2"+
		"\2mo\7\17\2\2nl\3\2\2\2no\3\2\2\2o\21\3\2\2\2pq\7\32\2\2qr\7\37\2\2ru"+
		"\7\17\2\2st\7 \2\2tv\5\4\3\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wx\7 \2\2xz"+
		"\5&\24\2yw\3\2\2\2yz\3\2\2\2z\23\3\2\2\2{|\7\33\2\2|~\7\37\2\2}\177\7"+
		"\36\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\7\17\2\2"+
		"\u0081\u0082\7\34\2\2\u0082\u0084\7\17\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086\7\"\2\2\u0086\u008b\7\35\2\2\u0087"+
		"\u008c\5\4\3\2\u0088\u008c\7\17\2\2\u0089\u008c\5*\26\2\u008a\u008c\5"+
		"&\24\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\7\5\2\2\u008e\u008f\7\37\2"+
		"\2\u008f\u0090\7\17\2\2\u0090\u0091\7 \2\2\u0091\u0098\7\21\2\2\u0092"+
		"\u0093\7\6\2\2\u0093\u0094\7\17\2\2\u0094\u0095\7 \2\2\u0095\u0097\7\21"+
		"\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\31\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00af\7\7\2"+
		"\2\u009c\u009d\7\b\2\2\u009d\u009e\7\37\2\2\u009e\u00a1\7\17\2\2\u009f"+
		"\u00a0\7 \2\2\u00a0\u00a2\7\23\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00ab\3\2\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a7\7\17\2\2\u00a5"+
		"\u00a6\7 \2\2\u00a6\u00a8\7\23\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u009b\3\2\2\2\u00ae\u009c\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b1"+
		"\7\t\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\7\37\2\2\u00b4"+
		"\u00b7\7\17\2\2\u00b5\u00b6\7 \2\2\u00b6\u00b8\7\23\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\n\2\2\u00ba"+
		"!\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc#\3\2\2\2\u00bd\u00be\7\f\2\2\u00be"+
		"\u00bf\7\37\2\2\u00bf\u00c0\7\22\2\2\u00c0%\3\2\2\2\u00c1\u00c2\7\r\2"+
		"\2\u00c2\u00c6\5(\25\2\u00c3\u00c5\7\16\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\'\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00ce\5\36\20\2\u00ca\u00ce\5 \21\2\u00cb\u00ce"+
		"\5$\23\2\u00cc\u00ce\5\"\22\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7"+
		"\r\2\2\u00d0\u00d4\5,\27\2\u00d1\u00d3\7\16\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5+\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00db\5\30\r\2\u00d8\u00db\5\32\16\2\u00d9"+
		"\u00db\5\34\17\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db-\3\2\2\2\32\63CKRVZajnuy~\u0083\u008b\u0098\u00a1\u00a7\u00ab"+
		"\u00ae\u00b7\u00c6\u00cd\u00d4\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}