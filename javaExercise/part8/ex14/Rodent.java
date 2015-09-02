package ex14;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */
public class Rodent {

    private int refcount = 0;

    private static int number = printNumber("Rodent static number");

    private int age = printAge("Rodent non-static age");

    static {
        print("Rodent static");
    }

    {
        print("Rodent non-static");
    }

    public Rodent() {
        print("啮齿动物");
    }

    public void f() {
        print("我是啮齿动物");
    }

    public int printAge(String str) {
        print(str);
        return 1;
    }

    public static int printNumber(String str) {
        print(str);
        return 2;
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            print("Disposing " + this);
    }
}
