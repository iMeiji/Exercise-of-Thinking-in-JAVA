//: generics/coffee/Breve.java
package javaExercise.part14.ex16.Coffee;

public class Breve extends Coffee {

    public static class MyCoffeeFactory implements CoffeeFactory<Breve> {

        @Override
        public Breve create() {
            return new Breve();
        }
    }
} ///:~
