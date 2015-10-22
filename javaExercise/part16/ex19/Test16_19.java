package javaExercise.part16.ex19;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/22.
 */

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object person) {
        if(person instanceof Person) {
            return age == ((Person) person).age;
        }
        return false;
    }

}

public class Test16_19 {

    public static void main(String[] args) {
        Person[] persons1 = {new Person(1), new Person(1)};
        Person[] persons2 = {new Person(1), new Person(1)};
        print(Arrays.equals(persons1, persons2));
    }

}
