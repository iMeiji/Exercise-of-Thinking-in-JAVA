package part12.ex2;

/**
 * Created by yeming on 2015/9/16.
 */

class Dog {
    void f() {

    }
}


public class Test12_2 {

    public static void main(String[] args) {
        try {
            Dog dog = null;
            dog.f();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
