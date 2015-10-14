//: generics/coffee/Mocha.java
package javaExercise.part14.ex16.Coffee;

public class Mocha extends Coffee {

    public static class MyCoffeeFactory implements CoffeeFactory<Mocha> {

        @Override
        public Mocha create() {
            return new Mocha();
        }
    }
} ///:~
