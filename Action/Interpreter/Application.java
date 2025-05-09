package Action.Interpreter;

public class Application {
    public static void main(String[] args) {
        // 使用逆波兰表示法(后缀表达式)简化解析
        String expression1 = "5 3 + 2 *"; // (5 + 3) * 2
        String expression2 = "10 2 3 * - 4 /"; // (10 - (2 * 3)) / 4

        Evaluator evaluator = new Evaluator();

        Expression expr1 = evaluator.parse(expression1);
        System.out.println(expression1 + " = " + expr1.interpret());

        Expression expr2 = evaluator.parse(expression2);
        System.out.println(expression2 + " = " + expr2.interpret());
    }
}
