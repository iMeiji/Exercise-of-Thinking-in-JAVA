package ex17;

import static Utils.Print.print;
/**
 * Created by yeming on 2015/9/1.
 */
public class Bicycle extends Cycle {
    @Override
    public int wheel() {
        return 2;
    }

    public void balance() {
        print("Bicycle.balance()");
    }
}
