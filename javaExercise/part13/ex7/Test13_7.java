package part13.ex7;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/22.
 */
public class Test13_7 {

    public static boolean isMatch(String str) {
        String pattern = "^[A-Z].+\\.";
        return str.matches(pattern);
    }

    public static void main(String[] args) {
        print(Test13_7.isMatch("ADS32R.'1;2/.OO."));
        print(Test13_7.isMatch("asd3243/;.dada."));
    }

}
