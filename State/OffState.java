package State;

public class OffState implements LightState {
    @Override
    public void switchOn(LightContext context) {
        System.out.println("开灯");
        context.setState(new OnState());
    }

    @Override
    public void switchOff(LightContext context) {
        System.out.println("灯已经是关着的了");
    }

    @Override
    public String getStateName() {
        return "关";
    }
}
