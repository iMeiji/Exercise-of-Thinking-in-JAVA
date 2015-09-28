package part13.ex20;

import java.util.Scanner;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/28.
 */
class Person {
    int number;
    long longNumber;
    float fNumber;
    double dNumber;
    String string;

    public Person(String input) {
        Scanner scanner = new Scanner(input);
        number = scanner.nextInt();
        longNumber = scanner.nextLong();
        dNumber = scanner.nextDouble();
        string = scanner.next();
    }

    @Override
    public String toString() {
        return "number " + number + "　longNumber　" + longNumber + "　fNumber　"
                + fNumber + "　dNumber　" + dNumber + "　string　" + string;
    }
}


public class Test13_20 {

    public static void main(String[] args) {
        Person person = new Person("1\n2\n3.0\n4000\nsdasd\n");
        print(person.toString());
    }

}
