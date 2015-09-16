package part12.ex5;

import java.util.ArrayList;
import java.util.List;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/16.
 */

class MyException extends Exception {

    static int count = 3;

    public static void f() throws MyException {
        if(--count != 0) {
            throw new MyException();
        }
    }
}

public class Test12_5 {

    public static void main(String[] args) {
        while(true) {
            try {
                MyException.f();
            } catch (MyException e) {
                e.printStackTrace();
                continue;
            }
            print("no exception");
            break;
        }
        print("Success");
    }
}
