package part13.ex9;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/22.
 */
public class Test13_9 {

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        print(knights.replaceAll("a|e|i|o|u", "-"));
    }
}
