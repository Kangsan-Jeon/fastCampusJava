package Chapter6.src.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "abc");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) { // default exception은 제일 마지막에 사용
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
