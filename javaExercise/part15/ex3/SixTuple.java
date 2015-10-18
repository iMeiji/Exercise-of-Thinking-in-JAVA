package javaExercise.part15.ex3;

import net.mindview.util.FiveTuple;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/16.
 */
public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

    public final F six;

    public SixTuple(A a, B b, C c, D d, E e, F six) {
        super(a, b, c, d, e);
        this.six = six;
    }

    @Override
    public String toString() {
        return "(" + first + " , " + second + " , " + third + " , " + fourth + " , " + fifth + " , " + six + ")";
    }

    public static void main(String[] args) {
        SixTuple<String, Integer, Double, Float, String, Integer> sixTuple = new SixTuple<>("a", 1, 2d, 3f, "b", 1);
        print(sixTuple);
    }
}