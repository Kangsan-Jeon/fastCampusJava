package Chapter6.src.ch19;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee etiopiaCoffee = new EtiopiaAmericano();

        etiopiaCoffee.brewing();

        System.out.println();

        Coffee etiopiaLatte = new Latte(etiopiaCoffee);
        etiopiaLatte.brewing();

        System.out.println();

        Coffee etiopiaMocha = new Mocha(etiopiaCoffee);
        etiopiaMocha.brewing();
    }
}
