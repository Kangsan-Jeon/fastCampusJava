package Chapter6.src.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {  // autoCloseable
            System.out.println("read");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
