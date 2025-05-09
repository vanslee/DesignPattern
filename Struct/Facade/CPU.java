package Struct.Facade;

public class CPU {
    public void freeze(){
        System.out.println("CPU冻结！");
    }
    public void jump(int time) {
        System.out.println("CPU执行优先级：" + time);
    }
    public void execute() {
        System.out.println("CPU执行进程");
    }
}
