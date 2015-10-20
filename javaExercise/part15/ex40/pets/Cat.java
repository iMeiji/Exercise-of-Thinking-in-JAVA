//: typeinfo/pets/Cat.java
package javaExercise.part15.ex40.pets;

import static net.mindview.util.Print.print;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    public void speak() {
        print(Cat.class.getSimpleName());
    }
} ///:~
