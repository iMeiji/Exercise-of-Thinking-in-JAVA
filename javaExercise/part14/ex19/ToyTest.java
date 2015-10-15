//: typeinfo/toys/ToyTest.java
// Testing class Class.
package javaExercise.part14.ex19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.*;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static Toy getToyByRefelect(int number) {
        Toy toy = null;
        Class c = null;
        try {
            c = Class.forName("javaExercise.part14.ex19.Toy");
            for (Constructor constructor : c.getConstructors()) {
                Class[] params = constructor.getParameterTypes();
                if (constructor.getParameterCount() == 1 && params[0] == int.class) {
                    try {
                        toy = (Toy) constructor.newInstance(new Object[]{10});
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        return toy;
    }

    public static void main(String[] args) {
        Toy toy = getToyByRefelect(100);
    }
}