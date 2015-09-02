package ex14;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */
public class Gerbil extends Rodent {

    private int refcount = 0;

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

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            print("Disposing " + this);
    }

    @Override
    public void f() {
        print("ÎÒÊÇ÷úÊó");
    }
}
