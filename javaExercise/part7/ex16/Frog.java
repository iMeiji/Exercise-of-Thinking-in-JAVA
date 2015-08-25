package ex16;

/**
 * Created by yeming on 2015/8/25.
 */
public class Frog extends Amphibian {

    @Override
    public void f1() {
        System.out.println("Frog f1");
    }

    @Override
    public void f2() {
        System.out.println("Frog f2");
    }

    public static void main(String[] args) {
        //向上转型
        Amphibian frog = new Frog();
        frog.f1();
        frog.f2();
    }
}
