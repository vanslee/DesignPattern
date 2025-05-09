package AbstractFactory;

public class WinButton implements Button{

    @Override
    public void render() {
        System.err.println("这是windows风格按钮");
    }
    @Override
    public void onClick(){
        System.out.println("这是windows风格按钮点击");
    }
    
}
