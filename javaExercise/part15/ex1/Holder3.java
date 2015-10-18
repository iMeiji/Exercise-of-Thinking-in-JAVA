package javaExercise.part15.ex1;//: generics/Holder3.java

import javaExercise.part14.ex11.pets.Cat;
import javaExercise.part14.ex11.pets.Dog;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Holder3<Cat> holder3_1 = new Holder3<>(cat);
        Dog dog = new Dog();
        Holder3<Dog> holder3_2 = new Holder3<>(dog);
    }
} ///:~
