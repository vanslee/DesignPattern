package AbstractFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;
    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }
    public static void main(String[] args) {
        String upperCase = System.getProperty("os.name").toUpperCase();
        Application application = null;
        if (upperCase == "MAC") {
           application = new Application(new MacFactory()) ;
        } else {
            application = new Application(new WindowsFactory()) ;
        }
       application.button.render();
       application.button.onClick();
       application.checkBox.render();
       application.checkBox.OnChose();
    }
}
