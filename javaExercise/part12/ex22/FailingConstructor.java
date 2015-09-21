package part12.ex22;

/**
 * Created by yeming on 2015/9/21.
 */

class Base {

    public Base(int i) {
        if(i < 0) {
            throw new NullPointerException();
        }
    }
}

public class FailingConstructor {

    public static void main(String[] args) {
        try {
            Base base = new Base(-1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
