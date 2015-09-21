package part13.ex6;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/22.
 */

class Number {
    int i = 1;
    long l = 2l;
    float f = 3.4f;
    double d = 4d;

    @Override
    public String toString() {
        return String.format("%d: %d: %f: %f", i, l, f, d);
    }


}

public class Test13_6 {

    public static void main(String[] args) {
        Number number = new Number();
        print(number.toString());
    }

}
