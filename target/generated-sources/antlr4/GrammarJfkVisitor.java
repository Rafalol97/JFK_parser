// Generated from GrammarJfk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarJfkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarJfkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(GrammarJfkParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#intc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntc(GrammarJfkParser.IntcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(GrammarJfkParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(GrammarJfkParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#registry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistry(GrammarJfkParser.RegistryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(GrammarJfkParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJfkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarJfkParser.ExpressionContext ctx);
}