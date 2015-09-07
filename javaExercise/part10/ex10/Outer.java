package part10.ex10;

/**
 * Created by yeming on 2015/9/6.
 */

interface Number {
    Number getNumber();
}

public class Outer {

    public Number f(boolean needNumber) {
        if(needNumber) {
            class Inner1 implements Number {

                @Override
                public Number getNumber() {
                    return this;
                }
            }
            return new Inner1().getNumber();
        } else {
            class Inner2 implements Number {

                @Override
                public Number getNumber() {
                    return this;
                }
            }
            return new Inner2().getNumber();
        }
    }
}
