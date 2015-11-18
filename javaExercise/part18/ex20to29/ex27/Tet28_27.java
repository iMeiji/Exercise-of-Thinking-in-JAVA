package javaExercise.part18.ex20to29.ex27;

import java.io.*;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/11/17.
 */

class Person implements Serializable {
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "person age " + age + " name " + name ;
    }
}

class Man implements Serializable {
    public Person person;

    public Man(int age, String name) {
        person = new Person(age, name);
    }

    @Override
    public String toString() {
        return person.toString() ;
    }
}

public class Tet28_27 {
    static String file = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test27.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Man man1 = new Man(10, "wym");
        print("man1 " + man1);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(man1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Man man2 = (Man) in.readObject();
        print("man2 " + man2);
    }
}
