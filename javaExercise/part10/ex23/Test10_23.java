package part10.ex23;

/**
 * Created by yeming on 2015/9/7.
 */
public class Test10_23 {

    public static void main(String[] args) {
        U.A a = new U.A();
        U.B b = new U.B();
        for (int i = 0; i < 3; i++) {
            b.saveU(a.getU());
        }
        b.loopUs();
        b.setUsNull();
    }
}
