package Chapter3.src.ch14;

import java.util.ArrayList;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    static int total(int[] array) {
        int total = 0;
        for (int n:array) {
            total += n;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("myMethod");
    }

    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}








