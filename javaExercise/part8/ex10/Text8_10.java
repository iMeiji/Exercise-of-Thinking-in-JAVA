package ex10;


import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/1.
 */

class BaseClass {
    public void f1() {
        print("Base f1");
        f2();
    }

    public void f2() {
        print("Base f2");
    }
}

class Child extends BaseClass {

    @Override
    public void f2() {
        print("Child f2");
    }
}

public class Text8_10 {

    public static void main(String[] args) {
        BaseClass child = new Child();
        //向上转型，多态调用导出类的f2方法
        child.f1();
    }

}

