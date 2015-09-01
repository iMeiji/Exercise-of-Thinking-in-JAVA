package ex2;

import static Utils.Print.print;

public class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void printf() {
        print("Circle print");
    }
}
