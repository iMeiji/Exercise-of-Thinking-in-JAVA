//: generics/coffee/Americano.java
package javaExercise.part14.ex16.Coffee;

public class Americano extends Coffee {

    public static class MyCoffeeFactory implements CoffeeFactory<Americano> {

        @Override
        public Americano create() {
            return new Americano();
        }
    }
} ///:~
