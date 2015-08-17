package ex18;

import ex17.Test;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test18 {

    public static void main(String[] args) {
        Test[] tests = new Test[2];
        Test test1 = new Test("aaa");
        Test test2 = new Test("bbb");
        tests[0] = test1;
        tests[1] = test2;
    }
}
