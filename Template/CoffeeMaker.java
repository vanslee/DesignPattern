package Template;

public class CoffeeMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("冲泡咖啡粉");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
