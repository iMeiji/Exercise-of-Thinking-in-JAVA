package javaExercise.part14.ex6;

import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/9.
 */
abstract class Shape {

    boolean isFlag;

    void setFlag() {
        isFlag = true;
    };

    boolean isFlag() {
        return isFlag;
    }

    void draw() {
        System.out.println(this + ".draw()" + " isFlag " + isFlag());
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
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
            shape.setFlag();
            shape.draw();
        }
    }
}
