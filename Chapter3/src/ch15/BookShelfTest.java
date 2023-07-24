package Chapter3.src.ch15;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("백설공주에게 죽음을");
        bookQueue.enQueue("너무 친한 친구들");
        bookQueue.enQueue("잔혹한 어머니의 날");
        bookQueue.enQueue("사악한 늑대");
        bookQueue.enQueue("깊은 상처");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
