package AbstractFactory;

public class MacButton implements Button{

    @Override
    public void render() {
        System.out.println("这是Mac风格按钮");
    }

    @Override
    public void onClick() {
        System.out.println("这是Mac风格按钮点击");
    }
    
    
}
