package part9.ex11;

/**
 * Created by yeming on 2015/9/2.
 */
public class CharacterPairSwapper {

    static String swap(String str) {
        String str2 = "";
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length-1;i++) {
            char c1 = chars[i];
            char c2 = chars[i+1];
            str2 += c2 + c1;
        }
        return str2;
    }
}
