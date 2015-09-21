package part13.ex5;

import java.util.Formatter;

/**
 * Created by yeming on 2015/9/22.
 */
public class Test13_5 {

    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%d:%c:%b:%s:%f:%e:%x:%h", 10, 'a', false, "bbb", 2.3f, 2.4f, 0x9e, 1231);
    }

}
