package Chapter6.src.ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        // origin-
        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString("abc", "cde");


        // lambda
        StringConcat sc = (x, y) -> System.out.println(x+", "+y);
        sc.makeString("abc", "def");
    }
}
