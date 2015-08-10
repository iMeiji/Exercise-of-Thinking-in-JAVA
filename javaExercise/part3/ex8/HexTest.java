package ex8;

/**
 * Created by yeming on 2015/8/10.
 */
public class HexTest {

    public static void main(String[] args) {
        long octalNumber = 0123L;
        long hexadecimalNumber = 0x5fd5L;

        System.out.println(Long.toBinaryString(octalNumber));
        System.out.println(Long.toBinaryString(hexadecimalNumber));
    }
}
