package AbstractFactory;

public class WinCheckBox implements CheckBox{

    @Override
    public void render() {
       System.err.println("这是windows风格选择框");
    }
    @Override
    public void OnChose() {
        System.out.println("这是windows选择框选择");
    }
    
}
