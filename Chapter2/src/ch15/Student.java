package Chapter2.src.ch15;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    void takenTaxi(Taxi taxi, int money) {
        taxi.taken(money);
        this.money -= money;
    }

    void showInfo() {
        System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다.");
    }
}
