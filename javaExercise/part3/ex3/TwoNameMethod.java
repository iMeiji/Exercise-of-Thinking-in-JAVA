package ex3;

/**
 * Created by yeming on 2015/8/10.
 */
public class TwoNameMethod {

    static void func(Number number) {
        number.f = 2f;
    }
    public static void main(String[] args) {
        Number number = new Number();
        number.f = 1f;
        func(number);
        System.out.println(number.f);
    }
}
