// Generated from C:/Users/rafal/IntelliJIDEAProjects/Zad1/src/main/antlr4\GrammarJfk.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarJfkParser}.
 */
public interface GrammarJfkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(GrammarJfkParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(GrammarJfkParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#intc}.
	 * @param ctx the parse tree
	 */
	void enterIntc(GrammarJfkParser.IntcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#intc}.
	 * @param ctx the parse tree
	 */
	void exitIntc(GrammarJfkParser.IntcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(GrammarJfkParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(GrammarJfkParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(GrammarJfkParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(GrammarJfkParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#registry}.
	 * @param ctx the parse tree
	 */
	void enterRegistry(GrammarJfkParser.RegistryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#registry}.
	 * @param ctx the parse tree
	 */
	void exitRegistry(GrammarJfkParser.RegistryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GrammarJfkParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GrammarJfkParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJfkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarJfkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJfkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarJfkParser.ExpressionContext ctx);
}