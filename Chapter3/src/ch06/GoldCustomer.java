package Chapter3.src.ch06;

public class GoldCustomer extends Customer {
    double saleTatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        saleTatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "Gold";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        return price - (int)(price*saleTatio);
    }
}
