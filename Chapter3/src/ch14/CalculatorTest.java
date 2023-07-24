package Chapter3.src.ch14;

public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;

//        System.out.println(calc.add(num1, num2));
//        System.out.println(calc.subtract(num1, num2));
//        System.out.println(calc.times(num1, num2));
//        System.out.println(calc.divide(num1, num2));
//
//        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));    // static은 인터페이스 이름으로 바로 호출

        calc.description();

    }
}
