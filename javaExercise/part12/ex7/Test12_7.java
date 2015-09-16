package part12.ex7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by yeming on 2015/9/16.
 */
public class Test12_7 {

    private static Logger logger = Logger.getLogger("Test12_7");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            String[] strs = new String[1];
            strs[0] = "aaa";
            String a = strs[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
