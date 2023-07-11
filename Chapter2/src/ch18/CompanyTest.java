package Chapter2.src.ch18;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);   // JVM이 할당한 Heap 메모리 주소
        System.out.println(company2);   // JVM이 할당한 Heap 메모리 주소

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());

    }
}
