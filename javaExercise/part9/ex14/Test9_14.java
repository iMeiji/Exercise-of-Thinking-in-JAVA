package part9.ex14;

/**
 * Created by yeming on 2015/9/2.
 */

interface I1 {
    void f1();

    void f2();
}

interface I2 {
    void func1();

    void func2();
}

interface I3 {
    void function1();

    void function2();
}

interface I4 extends I1, I2, I3 {
    void f3();
}

class Base {
    void f() {

    }
}

class Export extends Base implements I4 {

    @Override
    public void f3() {

    }

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void function1() {

    }

    @Override
    public void function2() {

    }
}

public class Test9_14 {

    public static void f1(I1 i1) {
        i1.f1();
        i1.f2();
    }

    public static void f2(I2 i2) {
        i2.func1();
        i2.func2();
    }

    public static void f3(I3 i3) {
        i3.function1();
        i3.function2();
    }

    public static void f4(I4 i4) {
        i4.function1();
        i4.function2();
    }

    public static void main(String[] agrs) {
        Export export = new Export();
        f1(export);
        f2(export);
        f3(export);
        f4(export);
    }

}
