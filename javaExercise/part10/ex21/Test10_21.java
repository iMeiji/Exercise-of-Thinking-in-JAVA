package part10.ex21;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/7.
 */
interface I {
    void f();
    void g();
    class Nested {
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }
}

public class Test10_21 implements I{

    public static void main(String[] args) {
        Nested.call(new Test10_21());
    }


    @Override
    public void f() {
        print("Test10_21 f");
    }

    @Override
    public void g() {
        print("Test10_21 g");
    }
}
