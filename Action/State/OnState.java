package Action.State;

public class OnState implements LightState {
    @Override
    public void switchOn(LightContext context) {
        System.out.println("灯已经是开着的了");
    }

    @Override
    public void switchOff(LightContext context) {
        System.out.println("关灯");
        context.setState(new OffState());
    }

    @Override
    public String getStateName() {
        return "开";
    }

}
