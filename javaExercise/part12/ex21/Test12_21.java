package part12.ex21;

/**
 * Created by yeming on 2015/9/21.
 */

class BaseClass {

    public BaseClass() throws NullPointerException {
        throw new NullPointerException();
    }
}

class ExtendClass {

    public ExtendClass() {

    }
}


public class Test12_21 {

    public static void main(String[] args) {
        //派生类构造器无法抛出基类构造器异常
        ExtendClass extendClass = new ExtendClass();
    }

}
