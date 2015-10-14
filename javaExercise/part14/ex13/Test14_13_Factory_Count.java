package javaExercise.part14.ex13;

import javaExercise.part14.ex13.factory.Factory;
import net.mindview.util.TypeCounter;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/14.
 */
public class Test14_13_Factory_Count {

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        Part part;
        for (int i = 0; i < 20; i++) {
            part = Part.createRandom();
            printnb(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        print();
        print(counter);
    }
}
