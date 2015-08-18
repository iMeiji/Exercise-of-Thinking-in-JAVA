package ex6;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test6_6 {

    public static void main(String[] agrs) {
        TestClass testClass1 = new TestClass();
        testClass1.setI(1);
        TestClass testClass2 = new TestClass(testClass1.getI());
    }
}
