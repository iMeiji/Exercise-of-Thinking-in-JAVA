package part12.ex1;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/16.
 */
public class Test12_1 {

    public static void main(String[] args) {
        try {
           throw new Exception("This is a exception");
        } catch (Exception e) {
            e.printStackTrace();
            print(e.getMessage());
        } finally {
            print("in finally");
        }
    }
}
