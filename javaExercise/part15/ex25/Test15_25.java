package javaExercise.part15.ex25;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/19.
 */

interface Interface1 {

}

interface Interface2 {

}

class ClassA implements Interface1, Interface2 {

    void f1(Interface1 interface1) {
        print("f1");
    }

    void f2(Interface2 interface2) {
        print("f2");
    }
}

public class Test15_25 {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.f1(classA);
        classA.f2(classA);
    }
}
