package ex12;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */
public class Rodent {

    private static int number = printNumber("Rodent static number");

    private int age = printAge("Rodent non-static age");

    static {
        print("Rodent static");
    }

    {
        print("Rodent non-static");
    }

    public Rodent() {
        print("���ݶ���");
    }

    public void f() {
        print("�������ݶ���");
    }

    public int printAge(String str) {
        print(str);
        return 1;
    }

    public static int printNumber(String str) {
        print(str);
        return 2;
    }
}
