package ex11;

import ex10.Test;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test11 {

    public static void main(String[] args) throws Throwable {
        ex10.Test test = new Test();
        test = null;
        System.gc();
        //不确保finalize()方法会被调用
    }
}
