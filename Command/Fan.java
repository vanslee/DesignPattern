package Command;

public class Fan {
    private int speed = 0; // 0表示关闭

    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed == 0) {
            System.out.println("风扇关闭");
        } else {
            System.out.println("风扇速度设置为: " + speed);
        }
    }

    public int getSpeed() {
        return speed;
    }
}
