package part10.ex11;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/7.
 */
class Outer {

    public Name getName() {
        return new Inner();
    }

    private class Inner implements Name {

        private String name = "inner";

        @Override
        public String getName() {
            return name;
        }
    }
}

public class Test10_11 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //无法向上转型Inner
//        Inner inner = (Inner) outer.getName();
    }
}
