package javaExercise.part14.ex10;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/9.
 */
public class Text14_10 {

    public static void main(String[] args) {
        char[] chars = "Hello World".toCharArray();
        print("ac.getClass() = " + chars.getClass());
        print("ac.getClass().getSuperclass() = "
                + chars.getClass().getSuperclass());
    }
}

/* Output:
ac.getClass() = class [C
ac.getClass().getSuperclass() = class java.lang.Object
*/
