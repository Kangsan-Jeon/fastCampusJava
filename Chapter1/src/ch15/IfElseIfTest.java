package ch15;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력해주세요");
        int age = scanner.nextInt();
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학아동입니다.");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생입니다.");
        }
        else {
            charge = 1000;
            System.out.println("성인입니다.");
        }

        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
