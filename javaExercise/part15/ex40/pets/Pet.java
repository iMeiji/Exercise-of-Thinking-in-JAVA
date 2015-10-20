//: typeinfo/pets/Pet.java
package javaExercise.part15.ex40.pets;

import static net.mindview.util.Print.*;

public class Pet extends Individual {
    public Pet(String name) {
        super(name);
    }

    public Pet() {
        super();
    }

    public void speak() {
        print(Pet.class.getSimpleName());
    }
} ///:~
