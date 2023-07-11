package Chapter2.src.ch15;

public class Taxi {
    String company;
    int revenue;

    public Taxi(String company) {
        this.company = company;
        this.revenue = 0;
    }

    public void taken(int money) {
        this.revenue += money;
    }

    public void showInfo() {
        System.out.println(company+" 수입은 "+revenue+"원 입니다.");
    }

}
