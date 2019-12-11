import parser.GrammarJfkBaseVisitor;
import parser.GrammarJfkParser;

public class GrammarVisitor extends GrammarJfkBaseVisitor {

    private CommandObject commandObject;
    @Override
    public Object visitMov(GrammarJfkParser.MovContext ctx) {
        commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.MOV);
        commandObject.setExpression(visitExpression(ctx.expression()));
        commandObject.setRegistry(visitRegistry(ctx.registry()));
        return commandObject;
    }

    @Override
    public Object visitIntc(GrammarJfkParser.IntcContext ctx) {

        commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.INT);
        return commandObject;
    }

    @Override
    public Object visitPush(GrammarJfkParser.PushContext ctx) {
        commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.PUSH);
        commandObject.setExpression(visitExpression(ctx.expression()));
        return commandObject;
    }

    @Override
    public Object visitXor(GrammarJfkParser.XorContext ctx) {
        commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.XOR);
        commandObject.setRegistry(visitRegistry(ctx.registry()));
        commandObject.setExpression(visitExpression(ctx.expression()));
        return commandObject;
    }

    @Override
    public String visitRegistry(GrammarJfkParser.RegistryContext ctx) {

        return ctx.getChild(0).getText();
    }
    @Override
    public Integer visitExpression(GrammarJfkParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            Integer i = Registry.parseRegistry(ctx.getChild(0).getText());
            if(i!=null){
                return i;
            }
            else {
                commandObject.setUnknownFlag(true);
                return 0;
            }
        } else if(ctx.getChildCount()>2) {
            if(ctx.inner!=null){
                return visitExpression(ctx.inner);
            }
            else {
                String sign = ctx.operator.getText();
                if (sign.equals("*")) {
                    return visitExpression(ctx.left) * visitExpression(ctx.right);
                } else if (sign.equals("+")) {
                    return visitExpression(ctx.left) + visitExpression(ctx.right);
                } else {
                    return visitExpression(ctx.left) - visitExpression(ctx.right);
                }
            }

        }
        return 0;
    }

    @Override
    public CommandObject visitCommand(GrammarJfkParser.CommandContext ctx) {
        visit(ctx.children.get(0));
        return commandObject;
    }
}
