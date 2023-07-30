package Chapter6.src.ch08;

import java.util.ArrayList;
import java.util.Arrays;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13);

        ArrayList<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);


        System.out.println("고객 명단 출력");
        customerList.stream().forEach(x -> System.out.println(x.getName()));

        System.out.println("비용 합계 출력");
        System.out.println(customerList.stream().mapToInt(x->x.getCost()).sum());

        System.out.println("20세 이상 고객");
        customerList.stream().filter(x->x.getAge()>=20).map(x->x.getName()).sorted().forEach(x-> System.out.println(x));
    }
}
