import java.lang.System;

public class StaticTest {
    static int a = 0;

    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        StaticTest staticTest3 = new StaticTest();
        staticTest1.a++;
        System.out.println("1 aa " + staticTest1.a + " 2 aa " +  staticTest2.a + " 3 aa" + staticTest3.a);
    }

}