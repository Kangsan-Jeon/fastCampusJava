package Chapter3.src.ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10001,"Lee");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10002, "Kim");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
