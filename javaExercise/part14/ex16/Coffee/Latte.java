//: generics/coffee/Latte.java
package javaExercise.part14.ex16.Coffee;

public class Latte extends Coffee {

    public static class MyCoffeeFactory implements CoffeeFactory<Latte> {

        @Override
        public Latte create() {
            return new Latte();
        }
    }
} ///:~
