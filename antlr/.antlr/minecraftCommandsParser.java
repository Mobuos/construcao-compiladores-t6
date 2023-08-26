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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, CADEIA_N_FECHADA=16, 
		NUM_INT=17, NUM_REAL=18, COR_HEX=19, WS=20, COMENTARIO=21, DAR_ITEM=22, 
		TELEPORTE=23, ENCANTAR=24, CRIAR_MOB=25, CONQUISTA=26, ALVO=27, ATRIBUICAO=28, 
		NEGACAO=29, SEPARADOR_COMANDO=30, VIRGULA=31, FIM_COMANDO=32, IDENT=33, 
		ERRO=34;
	public static final int
		RULE_coordenadas = 0, RULE_coordenada_termo = 1, RULE_origem_tp = 2, RULE_destino_tp = 3, 
		RULE_player = 4, RULE_item = 5, RULE_mod = 6, RULE_encantamento_var = 7, 
		RULE_mob = 8, RULE_coordenada_var = 9, RULE_conquista_var = 10, RULE_texto = 11, 
		RULE_cor = 12, RULE_programa = 13, RULE_cmd = 14, RULE_cmd_dar_item = 15, 
		RULE_cmd_teleporte = 16, RULE_cmd_encantar = 17, RULE_cmd_criar_mob = 18, 
		RULE_cmd_conquista = 19, RULE_cmd_atribuicao = 20, RULE_mod_encantamento = 21, 
		RULE_mod_exibicao = 22, RULE_mod_inquebravel = 23, RULE_mod_nome_mob = 24, 
		RULE_mod_semIA = 25, RULE_mod_invulneravel = 26, RULE_mod_vida = 27, RULE_modificadores_mob = 28, 
		RULE_modificador_mob = 29, RULE_modificadores_item = 30, RULE_modificador_item = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"coordenadas", "coordenada_termo", "origem_tp", "destino_tp", "player", 
			"item", "mod", "encantamento_var", "mob", "coordenada_var", "conquista_var", 
			"texto", "cor", "programa", "cmd", "cmd_dar_item", "cmd_teleporte", "cmd_encantar", 
			"cmd_criar_mob", "cmd_conquista", "cmd_atribuicao", "mod_encantamento", 
			"mod_exibicao", "mod_inquebravel", "mod_nome_mob", "mod_semIA", "mod_invulneravel", 
			"mod_vida", "modificadores_mob", "modificador_mob", "modificadores_item", 
			"modificador_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'~'", "'encantamento'", "'+'", "'nome'", "'lore'", 
			"'inquebravel'", "'nome_mob'", "'semIA'", "'invulneravel'", "'vida'", 
			"'{'", "'}'", null, null, null, null, null, null, null, "'dar_item'", 
			null, "'encantar'", "'criar_mob'", "'conquista'", "'->'", "'='", "'-'", 
			"':'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "CADEIA_N_FECHADA", "NUM_INT", "NUM_REAL", 
			"COR_HEX", "WS", "COMENTARIO", "DAR_ITEM", "TELEPORTE", "ENCANTAR", "CRIAR_MOB", 
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
		enterRule(_localctx, 0, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			coordenada_termo();
			setState(66);
			match(VIRGULA);
			setState(67);
			coordenada_termo();
			setState(68);
			match(VIRGULA);
			setState(69);
			coordenada_termo();
			setState(70);
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
		enterRule(_localctx, 2, RULE_coordenada_termo);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(72);
					match(T__2);
					}
				}

				setState(75);
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
				setState(76);
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
			setState(79);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(STRING);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				coordenadas();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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

	public static class ModContext extends ParserRuleContext {
		public Modificadores_itemContext modificadores_item() {
			return getRuleContext(Modificadores_itemContext.class,0);
		}
		public Modificadores_mobContext modificadores_mob() {
			return getRuleContext(Modificadores_mobContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mod);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				modificadores_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				modificadores_mob();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(IDENT);
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

	public static class Encantamento_varContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public Encantamento_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamento_var; }
	}

	public final Encantamento_varContext encantamento_var() throws RecognitionException {
		Encantamento_varContext _localctx = new Encantamento_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_encantamento_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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

	public static class MobContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public MobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mob; }
	}

	public final MobContext mob() throws RecognitionException {
		MobContext _localctx = new MobContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class Coordenada_varContext extends ParserRuleContext {
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public Coordenada_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenada_var; }
	}

	public final Coordenada_varContext coordenada_var() throws RecognitionException {
		Coordenada_varContext _localctx = new Coordenada_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coordenada_var);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				coordenadas();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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

	public static class Conquista_varContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public Conquista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conquista_var; }
	}

	public final Conquista_varContext conquista_var() throws RecognitionException {
		Conquista_varContext _localctx = new Conquista_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conquista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(minecraftCommandsParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class CorContext extends ParserRuleContext {
		public TerminalNode COR_HEX() { return getToken(minecraftCommandsParser.COR_HEX, 0); }
		public TerminalNode IDENT() { return getToken(minecraftCommandsParser.IDENT, 0); }
		public CorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor; }
	}

	public final CorContext cor() throws RecognitionException {
		CorContext _localctx = new CorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 26, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAR_ITEM) | (1L << TELEPORTE) | (1L << ENCANTAR) | (1L << CRIAR_MOB) | (1L << CONQUISTA) | (1L << IDENT))) != 0)) {
				{
				{
				setState(109);
				cmd();
				setState(110);
				match(FIM_COMANDO);
				}
				}
				setState(116);
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
		public Cmd_criar_mobContext cmd_criar_mob() {
			return getRuleContext(Cmd_criar_mobContext.class,0);
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
		enterRule(_localctx, 28, RULE_cmd);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAR_ITEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				cmd_dar_item();
				}
				break;
			case TELEPORTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				cmd_teleporte();
				}
				break;
			case ENCANTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				cmd_encantar();
				}
				break;
			case CRIAR_MOB:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				cmd_criar_mob();
				}
				break;
			case CONQUISTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				cmd_conquista();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
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
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public Cmd_dar_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_dar_item; }
	}

	public final Cmd_dar_itemContext cmd_dar_item() throws RecognitionException {
		Cmd_dar_itemContext _localctx = new Cmd_dar_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmd_dar_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DAR_ITEM);
			setState(126);
			match(SEPARADOR_COMANDO);
			setState(127);
			item();
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(128);
				match(VIRGULA);
				setState(129);
				match(NUM_INT);
				}
				break;
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(132);
				match(VIRGULA);
				setState(133);
				mod();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(136);
				match(ALVO);
				setState(137);
				player();
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
		enterRule(_localctx, 32, RULE_cmd_teleporte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TELEPORTE);
			setState(141);
			match(SEPARADOR_COMANDO);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(142);
				origem_tp();
				setState(143);
				match(ALVO);
				}
				break;
			}
			setState(147);
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
		public Encantamento_varContext encantamento_var() {
			return getRuleContext(Encantamento_varContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
		}
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public Cmd_encantarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_encantar; }
	}

	public final Cmd_encantarContext cmd_encantar() throws RecognitionException {
		Cmd_encantarContext _localctx = new Cmd_encantarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd_encantar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ENCANTAR);
			setState(150);
			match(SEPARADOR_COMANDO);
			setState(151);
			encantamento_var();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(152);
				match(VIRGULA);
				setState(153);
				match(NUM_INT);
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(156);
				match(ALVO);
				setState(157);
				player();
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

	public static class Cmd_criar_mobContext extends ParserRuleContext {
		public TerminalNode CRIAR_MOB() { return getToken(minecraftCommandsParser.CRIAR_MOB, 0); }
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public MobContext mob() {
			return getRuleContext(MobContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public Coordenada_varContext coordenada_var() {
			return getRuleContext(Coordenada_varContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public Cmd_criar_mobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_criar_mob; }
	}

	public final Cmd_criar_mobContext cmd_criar_mob() throws RecognitionException {
		Cmd_criar_mobContext _localctx = new Cmd_criar_mobContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmd_criar_mob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CRIAR_MOB);
			setState(161);
			match(SEPARADOR_COMANDO);
			setState(162);
			mob();
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(163);
				match(VIRGULA);
				setState(164);
				coordenada_var();
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(167);
				match(VIRGULA);
				setState(168);
				mod();
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
		public Conquista_varContext conquista_var() {
			return getRuleContext(Conquista_varContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(minecraftCommandsParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(minecraftCommandsParser.IDENT, i);
		}
		public TerminalNode NEGACAO() { return getToken(minecraftCommandsParser.NEGACAO, 0); }
		public TerminalNode ALVO() { return getToken(minecraftCommandsParser.ALVO, 0); }
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public Cmd_conquistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_conquista; }
	}

	public final Cmd_conquistaContext cmd_conquista() throws RecognitionException {
		Cmd_conquistaContext _localctx = new Cmd_conquistaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmd_conquista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(CONQUISTA);
			setState(172);
			match(SEPARADOR_COMANDO);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(173);
				match(NEGACAO);
				}
			}

			setState(176);
			conquista_var();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALVO) {
				{
				setState(177);
				match(ALVO);
				setState(178);
				player();
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
		public Modificadores_mobContext modificadores_mob() {
			return getRuleContext(Modificadores_mobContext.class,0);
		}
		public TerminalNode COR_HEX() { return getToken(minecraftCommandsParser.COR_HEX, 0); }
		public Cmd_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atribuicao; }
	}

	public final Cmd_atribuicaoContext cmd_atribuicao() throws RecognitionException {
		Cmd_atribuicaoContext _localctx = new Cmd_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENT);
			setState(182);
			match(ATRIBUICAO);
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(183);
				coordenadas();
				}
				break;
			case 2:
				{
				setState(184);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(185);
				modificadores_item();
				}
				break;
			case 4:
				{
				setState(186);
				modificadores_mob();
				}
				break;
			case 5:
				{
				setState(187);
				match(COR_HEX);
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
		public List<Encantamento_varContext> encantamento_var() {
			return getRuleContexts(Encantamento_varContext.class);
		}
		public Encantamento_varContext encantamento_var(int i) {
			return getRuleContext(Encantamento_varContext.class,i);
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
		enterRule(_localctx, 42, RULE_mod_encantamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__3);
			setState(191);
			match(SEPARADOR_COMANDO);
			setState(192);
			encantamento_var();
			setState(193);
			match(VIRGULA);
			setState(194);
			match(NUM_INT);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(195);
				match(T__4);
				setState(196);
				encantamento_var();
				setState(197);
				match(VIRGULA);
				setState(198);
				match(NUM_INT);
				}
				}
				setState(204);
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
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(minecraftCommandsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(minecraftCommandsParser.VIRGULA, i);
		}
		public List<CorContext> cor() {
			return getRuleContexts(CorContext.class);
		}
		public CorContext cor(int i) {
			return getRuleContext(CorContext.class,i);
		}
		public Mod_exibicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_exibicao; }
	}

	public final Mod_exibicaoContext mod_exibicao() throws RecognitionException {
		Mod_exibicaoContext _localctx = new Mod_exibicaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mod_exibicao);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__6);
				setState(207);
				match(SEPARADOR_COMANDO);
				setState(208);
				texto();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULA) {
					{
					setState(209);
					match(VIRGULA);
					setState(210);
					cor();
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(213);
					match(T__4);
					setState(214);
					texto();
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VIRGULA) {
						{
						setState(215);
						match(VIRGULA);
						setState(216);
						cor();
						}
					}

					}
					}
					setState(223);
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
		enterRule(_localctx, 46, RULE_mod_inquebravel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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

	public static class Mod_nome_mobContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_COMANDO() { return getToken(minecraftCommandsParser.SEPARADOR_COMANDO, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(minecraftCommandsParser.VIRGULA, 0); }
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public Mod_nome_mobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_nome_mob; }
	}

	public final Mod_nome_mobContext mod_nome_mob() throws RecognitionException {
		Mod_nome_mobContext _localctx = new Mod_nome_mobContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mod_nome_mob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__8);
			setState(229);
			match(SEPARADOR_COMANDO);
			setState(230);
			texto();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(231);
				match(VIRGULA);
				setState(232);
				cor();
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
		enterRule(_localctx, 50, RULE_mod_semIA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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

	public static class Mod_invulneravelContext extends ParserRuleContext {
		public Mod_invulneravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_invulneravel; }
	}

	public final Mod_invulneravelContext mod_invulneravel() throws RecognitionException {
		Mod_invulneravelContext _localctx = new Mod_invulneravelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mod_invulneravel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__10);
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
		public TerminalNode NUM_INT() { return getToken(minecraftCommandsParser.NUM_INT, 0); }
		public Mod_vidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_vida; }
	}

	public final Mod_vidaContext mod_vida() throws RecognitionException {
		Mod_vidaContext _localctx = new Mod_vidaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mod_vida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__11);
			setState(240);
			match(SEPARADOR_COMANDO);
			setState(241);
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

	public static class Modificadores_mobContext extends ParserRuleContext {
		public Modificador_mobContext modificador_mob() {
			return getRuleContext(Modificador_mobContext.class,0);
		}
		public Modificadores_mobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadores_mob; }
	}

	public final Modificadores_mobContext modificadores_mob() throws RecognitionException {
		Modificadores_mobContext _localctx = new Modificadores_mobContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_modificadores_mob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__12);
			setState(244);
			modificador_mob();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(245);
				match(T__13);
				}
				}
				setState(250);
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

	public static class Modificador_mobContext extends ParserRuleContext {
		public Mod_nome_mobContext mod_nome_mob() {
			return getRuleContext(Mod_nome_mobContext.class,0);
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
		public Modificador_mobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador_mob; }
	}

	public final Modificador_mobContext modificador_mob() throws RecognitionException {
		Modificador_mobContext _localctx = new Modificador_mobContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_modificador_mob);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				mod_nome_mob();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				mod_semIA();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				mod_vida();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
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
		enterRule(_localctx, 60, RULE_modificadores_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__12);
			setState(258);
			modificador_item();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(259);
				match(T__13);
				}
				}
				setState(264);
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
		enterRule(_localctx, 62, RULE_modificador_item);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				mod_encantamento();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				mod_exibicao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\5\3L\n\3\3\3\3\3\5\3P\n\3\3\4"+
		"\3\4\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b`\n\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\5\13h\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\7\17s\n\17\f\17\16\17v\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20~\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0085\n\21\3\21\3\21\5\21\u0089\n\21\3"+
		"\21\3\21\5\21\u008d\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0094\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u009d\n\23\3\23\3\23\5\23\u00a1\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a8\n\24\3\24\3\24\5\24\u00ac\n\24"+
		"\3\25\3\25\3\25\5\25\u00b1\n\25\3\25\3\25\3\25\5\25\u00b6\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00bf\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u00cb\n\27\f\27\16\27\u00ce\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00d6\n\30\3\30\3\30\3\30\3\30\5\30\u00dc"+
		"\n\30\7\30\u00de\n\30\f\30\16\30\u00e1\13\30\5\30\u00e3\n\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00ec\n\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\7\36\u00f9\n\36\f\36\16\36\u00fc\13\36\3\37"+
		"\3\37\3\37\3\37\5\37\u0102\n\37\3 \3 \3 \7 \u0107\n \f \16 \u010a\13 "+
		"\3!\3!\3!\5!\u010f\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@\2\5\3\2\23\24\4\2\21\21##\4\2\25\25##\2\u0118"+
		"\2B\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16"+
		"_\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30k\3\2\2\2"+
		"\32m\3\2\2\2\34t\3\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u008e\3\2\2\2$\u0097"+
		"\3\2\2\2&\u00a2\3\2\2\2(\u00ad\3\2\2\2*\u00b7\3\2\2\2,\u00c0\3\2\2\2."+
		"\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62\u00e6\3\2\2\2\64\u00ed\3\2\2\2\66\u00ef"+
		"\3\2\2\28\u00f1\3\2\2\2:\u00f5\3\2\2\2<\u0101\3\2\2\2>\u0103\3\2\2\2@"+
		"\u010e\3\2\2\2BC\7\3\2\2CD\5\4\3\2DE\7!\2\2EF\5\4\3\2FG\7!\2\2GH\5\4\3"+
		"\2HI\7\4\2\2I\3\3\2\2\2JL\7\5\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MP\t\2"+
		"\2\2NP\7\5\2\2OK\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QR\t\3\2\2R\7\3\2\2\2SW\7"+
		"\21\2\2TW\5\2\2\2UW\7#\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\t\3\2\2\2XY"+
		"\t\3\2\2Y\13\3\2\2\2Z[\t\3\2\2[\r\3\2\2\2\\`\5> \2]`\5:\36\2^`\7#\2\2"+
		"_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\17\3\2\2\2ab\t\3\2\2b\21\3\2\2\2cd\t"+
		"\3\2\2d\23\3\2\2\2eh\5\2\2\2fh\7#\2\2ge\3\2\2\2gf\3\2\2\2h\25\3\2\2\2"+
		"ij\t\3\2\2j\27\3\2\2\2kl\t\3\2\2l\31\3\2\2\2mn\t\4\2\2n\33\3\2\2\2op\5"+
		"\36\20\2pq\7\"\2\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u"+
		"\35\3\2\2\2vt\3\2\2\2w~\5 \21\2x~\5\"\22\2y~\5$\23\2z~\5&\24\2{~\5(\25"+
		"\2|~\5*\26\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2"+
		"\2~\37\3\2\2\2\177\u0080\7\30\2\2\u0080\u0081\7 \2\2\u0081\u0084\5\f\7"+
		"\2\u0082\u0083\7!\2\2\u0083\u0085\7\23\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\7!\2\2\u0087\u0089\5\16\b\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\7\35"+
		"\2\2\u008b\u008d\5\n\6\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"!\3\2\2\2\u008e\u008f\7\31\2\2\u008f\u0093\7 \2\2\u0090\u0091\5\6\4\2"+
		"\u0091\u0092\7\35\2\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\b\5\2\u0096#\3\2\2\2\u0097"+
		"\u0098\7\32\2\2\u0098\u0099\7 \2\2\u0099\u009c\5\20\t\2\u009a\u009b\7"+
		"!\2\2\u009b\u009d\7\23\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009f\7\35\2\2\u009f\u00a1\5\n\6\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1%\3\2\2\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4"+
		"\7 \2\2\u00a4\u00a7\5\22\n\2\u00a5\u00a6\7!\2\2\u00a6\u00a8\5\24\13\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa"+
		"\7!\2\2\u00aa\u00ac\5\16\b\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\'\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00b0\7 \2\2\u00af\u00b1\7\37\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5"+
		"\5\26\f\2\u00b3\u00b4\7\35\2\2\u00b4\u00b6\5\n\6\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6)\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00be\7\36"+
		"\2\2\u00b9\u00bf\5\2\2\2\u00ba\u00bf\7\21\2\2\u00bb\u00bf\5> \2\u00bc"+
		"\u00bf\5:\36\2\u00bd\u00bf\7\25\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3"+
		"\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"+\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7 \2\2\u00c2\u00c3\5\20\t\2"+
		"\u00c3\u00c4\7!\2\2\u00c4\u00cc\7\23\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7"+
		"\5\20\t\2\u00c7\u00c8\7!\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00cb\3\2\2\2"+
		"\u00ca\u00c5\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd-\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00e3\7\b\2\2\u00d0"+
		"\u00d1\7\t\2\2\u00d1\u00d2\7 \2\2\u00d2\u00d5\5\30\r\2\u00d3\u00d4\7!"+
		"\2\2\u00d4\u00d6\5\32\16\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00df\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00db\5\30\r\2\u00d9\u00da\7"+
		"!\2\2\u00da\u00dc\5\32\16\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00d7\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00cf\3\2\2\2\u00e2\u00d0\3\2\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7\n\2\2"+
		"\u00e5\61\3\2\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\7 \2\2\u00e8\u00eb"+
		"\5\30\r\2\u00e9\u00ea\7!\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00e9\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\63\3\2\2\2\u00ed\u00ee\7\f\2\2\u00ee\65\3\2"+
		"\2\2\u00ef\u00f0\7\r\2\2\u00f0\67\3\2\2\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3"+
		"\7 \2\2\u00f3\u00f4\t\2\2\2\u00f49\3\2\2\2\u00f5\u00f6\7\17\2\2\u00f6"+
		"\u00fa\5<\37\2\u00f7\u00f9\7\20\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb;\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u0102\5\62\32\2\u00fe\u0102\5\64\33\2\u00ff\u0102\58\35"+
		"\2\u0100\u0102\5\66\34\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102=\3\2\2\2\u0103\u0104\7\17\2\2"+
		"\u0104\u0108\5@!\2\u0105\u0107\7\20\2\2\u0106\u0105\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109?\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010f\5,\27\2\u010c\u010f\5.\30\2\u010d\u010f\5\60"+
		"\31\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"A\3\2\2\2\36KOV_gt}\u0084\u0088\u008c\u0093\u009c\u00a0\u00a7\u00ab\u00b0"+
		"\u00b5\u00be\u00cc\u00d5\u00db\u00df\u00e2\u00eb\u00fa\u0101\u0108\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}