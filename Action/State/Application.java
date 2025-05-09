package Action.State;

public class Application {
    public static void main(String[] args) {
        LightContext light = new LightContext();
        System.out.println("当前状态: " + light.getCurrentState());
        light.switchOn(); // 从关到开
        System.out.println("当前状态: " + light.getCurrentState());
        light.switchOff(); // 从开到关
        System.out.println("当前状态: " + light.getCurrentState());
        light.switchOff(); // 已经是关状态
        light.switchOn(); // 从关到开
        light.switchOn(); // 已经是开状态
    }
}
