package Chapter6.src.ch22;

class Bank {
    private int money = 10000;
    public void saveMoney(int save) {

        synchronized (SyncMain.myBank) {    // SyncMain.myBank or this
            int m = getMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(m+save);
        }
    }

    public synchronized void useMoney(int minus) {
        int m = getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m-minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {
    public void run() {
        System.out.println("start save");
        SyncMain.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) : "+SyncMain.myBank.getMoney());
    }
}

class ParkWife extends Thread {
    public void run() {
        System.out.println("start minus");
        SyncMain.myBank.useMoney(5000);
        System.out.println("useMoney(5000) : "+SyncMain.myBank.getMoney());
    }
}

public class SyncMain {

    public static Bank myBank = new Bank();
    public static void main(String[] args) {
        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ParkWife pw = new ParkWife();
        pw.start();
    }
}
