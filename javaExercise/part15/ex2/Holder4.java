package javaExercise.part15.ex2;

import javaExercise.part14.ex11.pets.Cat;

/**
 * Created by yeming on 2015/10/16.
 */
public class Holder4<T> {

    private T[] ts;

    public Holder4(T a, T b, T c) {
        ts[0] = a;
        ts[1] = b;
        ts[2] = c;
    }

    public void setTs(T a, T b, T c) {
        ts[0] = a;
        ts[1] = b;
        ts[2] = c;
    }

    public T[] getTs() {
        return ts;
    }

    public static void main(String[] args) {
        Cat cat1= new Cat();
        Cat cat2= new Cat();
        Cat cat3= new Cat();
        Holder4<Cat> holder4 = new Holder4<>(cat1, cat2, cat3);
    }
}
