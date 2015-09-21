package part12.ex24;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/21.
 */
class NewException1 extends Exception {

}

class NewException2 extends Exception {

}

class Base {

    boolean hasDispose;
    int number;

    public Base(int number) {
        this.number = number;
        print("Base " + number);
    }

    public void dispose() {
        hasDispose = true;
        print("Base dispose " + number);
    }
}

public class FailingConstructor {

    private Base base1;
    private Base base2;

    public FailingConstructor(Base base1) {
        this.base1 = base1;
        try {
            if (base1.number < 0) {
                throw new NewException2();
            }
        } catch (Exception e) {
            base1.dispose();
            base2 = new Base(10);
        }
    }

    public void dispose() {
        if(base1 != null && !base1.hasDispose) {
            base1.dispose();
        }
        if (base1 != null && !base2.hasDispose) {
            base2.dispose();
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
