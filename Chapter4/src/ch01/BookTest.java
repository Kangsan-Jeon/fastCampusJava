package Chapter4.src.ch01;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("산 자와 죽은 자", "넬레 노이하우스");
        System.out.println(book.toString());
    }
}