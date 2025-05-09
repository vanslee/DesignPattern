package Template;

import java.util.Scanner;

public class TeaMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("冲泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    // 覆盖钩子方法 - 询问用户是否要加调料
    @Override
    protected boolean customerWantsCondiments() {
        System.out.print("茶要加柠檬吗？(y/n): ");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.toLowerCase().startsWith("y");
    }
}
