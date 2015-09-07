package part10.ex9;

/**
 * Created by yeming on 2015/9/6.
 */

interface Number {
    Number getNumber();
}

public class Outer {

    public void f() {
        class Inner implements Number{

            @Override
            public Number getNumber() {
                return this;
            }
        }
    }
}
