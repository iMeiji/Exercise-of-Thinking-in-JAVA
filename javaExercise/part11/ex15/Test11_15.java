package part11.ex15;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/9.
 */
public class Test11_15 {

    static String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++) {
            String s = str.substring(i,i+1);
            if(s.equals("+")) {
                i++;
                stack.push(str.substring(i,i+1));
            } else if(s.equals("-")) {
                print(stack.pop());
            }
        }

    }
}
