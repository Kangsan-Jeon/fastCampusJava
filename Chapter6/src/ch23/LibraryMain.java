package Chapter6.src.ch23;

import java.util.ArrayList;

class FastLibrary {
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("백설공주에게 죽음을");
        shelf.add("너무 친한 친구들");
        shelf.add("깊은 상처");
//        shelf.add("여우가 잠든 숲");
//        shelf.add("사악한 늑대");
//        shelf.add("바람을 뿌리는 자");
    }
    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        long start = System.currentTimeMillis();
        while (shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end: ");
        }
        if (shelf.size() > 0) {
            long time = System.currentTimeMillis() - start;
            String book = shelf.remove(0);
            System.out.println(t.getName() + ": " + book + " lend | "+ time+"ms");
            return book;
        }
        else return null;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();

        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + " return");

    }
}

class Student extends Thread {
    public Student(String name) {
        super(name);
    }
    public void run() {
        try {
            String book = LibraryMain.library.lendBook();
            if (book == null) {
                System.out.println(getName() + "빌리지 못했음");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(book);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {
    public static FastLibrary library = new FastLibrary();
    public static void main(String[] args) {
        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");
        Student std7 = new Student("std7");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
        std7.start();
    }
}
