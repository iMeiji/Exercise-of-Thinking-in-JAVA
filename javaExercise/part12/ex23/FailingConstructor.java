package part12.ex23;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/21.
 */
class NewException1 extends Exception {

}

class NewException2 extends Exception {

}

class Base {

    int number;

    public Base(int number) {
        this.number = number;
        print("Base " + number);
    }

    public void dispose() {
        print("dispose " + number);
    }
}

public class FailingConstructor {

    public FailingConstructor(Base base) {
        try {
            if (base.number < 0) {
                throw new NewException2();
            }
        } catch (Exception e) {
            base.dispose();
            Base base2 = new Base(10);
        }

    }

    public static void main(String[] args) {
        try {
            Base base = new Base(1);
            FailingConstructor failingConstructor = new FailingConstructor(base);
            base = new Base(-2);
            failingConstructor = new FailingConstructor(base);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
