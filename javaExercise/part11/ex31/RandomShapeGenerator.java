//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package part11.ex31;

import ex2.Circle;
import ex2.Shape;
import ex2.Square;
import ex2.Triangle;

import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>{
    private Random rand = new Random(47);

    private int number;

    public RandomShapeGenerator(int number) {
        this.number = number;
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count;

            @Override
            public boolean hasNext() {
                return count < number;
            }

            @Override
            public Shape next() {
                ++count;
                return nextShape();
            }
        };
    }

    public Shape nextShape() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
