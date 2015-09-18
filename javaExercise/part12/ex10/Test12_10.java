package part12.ex10;

/**
 * Created by yeming on 2015/9/18.
 */

class SuperException extends Exception {

    @Override
    public String getMessage() {
        return "SuperException";
    }

    public SuperException() {

    }
}

class SuperException2 extends Exception {

    private String errMsg;

    public SuperException2(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String getMessage() {
        return errMsg;
    }
}

class ExceptionDemo {

    static void g() throws SuperException {
        throw new SuperException();
    }

    static void f(String errMsg) throws SuperException2 {
        throw new SuperException2(errMsg);
    }
}


public class Test12_10 {
    public static void main(String[] args) {
        try {
            ExceptionDemo.g();
        } catch (SuperException e) {
            try {
                ExceptionDemo.f(e.getMessage());
            } catch (SuperException2 superException2) {
                superException2.printStackTrace();
            }
        }
    }

}
