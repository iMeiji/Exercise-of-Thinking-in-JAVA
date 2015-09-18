package part12.ex13;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/16.
 */
class NewException1 extends Exception {

}

class NewException2 extends NewException1 {

}

class NewException3 extends NewException2 {

}

public class Test12_13 {

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            print("-----------");
        }
    }
}
