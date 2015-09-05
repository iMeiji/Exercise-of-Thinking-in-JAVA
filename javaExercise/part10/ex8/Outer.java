package part10.ex8;

/**
 * Created by yeming on 2015/9/6.
 */
public class Outer {

    public int getInnerNumber() {
        return new Inner().i;  //可以访问内部类的private元素
    }

    public class Inner {
        private int i = 0;
    }
}
