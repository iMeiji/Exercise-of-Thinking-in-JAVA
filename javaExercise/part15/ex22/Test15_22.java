package javaExercise.part15.ex22;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/19.
 */

class Person {

    public Person(int age) {
        print("Person " + age);
    }
}

class Factory<T> {
    Class<T> kind;

    public Factory(Class<T> kind) {
        this.kind = kind;
    }

    public T create(int arg) {
        try {
            Constructor<T> constructor = kind.getConstructor(int.class);
            try {
                return constructor.newInstance(arg);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class Test15_22 {

    public static void main(String[] args) {
        Factory factory = new Factory(Person.class);
        factory.create(12);
    }

}
