package part9.ex4;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/2.
 */

abstract class Base2 {

    public abstract void f2();
}

class Export2 extends Base2 {

    public void f2() {
        print("Export2 f2");
    }
}

public class Test9_4_2 {

    public static void main(String[] args) {
        Base2 export2 = new Export2();
        export2.f2();
    }
}
