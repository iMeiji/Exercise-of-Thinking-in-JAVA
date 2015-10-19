package javaExercise.part15.ex28;


import javaExercise.part15.ex28.pets.Cat;
import javaExercise.part15.ex28.pets.Mouse;
import javaExercise.part15.ex28.pets.Pet;
import javaExercise.part15.ex28.pets.Rodent;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/20.
 */

class Generic1<T> {
    public void f1(T t) {
        print("Generic1 f1");
    }
}

class Generic2<T> {

    public T f2() {
        print("Generic2 f2");
        return null;
    }
}

public class Test15_28 {

    static <T> void f1(Generic1<? super T> generic1, T t) {
        generic1.f1(t);
    }

    static <T> void f2(Generic2<? extends T> generic2) {
        generic2.f2();
    }

    public static void main(String[] args) {
        Generic1<Pet> generic1 = new Generic1<>();
        f1(generic1, new Cat());

        Generic2<Cat> generic2 = new Generic2<>();
        f2(generic2);


    }
}
