package part10.ex1;

/**
 * Created by yeming on 2015/9/5.
 */
public class Outer {

    public Inner getInner() {
        return new Inner();
    }

    class Inner {

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getInner();
    }
}
