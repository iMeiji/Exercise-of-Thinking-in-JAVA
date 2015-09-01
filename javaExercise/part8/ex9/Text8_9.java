package ex9;

/**
 * Created by yeming on 2015/9/1.
 */
public class Text8_9 {

    private static void f(Rodent rodent) {
        rodent.f();
    }

    private static void fAll(Rodent[] rodents) {
        for (Rodent rodent: rodents) {
            rodent.f();
        }
    }


    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        fAll(rodents);
    }
}
