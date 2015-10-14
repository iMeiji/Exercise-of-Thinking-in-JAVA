//: typeinfo/pets/Dog.java
package javaExercise.part14.ex15.pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    public static class MyFactory implements PetFactory<Dog> {

        @Override
        public Dog create() {
            return new Dog();
        }
    }
} ///:~
