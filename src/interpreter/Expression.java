package src.interpreter;

public abstract class Expression {
    public void interpret(String string) {
        if (string.length() > 0) {
            String text = string.substring(1, string.length());
            Integer number = Integer.valueOf(text);
            execute(number);
        }
    }

    protected abstract void execute(Integer number);
}
