public class CommandObject {
    public enum Command {MOV,INT,XOR,PUSH}
    private Integer expression;
    private String registry;
    private String registry2;
    private Command command;
    public String getRegistry2() {
        return registry2;
    }

    public void setRegistry2(String registry2) {
        this.registry2 = registry2;
    }
    public CommandObject(Integer expression, String registry, Command command) {
        this.expression = expression;
        this.registry = registry;
        this.command = command;
    }

    public Integer getExpression() {
        return expression;
    }

    public void setExpression(Integer expression) {
        this.expression = expression;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }


    public CommandObject() {
    }
}
