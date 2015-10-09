package javaExercise.part14.ex9;

import java.lang.reflect.Field;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/9.
 */
class BaseClass {
    int i;
    double d;
    String s;
}




public class Text14_9 {

    static void printAllClass(Class c) {
        if (c == null) return;

        print("name " + c.getName());

        for (Field field: c.getDeclaredFields()) {
            print("Field: " + field);
        }
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
