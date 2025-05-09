package Command;

public class FanSpeedCommand implements Command {
    private Fan fan;
    private int prevSpeed;

    public FanSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.setSpeed(prevSpeed + 1);
    }

    @Override
    public void undo() {
        fan.setSpeed(prevSpeed);
    }
}
