package Action.ChainOfResponsibility;

public class CEO extends Approver {
    public CEO(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        System.out.printf("CEO %s 批准了 %s 的 %d 天请假申请%n",
                name, request.getEmployeeName(), request.getLeaveDays());
    }
}
