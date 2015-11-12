package javaExercise.part17.ex40to49.ex40;

import net.mindview.util.CollectionData;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
}

class CompareSecond implements Comparator<Person> {
    public int compare(Person sc1, Person sc2) {
        return sc1.getName2().compareTo(sc2.getName2());
    }
}

public class Test17_40 {

    public static void main(String[] args) {
        Person[] persons = new Person[10];
        Generated.array(persons, Person.generator());
        print("not sort" + persons);
        Arrays.sort(persons);
        print("sort" + persons);

        ArrayList<Person> personList = new ArrayList<>(CollectionData.list(Person.generator(), 10));
        Person zeroth = personList.get(0);
        print("not sort" + personList);
        Collections.sort(personList);
        print("sort" + personList);

        int index = Collections.binarySearch(personList, zeroth, new CompareSecond());
        print(index);

    }
}
