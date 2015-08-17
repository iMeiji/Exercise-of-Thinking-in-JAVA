package ex15;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test {

    String str;

    String getStr() {
        return str;
    }

    {
        str = "aaa";
    }

    Test() {
        System.out.println("str " + str);
    }
}
