package src.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        Expression expression;
        Context context = new Context();
        context.setText("A4461 B1341 A676 B1787");

        System.out.println("Context: " + context.getText());
        for (String string : context.getText().split("\\s")) {
            if (string.charAt(0) == 'A') {
                expression = new UpExpression();
            } else {
                expression = new DownExpression();
            }
            expression.interpret(string);
        }
    }
}
