package part9.ex4;

import static Utils.Print.print;
/**
 * Created by yeming on 2015/9/2.
 */
abstract class Base {

}

class Export extends Base {

    public static Export f(Base base) {
        print("向下转型");
        return (Export) base;
    }

    public void f2() {
        print("Export f2");
    }
}


public class Test9_4 {
    public static void main(String[] args) {
        Base export = new Export();
        Export.f(export).f2();
    }
}
