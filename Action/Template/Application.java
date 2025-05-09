package Action.Template;

public class Application {
    public static void main(String[] args) {
        System.out.println("制作茶...");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.prepareBeverage();

        System.out.println("\n制作咖啡...");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.prepareBeverage();
    }
}
