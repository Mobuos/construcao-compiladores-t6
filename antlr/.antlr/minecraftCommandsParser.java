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
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, CADEIA_N_FECHADA=15, 
		NUM_INT=16, NUM_REAL=17, COR_HEX=18, WS=19, COMENTARIO=20, DAR_ITEM=21, 
		TELEPORTE=22, ENCANTAR=23, CRIAR_MONSTRO=24, CONQUISTA=25, ALVO=26, ATRIBUICAO=27, 
		NEGACAO=28, SEPARADOR_COMANDO=29, VIRGULA=30, FIM_COMANDO=31, IDENT=32, 
		ERRO=33;
	public static final int
		RULE_programa = 0, RULE_coordenadas = 1, RULE_coordenada_termo = 2, RULE_origem_tp = 3, 
		RULE_destino_tp = 4, RULE_cmd = 5, RULE_cmd_dar_item = 6, RULE_cmd_teleporte = 7, 
		RULE_cmd_encantar = 8, RULE_cmd_criar_monstro = 9, RULE_cmd_conquista = 10, 
		RULE_cmd_atribuicao = 11, RULE_mod_encantamento = 12, RULE_mod_exibicao = 13, 
		RULE_mod_inquebravel = 14, RULE_mod_nome = 15, RULE_mod_semIA = 16, RULE_mod_invulneravel = 17, 
		RULE_mod_vida = 18, RULE_modificadores_monstro = 19, RULE_modificador_monstro = 20, 
		RULE_modificadores_item = 21, RULE_modificador_item = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "coordenadas", "coordenada_termo", "origem_tp", "destino_tp", 
			"cmd", "cmd_dar_item", "cmd_teleporte", "cmd_encantar", "cmd_criar_monstro", 
			"cmd_conquista", "cmd_atribuicao", "mod_encantamento", "mod_exibicao", 
			"mod_inquebravel", "mod_nome", "mod_semIA", "mod_invulneravel", "mod_vida", 
			"modificadores_monstro", "modificador_monstro", "modificadores_item", 
			"modificador_item"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAR_ITEM) | (1L << TELEPORTE) | (1L << ENCANTAR) | (1L << CRIAR_MONSTRO) | (1L << CONQUISTA) | (1L << IDENT))) != 0)) {
				{
				{
				setState(46);
				cmd();
				setState(47);
				match(FIM_COMANDO);
				}
				}
				setState(53);
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
		public List<Coordenada_termoContext> coordenada_termo() {
			return getRuleContexts(Coordenada_termoContext.class);
		}
		public Coordenada_termoContext coordenada_termo(int i) {
			return getRuleContext(Coordenada_termoContext.class,i);
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
			setState(54);
			match(T__0);
			setState(55);
			coordenada_termo();
			setState(56);
			match(VIRGULA);
			setState(57);
			coordenada_termo();
			setState(58);
			match(VIRGULA);
			setState(59);
			coordenada_termo();
			setState(60);
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

	public static class Coordenada_termoContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(minecraftCommandsParser.NUM_REAL, 0); }
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public Coordenada_termoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenada_termo; }
	}

	public final Coordenada_termoContext coordenada_termo() throws RecognitionException {
		Coordenada_termoContext _localctx = new Coordenada_termoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coordenada_termo);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(62);
					match(T__2);
					}
				}

				setState(65);
				_la = _input.LA(1);
				if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__2);
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
		enterRule(_localctx, 6, RULE_origem_tp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		enterRule(_localctx, 8, RULE_destino_tp);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(STRING);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				coordenadas();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
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
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAR_ITEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				cmd_dar_item();
				}
				break;
			case TELEPORTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				cmd_teleporte();
				}
				break;
			case ENCANTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				cmd_encantar();
				}
				break;
			case CRIAR_MONSTRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				cmd_criar_monstro();
				}
				break;
			case CONQUISTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				cmd_conquista();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
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
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
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
		enterRule(_localctx, 12, RULE_cmd_dar_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(DAR_ITEM);
			setState(85);
			match(SEPARADOR_COMANDO);
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				match(VIRGULA);
				setState(88);
				match(NUM_INT);
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(91);
				match(VIRGULA);
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(92);
					modificadores_item();
					}
					break;
				case IDENT:
					{
					setState(93);
					match(IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(98);
				match(ALVO);
				setState(99);
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
		enterRule(_localctx, 14, RULE_cmd_teleporte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(TELEPORTE);
			setState(103);
			match(SEPARADOR_COMANDO);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(104);
				origem_tp();
				setState(105);
				match(ALVO);
				}
				break;
			}
			setState(109);
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
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
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
		enterRule(_localctx, 16, RULE_cmd_encantar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ENCANTAR);
			setState(112);
			match(SEPARADOR_COMANDO);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(114);
				match(VIRGULA);
				setState(115);
				match(NUM_INT);
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(118);
				match(ALVO);
				setState(119);
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
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
		}
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
		enterRule(_localctx, 18, RULE_cmd_criar_monstro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CRIAR_MONSTRO);
			setState(123);
			match(SEPARADOR_COMANDO);
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(125);
				match(VIRGULA);
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(126);
					coordenadas();
					}
					break;
				case IDENT:
					{
					setState(127);
					match(IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(132);
				match(VIRGULA);
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(133);
					modificadores_monstro();
					}
					break;
				case IDENT:
					{
					setState(134);
					match(IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
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
		enterRule(_localctx, 20, RULE_cmd_conquista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CONQUISTA);
			setState(140);
			match(SEPARADOR_COMANDO);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(141);
				match(NEGACAO);
				}
			}

			setState(144);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(145);
				match(ALVO);
				setState(146);
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
		public TerminalNode COR_HEX() { return getToken(minecraftCommandsParser.COR_HEX, 0); }
		public Cmd_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atribuicao; }
	}

	public final Cmd_atribuicaoContext cmd_atribuicao() throws RecognitionException {
		Cmd_atribuicaoContext _localctx = new Cmd_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmd_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENT);
			setState(150);
			match(ATRIBUICAO);
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(151);
				coordenadas();
				}
				break;
			case 2:
				{
				setState(152);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(153);
				modificadores_item();
				}
				break;
			case 4:
				{
				setState(154);
				modificadores_monstro();
				}
				break;
			case 5:
				{
				setState(155);
				match(COR_HEX);
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
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(minecraftCommandsParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(minecraftCommandsParser.NUM_INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(minecraftCommandsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(minecraftCommandsParser.STRING, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
		}
		public Mod_encantamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_encantamento; }
	}

	public final Mod_encantamentoContext mod_encantamento() throws RecognitionException {
		Mod_encantamentoContext _localctx = new Mod_encantamentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mod_encantamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__3);
			setState(159);
			match(SEPARADOR_COMANDO);
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			match(VIRGULA);
			setState(162);
			match(NUM_INT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(163);
				match(T__4);
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				match(VIRGULA);
				setState(166);
				match(NUM_INT);
				}
				}
				setState(171);
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
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
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
		enterRule(_localctx, 26, RULE_mod_exibicao);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__6);
				setState(174);
				match(SEPARADOR_COMANDO);
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULA) {
					{
					setState(176);
					match(VIRGULA);
					setState(177);
					_la = _input.LA(1);
					if ( !(_la==COR_HEX || _la==IDENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(180);
					match(T__4);
					setState(181);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==IDENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VIRGULA) {
						{
						setState(182);
						match(VIRGULA);
						setState(183);
						_la = _input.LA(1);
						if ( !(_la==COR_HEX || _la==IDENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(190);
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
		enterRule(_localctx, 28, RULE_mod_inquebravel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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

	public static class Mod_nomeContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
		}
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public TerminalNode COR_HEX() { return getToken(minecraftCommandsParser.COR_HEX, 0); }
		public Mod_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_nome; }
	}

	public final Mod_nomeContext mod_nome() throws RecognitionException {
		Mod_nomeContext _localctx = new Mod_nomeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mod_nome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__5);
			setState(196);
			match(SEPARADOR_COMANDO);
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(198);
				match(VIRGULA);
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==COR_HEX || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 32, RULE_mod_semIA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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

	public static class Mod_invulneravelContext extends ParserRuleContext {
		public Mod_invulneravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_invulneravel; }
	}

	public final Mod_invulneravelContext mod_invulneravel() throws RecognitionException {
		Mod_invulneravelContext _localctx = new Mod_invulneravelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mod_invulneravel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 36, RULE_mod_vida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__10);
			setState(207);
			match(SEPARADOR_COMANDO);
			setState(208);
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
		enterRule(_localctx, 38, RULE_modificadores_monstro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__11);
			setState(211);
			modificador_monstro();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(212);
				match(T__12);
				}
				}
				setState(217);
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
		enterRule(_localctx, 40, RULE_modificador_monstro);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				mod_nome();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				mod_semIA();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				mod_vida();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
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
		enterRule(_localctx, 42, RULE_modificadores_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__11);
			setState(225);
			modificador_item();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(226);
				match(T__12);
				}
				}
				setState(231);
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
		enterRule(_localctx, 44, RULE_modificador_item);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				mod_encantamento();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				mod_exibicao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4"+
		"B\n\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7U\n\7\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\b\3\b\3\b\5\ba\n\b\5\b"+
		"c\n\b\3\b\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\nw\n\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0083\n\13\5\13\u0085\n\13\3\13\3\13\3\13\5\13\u008a\n\13\5\13\u008c"+
		"\n\13\3\f\3\f\3\f\5\f\u0091\n\f\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00aa\n\16\f\16\16\16\u00ad\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00b5\n\17\3\17\3\17\3\17\3\17\5\17\u00bb\n\17\7\17\u00bd\n"+
		"\17\f\17\16\17\u00c0\13\17\5\17\u00c2\n\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00cb\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u00d8\n\25\f\25\16\25\u00db\13\25\3\26\3\26\3\26\3\26"+
		"\5\26\u00e1\n\26\3\27\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27"+
		"\3\30\3\30\3\30\5\30\u00ee\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\5\3\2\22\23\4\2\20\20\"\"\4\2\24\24\"\"\2\u0100"+
		"\2\65\3\2\2\2\48\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fT\3\2\2\2\16"+
		"V\3\2\2\2\20h\3\2\2\2\22q\3\2\2\2\24|\3\2\2\2\26\u008d\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u00a0\3\2\2\2\34\u00c1\3\2\2\2\36\u00c3\3\2\2\2 \u00c5\3\2"+
		"\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d4\3\2\2\2*\u00e0"+
		"\3\2\2\2,\u00e2\3\2\2\2.\u00ed\3\2\2\2\60\61\5\f\7\2\61\62\7!\2\2\62\64"+
		"\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3"+
		"\3\2\2\2\67\65\3\2\2\289\7\3\2\29:\5\6\4\2:;\7 \2\2;<\5\6\4\2<=\7 \2\2"+
		"=>\5\6\4\2>?\7\4\2\2?\5\3\2\2\2@B\7\5\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2"+
		"\2CF\t\2\2\2DF\7\5\2\2EA\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\t\3\2\2H\t\3\2"+
		"\2\2IM\7\20\2\2JM\5\4\3\2KM\7\"\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13"+
		"\3\2\2\2NU\5\16\b\2OU\5\20\t\2PU\5\22\n\2QU\5\24\13\2RU\5\26\f\2SU\5\30"+
		"\r\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\r\3"+
		"\2\2\2VW\7\27\2\2WX\7\37\2\2X[\t\3\2\2YZ\7 \2\2Z\\\7\22\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\b\3\2\2\2]`\7 \2\2^a\5,\27\2_a\7\"\2\2`^\3\2\2\2`_\3\2\2"+
		"\2ac\3\2\2\2b]\3\2\2\2bc\3\2\2\2cf\3\2\2\2de\7\34\2\2eg\t\3\2\2fd\3\2"+
		"\2\2fg\3\2\2\2g\17\3\2\2\2hi\7\30\2\2im\7\37\2\2jk\5\b\5\2kl\7\34\2\2"+
		"ln\3\2\2\2mj\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\n\6\2p\21\3\2\2\2qr\7\31"+
		"\2\2rs\7\37\2\2sv\t\3\2\2tu\7 \2\2uw\7\22\2\2vt\3\2\2\2vw\3\2\2\2wz\3"+
		"\2\2\2xy\7\34\2\2y{\t\3\2\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|}\7\32\2\2"+
		"}~\7\37\2\2~\u0084\t\3\2\2\177\u0082\7 \2\2\u0080\u0083\5\4\3\2\u0081"+
		"\u0083\7\"\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\177\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\3\2\2\2\u0086\u0089"+
		"\7 \2\2\u0087\u008a\5(\25\2\u0088\u008a\7\"\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\25\3\2\2\2\u008d\u008e\7\33\2\2\u008e\u0090\7\37\2\2\u008f"+
		"\u0091\7\36\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0095\t\3\2\2\u0093\u0094\7\34\2\2\u0094\u0096\t\3\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098\7\"\2"+
		"\2\u0098\u009e\7\35\2\2\u0099\u009f\5\4\3\2\u009a\u009f\7\20\2\2\u009b"+
		"\u009f\5,\27\2\u009c\u009f\5(\25\2\u009d\u009f\7\24\2\2\u009e\u0099\3"+
		"\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\7\37\2"+
		"\2\u00a2\u00a3\t\3\2\2\u00a3\u00a4\7 \2\2\u00a4\u00ab\7\22\2\2\u00a5\u00a6"+
		"\7\7\2\2\u00a6\u00a7\t\3\2\2\u00a7\u00a8\7 \2\2\u00a8\u00aa\7\22\2\2\u00a9"+
		"\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\33\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00c2\7\b\2\2\u00af\u00b0"+
		"\7\t\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b4\t\3\2\2\u00b2\u00b3\7 \2\2\u00b3"+
		"\u00b5\t\4\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2"+
		"\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00ba\t\3\2\2\u00b8\u00b9\7 \2\2\u00b9"+
		"\u00bb\t\4\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00b6\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00ae\3\2"+
		"\2\2\u00c1\u00af\3\2\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4\37"+
		"\3\2\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00ca\t\3\2\2"+
		"\u00c8\u00c9\7 \2\2\u00c9\u00cb\t\4\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7\13\2\2\u00cd#\3\2\2\2\u00ce\u00cf"+
		"\7\f\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2\7\37\2\2\u00d2"+
		"\u00d3\7\23\2\2\u00d3\'\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d9\5*\26"+
		"\2\u00d6\u00d8\7\17\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da)\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00dc\u00e1\5 \21\2\u00dd\u00e1\5\"\22\2\u00de\u00e1\5&\24\2\u00df\u00e1"+
		"\5$\23\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1+\3\2\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e7\5.\30\2"+
		"\u00e4\u00e6\7\17\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8-\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ee\5\32\16\2\u00eb\u00ee\5\34\17\2\u00ec\u00ee\5\36\20\2\u00ed\u00ea"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee/\3\2\2\2\37\65"+
		"AELT[`bfmvz\u0082\u0084\u0089\u008b\u0090\u0095\u009e\u00ab\u00b4\u00ba"+
		"\u00be\u00c1\u00ca\u00d9\u00e0\u00e7\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}