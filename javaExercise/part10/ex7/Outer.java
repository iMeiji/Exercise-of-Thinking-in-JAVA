package part10.ex7;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/6.
 */
public class Outer {

    private String str = "outer";
    private int getNumber() {
        return 1;
    }

    public class Inner {
        public int getOuterNumber() {
            return new Outer().getNumber();
        }

        public String getString() {
            return new Outer().str;
        }
    }

    public int getInnerNumber() {
        return new Inner().getOuterNumber();
    }

    public static void main(String[] agrs) {
        Outer outer = new Outer();
        print(outer.getInnerNumber());
    }

}
