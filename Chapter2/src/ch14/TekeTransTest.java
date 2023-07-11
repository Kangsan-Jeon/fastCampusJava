package Chapter2.src.ch14;

public class TekeTransTest {

    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus("100");
        Bus bus500 = new Bus("500");

        studentJ.takenBus(bus100);

        Subway greenSubway = new Subway("green");
        studentT.takenSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

    }
}
