package javaExercise.part14.ex8;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/9.
 */
class BaseClass {

}

interface I1 {

}

class ExtendClass extends BaseClass implements I1 {

}

interface I2 {

}

interface I3 extends I2{

}

interface I4 {

}

class ExtendClass2 extends ExtendClass implements I3, I4 {

}


public class Text14_8 {

    static void printAllClass(Class c) {
        if (c == null) return;

        print("name " + c.getName());

        for (Class<?> aa : c.getInterfaces()) {
            print("Interface: " + aa.getName());
            printAllClass(aa.getSuperclass());
        }
        printAllClass(c.getSuperclass());
    }

    public static void main(String[] args) {
        for (String className : args) {
            try {
                printAllClass(Class.forName(className));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
