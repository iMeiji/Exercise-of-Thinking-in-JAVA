package javaExercise.part16.ex24;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/23.
 */

class Person implements Comparable<Person> {
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

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}

public class Test16_24 {

    public static void main(String[] args) {
        Person[] persons1 = {new Person(1), new Person(2)};
        Person person = new Person(1);
        int index = Arrays.binarySearch(persons1, person);
        print(index);
    }
}
