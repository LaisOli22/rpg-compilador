// Generated from src/antlr/Expr.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, RACA=20, CLASSE=21, IDENTIFICADOR=22, NUM=23, COMENTARIO_LINHA=24, 
		COMENTARIO_BLOCO=25, WS=26;
	public static final int
		RULE_prog = 0, RULE_comando = 1, RULE_criarFicha = 2, RULE_editarFicha = 3, 
		RULE_declaracoesFicha = 4, RULE_declaracaoIdade = 5, RULE_declaracaoClasse = 6, 
		RULE_declaracaoRaca = 7, RULE_declaracaoNivel = 8, RULE_declaracaoVida = 9, 
		RULE_blocoAtributos = 10, RULE_declaracaoAtributo = 11, RULE_blocoInventario = 12, 
		RULE_declaracaoItem = 13, RULE_levelUp = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "comando", "criarFicha", "editarFicha", "declaracoesFicha", "declaracaoIdade", 
			"declaracaoClasse", "declaracaoRaca", "declaracaoNivel", "declaracaoVida", 
			"blocoAtributos", "declaracaoAtributo", "blocoInventario", "declaracaoItem", 
			"levelUp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CRIAR_FICHA'", "'FIM_FICHA'", "'EDITAR_FICHA'", "'FIM_EDICAO'", 
			"'IDADE'", "'CLASSE'", "'RACA'", "'NIVEL'", "'VIDA'", "'ATRIBUTOS'", 
			"'FIM_ATRIBUTOS'", "'FORCA'", "'DESTREZA'", "'INTELIGENCIA'", "'CARISMA'", 
			"'INVENTARIO'", "'FIM_INVENTARIO'", "'-'", "'LVL_UP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "RACA", "CLASSE", "IDENTIFICADOR", 
			"NUM", "COMENTARIO_LINHA", "COMENTARIO_BLOCO", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				comando();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
			setState(35);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public CriarFichaContext criarFicha() {
			return getRuleContext(CriarFichaContext.class,0);
		}
		public EditarFichaContext editarFicha() {
			return getRuleContext(EditarFichaContext.class,0);
		}
		public LevelUpContext levelUp() {
			return getRuleContext(LevelUpContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				criarFicha();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				editarFicha();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				levelUp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CriarFichaContext extends ParserRuleContext {
		public Token nomePersonagem;
		public DeclaracoesFichaContext declaracoesFicha() {
			return getRuleContext(DeclaracoesFichaContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(ExprParser.IDENTIFICADOR, 0); }
		public CriarFichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarFicha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCriarFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarFichaContext criarFicha() throws RecognitionException {
		CriarFichaContext _localctx = new CriarFichaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_criarFicha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			((CriarFichaContext)_localctx).nomePersonagem = match(IDENTIFICADOR);
			setState(44);
			declaracoesFicha();
			setState(45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EditarFichaContext extends ParserRuleContext {
		public Token nomePersonagem;
		public DeclaracoesFichaContext declaracoesFicha() {
			return getRuleContext(DeclaracoesFichaContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(ExprParser.IDENTIFICADOR, 0); }
		public EditarFichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editarFicha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEditarFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditarFichaContext editarFicha() throws RecognitionException {
		EditarFichaContext _localctx = new EditarFichaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_editarFicha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(48);
			((EditarFichaContext)_localctx).nomePersonagem = match(IDENTIFICADOR);
			setState(49);
			declaracoesFicha();
			setState(50);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesFichaContext extends ParserRuleContext {
		public List<DeclaracaoIdadeContext> declaracaoIdade() {
			return getRuleContexts(DeclaracaoIdadeContext.class);
		}
		public DeclaracaoIdadeContext declaracaoIdade(int i) {
			return getRuleContext(DeclaracaoIdadeContext.class,i);
		}
		public List<DeclaracaoClasseContext> declaracaoClasse() {
			return getRuleContexts(DeclaracaoClasseContext.class);
		}
		public DeclaracaoClasseContext declaracaoClasse(int i) {
			return getRuleContext(DeclaracaoClasseContext.class,i);
		}
		public List<DeclaracaoRacaContext> declaracaoRaca() {
			return getRuleContexts(DeclaracaoRacaContext.class);
		}
		public DeclaracaoRacaContext declaracaoRaca(int i) {
			return getRuleContext(DeclaracaoRacaContext.class,i);
		}
		public List<DeclaracaoNivelContext> declaracaoNivel() {
			return getRuleContexts(DeclaracaoNivelContext.class);
		}
		public DeclaracaoNivelContext declaracaoNivel(int i) {
			return getRuleContext(DeclaracaoNivelContext.class,i);
		}
		public List<DeclaracaoVidaContext> declaracaoVida() {
			return getRuleContexts(DeclaracaoVidaContext.class);
		}
		public DeclaracaoVidaContext declaracaoVida(int i) {
			return getRuleContext(DeclaracaoVidaContext.class,i);
		}
		public List<BlocoAtributosContext> blocoAtributos() {
			return getRuleContexts(BlocoAtributosContext.class);
		}
		public BlocoAtributosContext blocoAtributos(int i) {
			return getRuleContext(BlocoAtributosContext.class,i);
		}
		public List<BlocoInventarioContext> blocoInventario() {
			return getRuleContexts(BlocoInventarioContext.class);
		}
		public BlocoInventarioContext blocoInventario(int i) {
			return getRuleContext(BlocoInventarioContext.class,i);
		}
		public DeclaracoesFichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoesFicha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracoesFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesFichaContext declaracoesFicha() throws RecognitionException {
		DeclaracoesFichaContext _localctx = new DeclaracoesFichaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracoesFicha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(52);
					declaracaoIdade();
					}
					break;
				case T__5:
					{
					setState(53);
					declaracaoClasse();
					}
					break;
				case T__6:
					{
					setState(54);
					declaracaoRaca();
					}
					break;
				case T__7:
					{
					setState(55);
					declaracaoNivel();
					}
					break;
				case T__8:
					{
					setState(56);
					declaracaoVida();
					}
					break;
				case T__9:
					{
					setState(57);
					blocoAtributos();
					}
					break;
				case T__15:
					{
					setState(58);
					blocoInventario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67552L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoIdadeContext extends ParserRuleContext {
		public Token idade;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public DeclaracaoIdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoIdade; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoIdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoIdadeContext declaracaoIdade() throws RecognitionException {
		DeclaracaoIdadeContext _localctx = new DeclaracaoIdadeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracaoIdade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			((DeclaracaoIdadeContext)_localctx).idade = match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoClasseContext extends ParserRuleContext {
		public Token classe;
		public TerminalNode CLASSE() { return getToken(ExprParser.CLASSE, 0); }
		public DeclaracaoClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoClasse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracaoClasse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__5);
			setState(67);
			((DeclaracaoClasseContext)_localctx).classe = match(CLASSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoRacaContext extends ParserRuleContext {
		public Token raca;
		public TerminalNode RACA() { return getToken(ExprParser.RACA, 0); }
		public DeclaracaoRacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoRaca; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoRaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoRacaContext declaracaoRaca() throws RecognitionException {
		DeclaracaoRacaContext _localctx = new DeclaracaoRacaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracaoRaca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__6);
			setState(70);
			((DeclaracaoRacaContext)_localctx).raca = match(RACA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoNivelContext extends ParserRuleContext {
		public Token nivel;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public DeclaracaoNivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoNivel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoNivel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoNivelContext declaracaoNivel() throws RecognitionException {
		DeclaracaoNivelContext _localctx = new DeclaracaoNivelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoNivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__7);
			setState(73);
			((DeclaracaoNivelContext)_localctx).nivel = match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVidaContext extends ParserRuleContext {
		public Token vida;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public DeclaracaoVidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVida; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoVida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVidaContext declaracaoVida() throws RecognitionException {
		DeclaracaoVidaContext _localctx = new DeclaracaoVidaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracaoVida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__8);
			setState(76);
			((DeclaracaoVidaContext)_localctx).vida = match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoAtributosContext extends ParserRuleContext {
		public List<DeclaracaoAtributoContext> declaracaoAtributo() {
			return getRuleContexts(DeclaracaoAtributoContext.class);
		}
		public DeclaracaoAtributoContext declaracaoAtributo(int i) {
			return getRuleContext(DeclaracaoAtributoContext.class,i);
		}
		public BlocoAtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoAtributos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlocoAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoAtributosContext blocoAtributos() throws RecognitionException {
		BlocoAtributosContext _localctx = new BlocoAtributosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blocoAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__9);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				declaracaoAtributo();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0) );
			setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoAtributoContext extends ParserRuleContext {
		public Token nomeAtributo;
		public Token valorAtributo;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public DeclaracaoAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoAtributo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoAtributoContext declaracaoAtributo() throws RecognitionException {
		DeclaracaoAtributoContext _localctx = new DeclaracaoAtributoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracaoAtributo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((DeclaracaoAtributoContext)_localctx).nomeAtributo = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
				((DeclaracaoAtributoContext)_localctx).nomeAtributo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			((DeclaracaoAtributoContext)_localctx).valorAtributo = match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInventarioContext extends ParserRuleContext {
		public List<DeclaracaoItemContext> declaracaoItem() {
			return getRuleContexts(DeclaracaoItemContext.class);
		}
		public DeclaracaoItemContext declaracaoItem(int i) {
			return getRuleContext(DeclaracaoItemContext.class,i);
		}
		public BlocoInventarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoInventario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlocoInventario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoInventarioContext blocoInventario() throws RecognitionException {
		BlocoInventarioContext _localctx = new BlocoInventarioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blocoInventario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__15);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM) {
				{
				{
				setState(90);
				declaracaoItem();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoItemContext extends ParserRuleContext {
		public Token quantidade;
		public Token nomeItem;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(ExprParser.IDENTIFICADOR, 0); }
		public DeclaracaoItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaracaoItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoItemContext declaracaoItem() throws RecognitionException {
		DeclaracaoItemContext _localctx = new DeclaracaoItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracaoItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((DeclaracaoItemContext)_localctx).quantidade = match(NUM);
			setState(99);
			match(T__17);
			setState(100);
			((DeclaracaoItemContext)_localctx).nomeItem = match(IDENTIFICADOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LevelUpContext extends ParserRuleContext {
		public Token novoNivel;
		public Token nomePersonagem;
		public TerminalNode IDENTIFICADOR() { return getToken(ExprParser.IDENTIFICADOR, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public LevelUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelUp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLevelUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelUpContext levelUp() throws RecognitionException {
		LevelUpContext _localctx = new LevelUpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_levelUp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__18);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(103);
				((LevelUpContext)_localctx).novoNivel = match(NUM);
				}
			}

			setState(106);
			((LevelUpContext)_localctx).nomePersonagem = match(IDENTIFICADOR);
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
		"\u0004\u0001\u001am\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004\u0000"+
		" \b\u0000\u000b\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004<\b\u0004\u000b\u0004\f\u0004"+
		"=\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0004\nQ\b\n\u000b\n\f\nR\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\\\b\f\n\f\f\f_"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000ei\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0001\u0001\u0000\f\u000fj\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n?\u0001"+
		"\u0000\u0000\u0000\fB\u0001\u0000\u0000\u0000\u000eE\u0001\u0000\u0000"+
		"\u0000\u0010H\u0001\u0000\u0000\u0000\u0012K\u0001\u0000\u0000\u0000\u0014"+
		"N\u0001\u0000\u0000\u0000\u0016V\u0001\u0000\u0000\u0000\u0018Y\u0001"+
		"\u0000\u0000\u0000\u001ab\u0001\u0000\u0000\u0000\u001cf\u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001"+
		"\u0001\u0000\u0000\u0000%)\u0003\u0004\u0002\u0000&)\u0003\u0006\u0003"+
		"\u0000\')\u0003\u001c\u000e\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0001\u0000\u0000+,\u0005\u0016\u0000\u0000,-\u0003\b\u0004\u0000"+
		"-.\u0005\u0002\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u0003"+
		"\u0000\u000001\u0005\u0016\u0000\u000012\u0003\b\u0004\u000023\u0005\u0004"+
		"\u0000\u00003\u0007\u0001\u0000\u0000\u00004<\u0003\n\u0005\u00005<\u0003"+
		"\f\u0006\u00006<\u0003\u000e\u0007\u00007<\u0003\u0010\b\u00008<\u0003"+
		"\u0012\t\u00009<\u0003\u0014\n\u0000:<\u0003\u0018\f\u0000;4\u0001\u0000"+
		"\u0000\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001"+
		"\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0005"+
		"\u0000\u0000@A\u0005\u0017\u0000\u0000A\u000b\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0006\u0000\u0000CD\u0005\u0015\u0000\u0000D\r\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0007\u0000\u0000FG\u0005\u0014\u0000\u0000G\u000f\u0001"+
		"\u0000\u0000\u0000HI\u0005\b\u0000\u0000IJ\u0005\u0017\u0000\u0000J\u0011"+
		"\u0001\u0000\u0000\u0000KL\u0005\t\u0000\u0000LM\u0005\u0017\u0000\u0000"+
		"M\u0013\u0001\u0000\u0000\u0000NP\u0005\n\u0000\u0000OQ\u0003\u0016\u000b"+
		"\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005"+
		"\u000b\u0000\u0000U\u0015\u0001\u0000\u0000\u0000VW\u0007\u0000\u0000"+
		"\u0000WX\u0005\u0017\u0000\u0000X\u0017\u0001\u0000\u0000\u0000Y]\u0005"+
		"\u0010\u0000\u0000Z\\\u0003\u001a\r\u0000[Z\u0001\u0000\u0000\u0000\\"+
		"_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0011"+
		"\u0000\u0000a\u0019\u0001\u0000\u0000\u0000bc\u0005\u0017\u0000\u0000"+
		"cd\u0005\u0012\u0000\u0000de\u0005\u0016\u0000\u0000e\u001b\u0001\u0000"+
		"\u0000\u0000fh\u0005\u0013\u0000\u0000gi\u0005\u0017\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0005\u0016\u0000\u0000k\u001d\u0001\u0000\u0000\u0000\u0007!(;=R]"+
		"h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}