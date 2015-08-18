package ex5;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test6_5 {

    public static void main(String[] agrs) {
        TestClass testClass = new TestClass();
        //无法访问私有域和方法
        testClass.a = 1;
        testClass.c = 2;
        testClass.d = 3;
        testClass.f1();
        testClass.f3();
        testClass.f4();
    }
}
