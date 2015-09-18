package part12.ex9;

/**
 * Created by yeming on 2015/9/16.
 */
class NewException1 extends Exception {

}

class NewException2 extends NewException1 {

}

class NewException3 extends NewException2 {

}

public class Test12_9 {

    public static void main(String[] args) {
        try {
            throw new NewException3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
