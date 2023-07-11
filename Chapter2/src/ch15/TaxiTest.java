package Chapter2.src.ch15;

public class TaxiTest {

    public static void main(String[] args) {

        Student studentE = new Student("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");

        studentE.takenTaxi(taxi, 10000);

        studentE.showInfo();
        taxi.showInfo();

    }

}
