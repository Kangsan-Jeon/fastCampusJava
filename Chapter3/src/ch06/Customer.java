package Chapter3.src.ch06;

public class Customer {

    protected int customerID;     // private은 외부 클래스에서는 접근 불가
    protected String customerName;      // protected는 child class에서 접근 가능
    protected String customerGrade;
    int bonusPoint;     // package default: 패키지 내부에서는 접근 가능
    double bonusRatio;

/*
    public Customer() {
        customerGrade = "Bronze";
        bonusRatio = 0.01;

        System.out.println("Customer() call");
    }
*/
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "Bronze";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName+"님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+bonusPoint+"입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
