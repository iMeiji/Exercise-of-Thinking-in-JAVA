package ex17;

/**
 * Created by yeming on 2015/8/25.
 */
public class Frog extends Amphibian {

    public static void main(String[] args) {
        //向上转型
        Amphibian frog = new Frog();
        frog.f1();
        frog.f2();
    }
}
