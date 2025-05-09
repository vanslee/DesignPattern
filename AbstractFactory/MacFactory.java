package AbstractFactory;

public class MacFactory implements GUIFactory{
    private Button button;
    private CheckBox checkBox;

    @Override
    public Button createButton() {
       if (button == null) {
            MacButton bMacButton = new MacButton();
            button = bMacButton;
       }
       return button;
    }

    @Override
    public CheckBox createCheckBox() {
        if (checkBox == null) {
            MacCheckBox macCheckBox = new MacCheckBox();
            checkBox = macCheckBox;
       }
       return checkBox;  
    }
    
}
