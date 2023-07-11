package Chapter2.src.ch21;

public class ObjectCopy {
    public static void main(String[] args) {

        /*
            얉은 복사(shallow copy): 객체의 주소는 그대로 유지하면서 복사
            깊은 복사(deep copy): 객체의 주소도 모두다르게 복사
         */
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
        Book[] copyLibrary2 = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);


        System.out.println(library+", " + copyLibrary);

        for (int i=0; i < library.length; i++) {
            System.out.println(library[i] +", "+ copyLibrary[i]);
            library[i].showInfo();
            copyLibrary[i].showInfo();
        }

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        for (int i=0; i < library.length; i++) {
            System.out.println(library[i] +", "+ copyLibrary[i]);
            library[i].showInfo();
            copyLibrary[i].showInfo();
        }

        copyLibrary2[0] = new Book();
        copyLibrary2[1] = new Book();
        copyLibrary2[2] = new Book();
        copyLibrary2[3] = new Book();
        copyLibrary2[4] = new Book();

        for (int i=0; i<library.length; i++) {
            copyLibrary2[i].setAuthor(library[i].getAuthor());
            copyLibrary2[i].setTitle(library[i].getTitle());
        }

        for (int i=0; i < library.length; i++) {
            System.out.println(library[i] +", "+ copyLibrary2[i]);
            library[i].showInfo();
            copyLibrary2[i].showInfo();
        }


    }
}
