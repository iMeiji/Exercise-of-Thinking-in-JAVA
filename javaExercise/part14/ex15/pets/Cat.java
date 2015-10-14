//: typeinfo/pets/Cat.java
package javaExercise.part14.ex15.pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public static class MyFactory implements PetFactory<Cat> {

        @Override
        public Cat create() {
            return new Cat();
        }
    }
} ///:~
