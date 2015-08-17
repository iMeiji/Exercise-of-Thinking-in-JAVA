package ex13;

/**
 * Created by yeming on 2015/8/18.
 */
public class Cups {

    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}
