package Chapter3.src.ch02;

public class VIPCustomer extends Customer {

    String agentID;     // 담당 상담원
    double saleRatio;

    public VIPCustomer() {
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return agentID;
    }
}
