package Chapter3.src.ch15;

import Chapter3.src.ch15.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
