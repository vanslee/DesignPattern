package ChainOfResponsibility;

public class Application {
    public static void main(String[] args) {
        // 构建责任链
        Approver groupLeader = new GroupLeader("张组长");
        Approver manager = new Manager("李经理");
        Approver director = new Director("王总监");
        Approver ceo = new CEO("赵总裁");

        // 设置责任链顺序
        groupLeader.setNextApprover(manager)
                .setNextApprover(director)
                .setNextApprover(ceo);

        // 创建请假申请
        LeaveRequest request1 = new LeaveRequest("小明", 1);
        LeaveRequest request2 = new LeaveRequest("小红", 4);
        LeaveRequest request3 = new LeaveRequest("小刚", 8);
        LeaveRequest request4 = new LeaveRequest("小强", 15);

        // 处理申请
        System.out.println("===== 请假审批开始 =====");
        groupLeader.processRequest(request1);
        groupLeader.processRequest(request2);
        groupLeader.processRequest(request3);
        groupLeader.processRequest(request4);
        System.out.println("===== 请假审批结束 =====");
    }
}
