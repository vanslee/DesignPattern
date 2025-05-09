package Interpreter;

public class Divide implements Expression {
    private Expression left;
    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
