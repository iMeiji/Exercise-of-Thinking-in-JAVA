package part12.ex6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by yeming on 2015/9/16.
 */

class MyException1 extends Exception {
    private static Logger logger = Logger.getLogger("MyException1");

    public MyException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}

class MyException2 extends Exception {
    private static Logger logger = Logger.getLogger("MyException2");

    public MyException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}

public class Test12_6 {

    public static void main(String[] args) {
        try {
            throw new MyException1();
        } catch (MyException1 e) {
            System.err.println(e);
        }

        try {
            throw new MyException2();
        } catch (MyException2 e) {
            System.err.println(e);
        }
    }
}
