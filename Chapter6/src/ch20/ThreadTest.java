package Chapter6.src.ch20;

class MyThread extends Thread {
    @Override
    public void run() {
        int i;

        for(i=1;i<=200;i++) {
            System.out.print(i+"\t");
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        int i;

        for(i=1;i<=200;i++) {
            System.out.print(i+"\t");
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {

/*
        System.out.println(Thread.currentThread() + " start");  // main thread
        MyThread mth1 = new MyThread();
        MyThread mth2 = new MyThread();
        mth1.start();
        mth2.start();
        System.out.println(Thread.currentThread() + " end");
*/

        System.out.println(Thread.currentThread() + " start");  // main thread
        MyThread2 runnable = new MyThread2();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + " end");

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }
}
