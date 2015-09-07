package part10.ex13;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/7.
 */
interface Number {
    int getNumber();
}


public class Outer {

    Number getNumber() {
        return new Number() {

            @Override
            public int getNumber() {
                return 3;
            }
        };
        //() -> 3 lambda Óï·¨
    }

    public static void main(String[] args) {
        print(new Outer().getNumber().getNumber());
    }
}
