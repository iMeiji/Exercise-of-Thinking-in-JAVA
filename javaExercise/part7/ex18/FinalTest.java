package ex18;

/**
 * Created by yeming on 2015/8/25.
 */
public class FinalTest {

    public static int a = 1;
    public final static int b =2;

    {
        a = 2;
//        b = 3; finalÎŞ·¨ĞŞ¸Ä
    }
}
