package Command;

public class Application {
    public static void main(String[] args) {
        // 创建接收者
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        // 创建命令
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanSpeed = new FanSpeedCommand(ceilingFan);

        // 创建调用者(遥控器)
        RemoteControl remote = new RemoteControl();

        // 设置命令
        remote.setCommand(0, lightOn, lightOff); // 插槽0控制电灯
        remote.setCommand(1, fanSpeed, fanSpeed); // 插槽1控制风扇

        System.out.println("--- 测试遥控器 ---");
        remote.pressOnButton(0); // 开灯
        remote.pressOffButton(0); // 关灯
        remote.pressOffButton(0); // 关灯
        remote.pressUndoButton(); // 撤销关灯(重新开灯)

        System.out.println("\n--- 测试风扇 ---");
        remote.pressOnButton(1); // 风扇速度+1
        remote.pressOnButton(1); // 风扇速度+1
        remote.pressOnButton(1); // 风扇速度+1
        remote.pressOnButton(1); // 风扇速度+1
        remote.pressUndoButton(); // 撤销(速度-1)
    }
}
