package part13.ex8;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/22.
 */
public class Test13_8 {

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        String[] strs = knights.split("the|you");
        for(String str: strs) {
            print(str);
        }
    }
}
