package Chapter2.src.ch14;

public class Subway {
    String subwayNumber;
    int passengerCnt;
    int revenue;

    public Subway(String SubwayNumber) {
        this.subwayNumber = SubwayNumber;
        this.passengerCnt = 0;
        this.revenue = 0;
    }

    public void take(int money) {
        this.passengerCnt++;
        this.revenue += money;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNumber + "호선의 승객 수는 " + passengerCnt + "명 이고, 수입은 " + revenue+ "입니다.");
    }

}
