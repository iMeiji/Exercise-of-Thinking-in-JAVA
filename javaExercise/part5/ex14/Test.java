package ex14;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test {

    static String str1 = "str1";

    static String str2;

    static {
        str2 = "str2";
    }

    public static void f() {
        System.out.println("str1 " + str1 + " str2 " + str2);
    }

}
