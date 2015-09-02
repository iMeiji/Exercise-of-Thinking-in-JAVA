package ex12;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */
public class Gerbil extends Rodent {

    private static int number = printNumber("Gerbil static number");

    private int age = printAge("Gerbil non-static age");

    static {
        print("Gerbil static");
    }

    {
        print("Gerbil non-static");
    }

    public Gerbil() {
        print("÷úÊó");
    }

    @Override
    public void f() {
        print("ÎÒÊÇ÷úÊó");
    }
}
