package javaExercise.part14.ex5;//: typeinfo/Shapes.java

import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()" + " isFlag ");
    }

    abstract public String toString();
}

interface Rotate {
    void run();
}

class Circle extends Shape implements Rotate {
    public String toString() {
        return "Circle";
    }

    @Override
    public void run() {
        print("Rotate");
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhombus extends Shape {

    @Override
    public String toString() {
        return "Rhombus";
    }
}


public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhombus()
        );
        for (Shape shape : shapeList) {
            if (shape instanceof Circle) {
                print("Circle");
                ((Circle) shape).run();
            } else if (shape instanceof Square) {
                print("Square");
            } else if (shape instanceof Triangle) {
                print("Triangle");
            } else if (shape instanceof Rhombus) {
                print("Rhombus");
            }
        }
    }
}