package src.interpreter;

public class DownExpression extends Expression {
    @Override
    protected void execute(Integer number) {
        System.out.print(number/2 + " ");
    }
}
