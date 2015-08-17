package ex8;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test {

    public void func1() {
        func2();
        this.func2();
    }

    private void func2() {
        System.out.println("func2 ");
    }
}
