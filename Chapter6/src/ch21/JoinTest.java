package Chapter6.src.ch21;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;  // member변수는 0으로 초기화되어 있음. 지역변수는 초기화 필요

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int i;
        for(i=start;i<=end;i++) {
            total+=i;
        }
    }

    public static void main(String[] args) {
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        // main thread가 jt1, jt2가 끝날 때까지 wait
        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int lastTotal = jt1.total + jt2.total;
        System.out.println(jt1.total);
        System.out.println(jt2.total);
        System.out.println(lastTotal);
    }
}
