package javaExercise.part14.ex3;//: typeinfo/Shapes.java

import static net.mindview.util.Print.print;

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
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
        Shape rhombus = new Rhombus();
        print(((Rhombus) rhombus).toString());
        //向下转型错误
//        print(((Circle) rhombus).toString());
    }
}