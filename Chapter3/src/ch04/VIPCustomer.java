package Chapter3.src.ch04;

public class VIPCustomer extends Customer {

    String agentID;     // 담당 상담원
    double saleRatio;

/*    public VIPCustomer() {
        // super();     // 상속받은 경우 super()가 default. super()는 default constructor
        super(0, "no-name ");

        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer() call");
    }*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        price -= (int)(price*saleRatio);
        return super.calcPrice(price);
    }

    public String getAgentID() {
        return agentID;
    }
}

