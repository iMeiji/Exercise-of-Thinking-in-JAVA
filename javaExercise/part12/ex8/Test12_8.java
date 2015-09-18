package part12.ex8;

/**
 * Created by yeming on 2015/9/16.
 */

class MyException extends Exception {

}

class Dog {
    //±‡“Î¥ÌŒÛ
//   static void f1() {
//        throw new MyException();
//    }

    static void f2() throws MyException {
        throw new MyException();
    }
}

public class Test12_8 {

    public static void main(String[] args) {
        try {
            Dog.f2();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
