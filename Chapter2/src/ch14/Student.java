package Chapter2.src.ch14;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takenBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takenSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 잔액은 " + money + "입니다.");
    }
}
