package part12.ex25;

/**
 * Created by yeming on 2015/9/21.
 */
class ExceptionA extends Exception {

}

class ExceptionB extends ExceptionA {

}

class ExceptionC extends ExceptionB {

}

class A {
    void f() throws ExceptionA {
        throw new ExceptionA();
    }
}

class B extends A {

    @Override
    void f() throws ExceptionB {
        throw new ExceptionB();
    }
}

class C extends B {

    @Override
    void f() throws ExceptionC {
        throw new ExceptionC();
    }
}

public class Test12_25 {

    public static void main(String[] args) {
        A c = new C();
        try {
            c.f();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }
    }
}
