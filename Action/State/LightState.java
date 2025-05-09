package Action.State;

public interface LightState {
    void switchOn(LightContext context);
    void switchOff(LightContext context);
    String getStateName();
}
