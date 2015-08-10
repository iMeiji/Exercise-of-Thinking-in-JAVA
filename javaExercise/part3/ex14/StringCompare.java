package ex14;

/**
 * Created by yeming on 2015/8/10.
 */
public class StringCompare {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = str1;
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
    }
}
