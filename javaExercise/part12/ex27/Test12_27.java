package part12.ex27;

/**
 * Created by yeming on 2015/9/16.
 */
public class Test12_27 {

    public static void main(String[] args) {
        try {
            String[] strs = new String[1];
            strs[0] = "aaa";
            String a = strs[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
