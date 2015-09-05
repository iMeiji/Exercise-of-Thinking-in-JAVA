package part10.ex3;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/5.
 */
public class Outer {

    private String str;

    public Outer (String str) {
        this.str = str;
    }

    public Inner getInner() {
        return new Inner();
    }

    class Inner {

        @Override
        public String toString() {
            return str;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer("abc");
        print(outer.getInner().toString());
    }
}
