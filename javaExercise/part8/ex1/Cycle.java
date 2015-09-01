package ex1;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */
public abstract class Cycle {

    public abstract int wheel();

    public void ride() {
        print(wheel());
    }
}
