package ex24;

/**
 * Created by yeming on 2015/9/1.
 */
class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        printInit("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
