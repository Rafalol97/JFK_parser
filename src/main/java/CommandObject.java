public class CommandObject {
    public enum Command {MOV,INT,XOR,PUSH}
    private Integer expression;
    private String registry;

    private Command command;
    private Boolean unknownFlag = false;

    public Boolean getUnknownFlag() {
        return unknownFlag;
    }

    public void setUnknownFlag(Boolean unknownFlag) {
        this.unknownFlag = unknownFlag;
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
