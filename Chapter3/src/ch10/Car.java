package Chapter3.src.ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    final public void run() {   // final: 하위 클래스에서 재정의 못함
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
