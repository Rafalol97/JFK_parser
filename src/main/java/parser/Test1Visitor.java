// Generated from C:/Users/rafal/IntelliJIDEAProjects/Zad1/src/main/antlr4\Test1.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Test1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Test1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Test1Parser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(Test1Parser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Test1Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(Test1Parser.CommandContext ctx);
}