import parser.GrammarJfkBaseVisitor;
import parser.GrammarJfkParser;

import java.text.NumberFormat;

public class GrammarVisitor extends GrammarJfkBaseVisitor {
    @Override
    public Object visitMov(GrammarJfkParser.MovContext ctx) {
        CommandObject commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.MOV);
        commandObject.setExpression(visitExpression(ctx.expression()));
        commandObject.setRegistry(visitRegistry(ctx.registry()));
        return commandObject;
    }

    @Override
    public Object visitIntc(GrammarJfkParser.IntcContext ctx) {

        CommandObject commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.INT);
        return commandObject;
    }

    @Override
    public Object visitPush(GrammarJfkParser.PushContext ctx) {
        CommandObject commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.PUSH);
        commandObject.setExpression(visitExpression(ctx.expression()));
        return commandObject;
    }

    @Override
    public Object visitXor(GrammarJfkParser.XorContext ctx) {
        CommandObject commandObject = new CommandObject();
        commandObject.setCommand(CommandObject.Command.XOR);
        commandObject.setRegistry(visitRegistry(ctx.registry(0)));
        commandObject.setRegistry2(visitRegistry(ctx.registry(1)));
        return commandObject;
    }

    @Override
    public String visitRegistry(GrammarJfkParser.RegistryContext ctx) {
        return ctx.getChild(0).getText();
    }
    @Override
    public Integer visitExpression(GrammarJfkParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return Registry.parseRegistry(ctx.getChild(0).getText());
        } else if(ctx.getChildCount()>2) {
            String sign = ctx.operator.getText();
            if (sign.equals("*")) {
               return visitExpression(ctx.left)*visitExpression(ctx.right);
            } else if (sign.equals("+")) {
                return visitExpression(ctx.left)+visitExpression(ctx.right);
            } else if (sign.equals("-")) {
                return visitExpression(ctx.left)-visitExpression(ctx.right);
            }
            return Integer.MIN_VALUE;
        }
        return 0;
    }

    @Override
    public CommandObject visitCommand(GrammarJfkParser.CommandContext ctx) {
        return (CommandObject) visitChildren(ctx);
    }
}
