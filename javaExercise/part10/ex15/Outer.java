package part10.ex15;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/7.
 */
class Number {

    public Number(int i) {
        print("i " + i);
    }
}


public class Outer {

    Number getNumber(int i) {
        return new Number(i) {

        };
    }

    public static void main(String[] agrs) {
        new Outer().getNumber(4);
    }
}
