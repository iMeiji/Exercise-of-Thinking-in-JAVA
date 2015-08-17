package ex19;


/**
 * Created by yeming on 2015/8/18.
 */
public class Test19 {

    public static void main(String[] args) {
        Test test1 = new Test("aaa", "bbb");
        String[] strs = new String[2];
        strs[0] = "aaa";
        strs[1] = "bbb";
        Test test2 = new Test(strs);
    }
}
