package part12.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeming on 2015/9/16.
 */
public class Test12_3 {

    public static void main(String[] args) {
        try {
            String[] strs = new String[1];
            strs[0] = "aaa";
            String a = strs[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
