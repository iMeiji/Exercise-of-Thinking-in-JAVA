package part10.ex26;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/7.
 */
public class Outer1 {

    public class Inner1 {
        public Inner1(int i) {

        }
    }
}

class Outer2 {

    public class Inner2 extends Outer1.Inner1{

        public Inner2(Outer1 outer1, int i) {
            outer1.super(i);
        }

        public void f() {
            print("Inner2 f");
        }

    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Inner2 inner2 = new Outer2().new Inner2(outer1, 2);
        inner2.f();
    }
}
