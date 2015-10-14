//: generics/coffee/Cappuccino.java
package javaExercise.part14.ex16.Coffee;

public class Cappuccino extends Coffee {

    public static class MyCoffeeFactory implements CoffeeFactory<Cappuccino> {

        @Override
        public Cappuccino create() {
            return new Cappuccino();
        }
    }
} ///:~
