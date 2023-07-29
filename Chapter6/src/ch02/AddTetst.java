package Chapter6.src.ch02;

public class AddTetst {
    public static void main(String[] args) {
        Add addL = (x, y) -> {return x+y;};

        System.out.println(addL.add(2, 3));
    }
}
