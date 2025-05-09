package AbstractFactory;

public class WindowsFactory implements GUIFactory{
    private Button button;
    private CheckBox checkBox;

    @Override
    public Button createButton() {
       if (button == null) {
            WinButton bWinButton = new WinButton();
            button = bWinButton;
       }
       return button;
    }

    @Override
    public CheckBox createCheckBox() {
        if (checkBox == null) {
            WinCheckBox winCheckBox = new WinCheckBox();
            checkBox = winCheckBox;
       }
       return checkBox;  
    }
    
}
