package Chapter2.src.ch20;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i=0, num=1; i < arr.length; i++) {
            arr[i] = num++;
        }

        // 처음부터 끝까지 돌 때는 enhanced for 사용
        for (int num: arr) {
            total += num;
        }
        System.out.println(total);

        /*
            배열에서 채워진 갯수 만큼만 계산하고 싶은 경우 count 변수 사용
         */
        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for(int i=0; i < count; i++) {
            mtotal *= dArr[i];
        }
        System.out.println(mtotal);
    }
}
