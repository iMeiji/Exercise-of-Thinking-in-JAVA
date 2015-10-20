//: typeinfo/pets/Dog.java
package javaExercise.part15.ex40.pets;

import static net.mindview.util.Print.print;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    @Override
    public void speak() {
        print(Dog.class.getSimpleName());
    }
} ///:~
