// Generated from C:/Users/rafal/IntelliJIDEAProjects/Zad1/src/main/antlr4\GrammarJfk.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link Test1Parser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(Test1Parser.PruleContext ctx);
}