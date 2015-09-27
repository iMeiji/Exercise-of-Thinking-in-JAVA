package part13.ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/24.
 */
public class Test13_10 {

    public static final String STR = "Java now has regular expressions";

    private static List<String> patterns = new ArrayList<>();

    static {
        patterns.add("^Java");  //匹配Java开头的字符串
        patterns.add("\\Breg.*"); //匹配 非词的边界 reg 任意一个或多个
        patterns.add("n.w\\s+h(a|i)s"); //匹配n 任意 w 空白符 h a或者i s
        patterns.add("s?");  //匹配0个或1个s
        patterns.add("s*");  //匹配0个或多个s
        patterns.add("s+");  //匹配1个或多个s
        patterns.add("s{4}"); //匹配连续4个s
        patterns.add("s{1}"); //匹配恰好一个s
        patterns.add("s{0,3}"); //匹配0个到3个s
    }

    public static void main(String[] args) {
        for(String str: patterns) {
            Pattern pattern = Pattern.compile(str);
            Matcher matcher = pattern.matcher(STR);
            while(matcher.find()) {
                print(str + " found");
            }
        }
    }
}
