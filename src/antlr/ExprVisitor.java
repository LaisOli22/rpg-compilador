// Generated from src/antlr/Expr.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(ExprParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#criarFicha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriarFicha(ExprParser.CriarFichaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#editarFicha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditarFicha(ExprParser.EditarFichaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracoesFicha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoesFicha(ExprParser.DeclaracoesFichaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoIdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoIdade(ExprParser.DeclaracaoIdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoClasse(ExprParser.DeclaracaoClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoRaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoRaca(ExprParser.DeclaracaoRacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoNivel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoNivel(ExprParser.DeclaracaoNivelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoVida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVida(ExprParser.DeclaracaoVidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#blocoAtributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoAtributos(ExprParser.BlocoAtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoAtributo(ExprParser.DeclaracaoAtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#blocoInventario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoInventario(ExprParser.BlocoInventarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracaoItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoItem(ExprParser.DeclaracaoItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#levelUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelUp(ExprParser.LevelUpContext ctx);
}