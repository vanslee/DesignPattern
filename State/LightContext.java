package State;

public class LightContext {
    private LightState currentState;

    public LightContext() {
        // 初始状态为关
        this.currentState = new OffState();
    }

    public void setState(LightState state) {
        this.currentState = state;
    }

    public void switchOn() {
        currentState.switchOn(this);
    }

    public void switchOff() {
        currentState.switchOff(this);
    }

    public String getCurrentState() {
        return currentState.getStateName();
    }
}
