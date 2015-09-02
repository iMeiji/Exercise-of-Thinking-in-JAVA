package ex17;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */
public class Unicycle extends Cycle {

    @Override
    public int wheel() {
        return 1;
    }

    public void balance() {
        print("Unicycle.balance()");
    }
}
