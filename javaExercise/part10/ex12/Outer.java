package part10.ex12;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/7.
 */
abstract class Base {

    abstract int changeNumber(int number);
}

public class Outer {

    private int number = 0;
    public int getNumber() {
        return number;
    }

    public Base getBase() {
        //匿名内部类
        return new Base() {
            public int changeNumber(int number) {
                Outer outer = new Outer();
                outer.number = number;
                return outer.getNumber();
            }
        };
    }

    public static void main(String[] args) {
        Base base = new Outer().getBase();
        print(base.changeNumber(3));
    }

}
