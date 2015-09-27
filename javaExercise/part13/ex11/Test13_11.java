package part13.ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/24.
 */
public class Test13_11 {

    public static final String STR = "Arline ate eight apples and \" +\n" +
            "\"one orange while Anita hadn't any";

    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher(STR);
        while (m.find()) {
            print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
        }
    }
}
