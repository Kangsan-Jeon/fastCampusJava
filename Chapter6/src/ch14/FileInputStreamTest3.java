package Chapter6.src.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        int i;

        try(FileInputStream fis = new FileInputStream("input2.txt")) {
            byte[] bs = new byte[10];
            while ( (i=fis.read(bs)) != -1) {
                for (int j=0;j<i;j++) {
                    System.out.print((char) bs[j]);
                }
//                // buffer에 QRST는 남아있음
//                for (int ch: bs) {
//                    System.out.print((char) ch);
//                }
                System.out.println(" : " + i + "바이트 읽음");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
