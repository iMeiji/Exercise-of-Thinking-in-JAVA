package ex12;

/**
 * Created by yeming on 2015/8/10.
 */
public class DisplacementOperator {

    public static final long NUMBER = 0x1F;   //������11111

    public static void main(String[] args) {
        System.out.println(Long.toBinaryString(NUMBER));
        Long result = NUMBER << 1 ;
        System.out.println(Long.toBinaryString(result));
        while(result != 0) {
            result = result >> 1;
            System.out.println(Long.toBinaryString(result));
        }
    }
}
