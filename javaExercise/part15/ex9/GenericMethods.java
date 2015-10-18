package javaExercise.part15.ex9;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/18.
 */
public class GenericMethods {

    public <A, B, C> void f(A a, B b, C c) {
        print("a " + a.getClass().getSimpleName());
        print("b " + b.getClass().getSimpleName());
        print("c " + c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(1, "str", 1.0);
    }
}
