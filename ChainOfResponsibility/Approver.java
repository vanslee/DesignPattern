package ChainOfResponsibility;

public abstract class Approver {
    protected Approver nextApprover; // 下一个处理者
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    // 设置下一个处理者
    public Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover; // 返回下一个处理者以便链式调用
    }

    // 处理请求的方法
    public abstract void processRequest(LeaveRequest request);
}
