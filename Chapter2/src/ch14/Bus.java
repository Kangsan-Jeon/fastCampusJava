package Chapter2.src.ch14;

public class Bus {
    String busNumber;
    int passengerCnt;
    int revenue;

    public Bus(String busNumber) {
        this.busNumber = busNumber;
        this.passengerCnt = 0;
        this.revenue = 0;
    }

    public void take(int money) {
        this.passengerCnt++;
        this.revenue += money;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번의 승객 수는 " + passengerCnt + "명 이고, 수입은 " + revenue+ "입니다.");
    }

}
