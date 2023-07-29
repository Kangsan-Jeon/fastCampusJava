package Chapter6.src.ch01;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int iNum = 100;
        static int sInNum = 500;    // 내불클래스는 외부클래스 생성 이후에 가능하므로 static 변수 사용 불가(static inner class는 가능). 근데 왜 되지...
        void inTest() {
            System.out.println(num + "(외부 클래스의 인스턴스 변수)");
            System.out.println(sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println(iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println(sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;
        void inTest() {
//            System.out.println(num + "(외부 클래스의 인스턴스 변수)");    // static은 외부 클래스와 상관 없이 만들어지므로 외부클래스의 인스턴스 변수는 사용 불가
            System.out.println(sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println(iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println(sInNum + "(내부 클래스의 스태틱 변수)");
        }

        static void sTest() {
            System.out.println(sNum + "(외부 클래스의 스태틱 변수)");
//            System.out.println(iNum + "(내부 클래스의 인스턴스 변수)");   // 내부클래스 생성 전에 호출될 수 있으므로 내부 인스턴스 사용 불가
            System.out.println(sInNum + "(내부 클래스의 스태틱 변수)");

        }
    }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
        System.out.println();

        OutClass.InClass inner = outClass.new InClass();
        inner.inTest();
        System.out.println();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        System.out.println();

        OutClass.InStaticClass.sTest();
    }
}
