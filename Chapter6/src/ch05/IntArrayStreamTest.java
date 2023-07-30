package Chapter6.src.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int num:arr) {
            System.out.println(num);
        }
        System.out.println();

        IntStream is = Arrays.stream(arr);
        is.forEach(n-> System.out.println(n));
        // 이후 is는 사용 불가
        
    }
}
