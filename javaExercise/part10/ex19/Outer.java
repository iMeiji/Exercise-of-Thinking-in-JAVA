package part10.ex19;

/**
 * Created by yeming on 2015/9/7.
 */
public class Outer {

    public static class Inner1 {

        public static class Inner2 {

        }

    }

    public static void main(String[] args) {
        Outer.Inner1 inner1 = new Outer.Inner1();
        Outer.Inner1.Inner2 inner2 = new Outer.Inner1.Inner2();
    }
}
