package ch10;

public class TypeConversionTest {
    public static void main(String[] args) {

        byte bNum = 125;
        int iNum = bNum;

        int iNum2 = 255;
        byte bNum2 = (byte) iNum2;

        System.out.println(iNum);
        System.out.println(bNum2);

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum3 = (int)dNum + (int)fNum;
        int iNum4 = (int)(dNum+fNum);

        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
