// Generated from Expr.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(ExprParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(ExprParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#criarFicha}.
	 * @param ctx the parse tree
	 */
	void enterCriarFicha(ExprParser.CriarFichaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#criarFicha}.
	 * @param ctx the parse tree
	 */
	void exitCriarFicha(ExprParser.CriarFichaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#editarFicha}.
	 * @param ctx the parse tree
	 */
	void enterEditarFicha(ExprParser.EditarFichaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#editarFicha}.
	 * @param ctx the parse tree
	 */
	void exitEditarFicha(ExprParser.EditarFichaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracoesFicha}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoesFicha(ExprParser.DeclaracoesFichaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracoesFicha}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoesFicha(ExprParser.DeclaracoesFichaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoIdade}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoIdade(ExprParser.DeclaracaoIdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoIdade}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoIdade(ExprParser.DeclaracaoIdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoClasse(ExprParser.DeclaracaoClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoClasse(ExprParser.DeclaracaoClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoRaca}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoRaca(ExprParser.DeclaracaoRacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoRaca}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoRaca(ExprParser.DeclaracaoRacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoNivel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoNivel(ExprParser.DeclaracaoNivelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoNivel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoNivel(ExprParser.DeclaracaoNivelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoVida}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVida(ExprParser.DeclaracaoVidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoVida}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVida(ExprParser.DeclaracaoVidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#blocoAtributos}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAtributos(ExprParser.BlocoAtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#blocoAtributos}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAtributos(ExprParser.BlocoAtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoAtributo(ExprParser.DeclaracaoAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoAtributo(ExprParser.DeclaracaoAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#blocoInventario}.
	 * @param ctx the parse tree
	 */
	void enterBlocoInventario(ExprParser.BlocoInventarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#blocoInventario}.
	 * @param ctx the parse tree
	 */
	void exitBlocoInventario(ExprParser.BlocoInventarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracaoItem}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoItem(ExprParser.DeclaracaoItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracaoItem}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoItem(ExprParser.DeclaracaoItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#levelUp}.
	 * @param ctx the parse tree
	 */
	void enterLevelUp(ExprParser.LevelUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#levelUp}.
	 * @param ctx the parse tree
	 */
	void exitLevelUp(ExprParser.LevelUpContext ctx);
}