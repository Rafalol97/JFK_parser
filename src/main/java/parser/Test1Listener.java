// Generated from C:/Users/rafal/IntelliJIDEAProjects/Zad1/src/main/antlr4\Test1.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Test1Parser}.
 */
public interface Test1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Test1Parser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(Test1Parser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test1Parser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(Test1Parser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test1Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(Test1Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test1Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(Test1Parser.CommandContext ctx);
}