package ex10;

/**
 * Created by yeming on 2015/8/10.
 */
public class BinaryTest {

    public static final long NUMBER1 = 0x55;   //二进制1010101
    public static final long NUMBER2 = 0xAA;    //二进制10101010

    public static void main(String[] args) {

        System.out.println("| " + Long.toBinaryString(NUMBER1 | NUMBER2));
        System.out.println("& " + Long.toBinaryString(NUMBER1 & NUMBER2));
        System.out.println("^ " + Long.toBinaryString(NUMBER1 ^ NUMBER2));
    }
}
