package ex6;

import ex5.Dog;

/**
 * Created by yeming on 2015/8/10.
 */
public class AssignmentTest {

    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        dog2 = dog1;
        System.out.println("equals " + dog2.equals(dog1));
        System.out.println("name equals " + dog2.name.equals(dog1.name));
        System.out.println("says equals " + dog2.says.equals(dog1.says));
        System.out.println("name == " + dog2.name == dog1.name);
        System.out.println("says == " + dog2.says == dog1.says);
    }
}
