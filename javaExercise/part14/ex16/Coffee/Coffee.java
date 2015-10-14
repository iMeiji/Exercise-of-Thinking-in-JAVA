//: generics/coffee/Coffee.java
package javaExercise.part14.ex16.Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static net.mindview.util.Print.*;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

    static List<CoffeeFactory<? extends Coffee>> coffeeFactories = new ArrayList<>();

    static {
        coffeeFactories.add(new Americano.MyCoffeeFactory());
        coffeeFactories.add(new Breve.MyCoffeeFactory());
        coffeeFactories.add(new Cappuccino.MyCoffeeFactory());
        coffeeFactories.add(new Latte.MyCoffeeFactory());
        coffeeFactories.add(new Mocha.MyCoffeeFactory());
    }

    private static Random random = new Random(47);

    public static Coffee createRandom() {
        int n = random.nextInt(coffeeFactories.size());
        return coffeeFactories.get(n).create();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            print(Coffee.createRandom());
        }
    }

} ///:~
