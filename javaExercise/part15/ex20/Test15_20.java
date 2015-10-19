package javaExercise.part15.ex20;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/19.
 */

interface InterfaceA {
    void f1();

    void f2();
}

class ClassA implements InterfaceA {

    @Override
    public void f1() {
        print("ClassA f1");
    }

    @Override
    public void f2() {
        print("ClassA f2");
    }

    public void f3() {
        print("ClassA f3");
    }
}

class ClassB {

    static <T extends InterfaceA> void f(T t) {
        t.f1();
        t.f2();
        print("ClassB f");
    }
}


public class Test15_20 {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB.f(classA);
    }
}
