package Template;

public abstract class BeverageMaker {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("煮沸水");
    }

    private void pourInCup() {
        System.out.println("倒入杯中");
    }

    // 抽象方法 - 必须由子类实现
    protected abstract void brew();

    protected abstract void addCondiments();

    // 钩子方法 - 可选覆盖（提供默认实现）
    protected boolean customerWantsCondiments() {
        return true;
    }
}
