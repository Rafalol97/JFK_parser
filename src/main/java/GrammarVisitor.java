import parser.GrammarJfkBaseVisitor;
import parser.GrammarJfkParser;

public class GrammarVisitor extends GrammarJfkBaseVisitor {
    @Override
    public Object visitMov(GrammarJfkParser.MovContext ctx) {

        return super.visitMov(ctx);
    }

    @Override
    public Object visitInt(GrammarJfkParser.IntContext ctx) {
        return super.visitInt(ctx);
    }

    @Override
    public Object visitPush(GrammarJfkParser.PushContext ctx) {
        return super.visitPush(ctx);
    }

    @Override
    public Object visitXor(GrammarJfkParser.XorContext ctx) {
        return super.visitXor(ctx);
    }

    @Override
    public Object visitRegistry(GrammarJfkParser.RegistryContext ctx) {
        return super.visitRegistry(ctx);
    }

    @Override
    public Object visitOperators(GrammarJfkParser.OperatorsContext ctx) {
        return super.visitOperators(ctx);
    }

    @Override
    public Object visitExpression(GrammarJfkParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitCommand(GrammarJfkParser.CommandContext ctx) {
        return super.visitCommand(ctx);
    }
}
