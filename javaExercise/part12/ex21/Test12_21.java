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
        //�����๹�����޷��׳����๹�����쳣
        ExtendClass extendClass = new ExtendClass();
    }

}
