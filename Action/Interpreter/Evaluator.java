package Action.Interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

public class Evaluator {
    public Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(expression);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            switch (token) {
                case "+":
                    Expression rightAdd = stack.pop();
                    Expression leftAdd = stack.pop();
                    stack.push(new Add(leftAdd, rightAdd));
                    break;
                case "-":
                    Expression rightSub = stack.pop();
                    Expression leftSub = stack.pop();
                    stack.push(new Subtract(leftSub, rightSub));
                    break;
                case "*":
                    Expression rightMul = stack.pop();
                    Expression leftMul = stack.pop();
                    stack.push(new Multiply(leftMul, rightMul));
                    break;
                case "/":
                    Expression rightDiv = stack.pop();
                    Expression leftDiv = stack.pop();
                    stack.push(new Divide(leftDiv, rightDiv));
                    break;
                default:
                    stack.push(new Number(Integer.parseInt(token)));
                    break;
            }
        }

        return stack.pop();
    }
}
