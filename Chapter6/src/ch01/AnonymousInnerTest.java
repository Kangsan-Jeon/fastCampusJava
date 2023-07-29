package Chapter6.src.ch01;

class Outer2 {

    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable(int i) {
        int num = 10;

        return new Runnable() {
            int localNum = 1000;
            public void run() {
//                i = 50;     // 출력할 때는 에러 X, 원래 i와 num은 Stack(호출 후 메모리 반환)에 쌓여야 하지만,
//                num = 20;     // run은 또 호출될 수 있으므로 i와 num을 반환하지 않도록 final로 상수화
                System.out.println(i);
                System.out.println(num);
                System.out.println(localNum);

                System.out.println(outNum);
                System.out.println(Outer2.sNum);
            }
        };
    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();
    }
}
