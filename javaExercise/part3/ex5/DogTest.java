package ex5;

/**
 * Created by yeming on 2015/8/10.
 */
public class DogTest {

    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        dog1.printMessage();
        dog2.printMessage();
    }
}
