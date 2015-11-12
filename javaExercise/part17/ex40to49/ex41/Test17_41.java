package javaExercise.part17.ex40to49.ex41;

import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Comparator;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/12.
 */
class Person implements Comparable<Person> {
    private static RandomGenerator.String gen = new RandomGenerator.String();
    private String name1;
    private String name2;

    public Person(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public static Generator<Person> generator() {
        return new Generator<Person>() {
            public Person next() {
                return new Person(gen.next(), gen.next());
            }
        };
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public int compareTo(Person person) {
        return name2.length() - person.name2.length();
    }

    @Override
    public String toString() {
        return name1;
    }

    @Override
    public int hashCode() {
        return name1.hashCode() + name2.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person && ((Person) obj).name1.equals(name1) && ((Person) obj).name2.equals(name2);
    }
}

class CompareSecond implements Comparator<Person> {
    public int compare(Person sc1, Person sc2) {
        return sc1.getName2().compareTo(sc2.getName2());
    }
}

public class Test17_41 {

    public static void main(String[] args) {
    }
}
