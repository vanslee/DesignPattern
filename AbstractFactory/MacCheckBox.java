package AbstractFactory;

public class MacCheckBox implements CheckBox{

    @Override
    public void render() {
        System.out.println("这是mac风格选择框");
    }
    @Override
    public void OnChose(){
        System.out.println("mac选择框选择");
    }
    
}
