package ex24;

/**
 * Created by yeming on 2015/9/1.
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        printInit("k = " + k);
        printInit("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        printInit("Beetle constructor");
        Beetle b = new Beetle();
    }
}
