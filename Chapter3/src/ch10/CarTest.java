package Chapter3.src.ch10;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car mCar = new ManualCar();
        mCar.run();
    }
}
