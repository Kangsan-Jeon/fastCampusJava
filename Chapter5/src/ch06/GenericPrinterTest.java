package Chapter5.src.ch06;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  // Type을 지정 안하면 Object로 인십

        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();

        System.out.println(powderPrinter.toString());
    }
}
