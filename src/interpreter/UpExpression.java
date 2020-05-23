package src.interpreter;

public class UpExpression extends Expression {
    @Override
    protected void execute(Integer number) {
        System.out.print(number*2 + " ");
    }
}
