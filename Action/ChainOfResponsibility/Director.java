package Action.ChainOfResponsibility;

public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 7) {
            System.out.printf("总监 %s 批准了 %s 的 %d 天请假申请%n",
                    name, request.getEmployeeName(), request.getLeaveDays());
        } else {
            if (nextApprover != null) {
                nextApprover.processRequest(request);
            } else {
                System.out.printf("%s 的 %d 天请假申请无人能处理%n",
                        request.getEmployeeName(), request.getLeaveDays());
            }
        }
    }
}
