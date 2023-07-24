package Chapter3.src.ch15;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
