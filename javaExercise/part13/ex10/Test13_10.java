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
        patterns.add("^Java");  //ƥ��Java��ͷ���ַ���
        patterns.add("\\Breg.*"); //ƥ�� �Ǵʵı߽� reg ����һ������
        patterns.add("n.w\\s+h(a|i)s"); //ƥ��n ���� w �հ׷� h a����i s
        patterns.add("s?");  //ƥ��0����1��s
        patterns.add("s*");  //ƥ��0������s
        patterns.add("s+");  //ƥ��1������s
        patterns.add("s{4}"); //ƥ������4��s
        patterns.add("s{1}"); //ƥ��ǡ��һ��s
        patterns.add("s{0,3}"); //ƥ��0����3��s
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
