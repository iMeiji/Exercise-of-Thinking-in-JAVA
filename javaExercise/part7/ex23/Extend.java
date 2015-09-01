package ex23;

/**
 * Created by yeming on 2015/9/1.
 */
public class Extend {

    public static int a;

    static {
        System.out.println("Extend static");
    }

    {
        System.out.println("Extend non-static");
    }

}
