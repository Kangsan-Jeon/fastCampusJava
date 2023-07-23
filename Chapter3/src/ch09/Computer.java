package Chapter3.src.ch09;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("Turn on the computer.");
    }

    public void turnOff() {
        System.out.println("Turn off the computer");
    }
}
