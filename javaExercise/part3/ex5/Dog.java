package ex5;

/**
 * Created by yeming on 2015/8/10.
 */
public class Dog {
    public String name;
    public String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public void printMessage() {
        System.out.println("name " + name + " says " + says);
    }
}
