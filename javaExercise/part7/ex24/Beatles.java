package ex24;

/**
 * Created by yeming on 2015/9/1.
 */
public class Beatles extends Beetle {

    private int k = printInit("Beatles.k initialized") + 1;

    private Beatles() {
        printInit("k = " + k);
        printInit("j = " + j);
    }

    private static int x2 = printInit("static Beatles.x2 initialized");

    public static void main(String[] args) {
        printInit("Beetle constructor");
        Beatles b = new Beatles();
    }
}
