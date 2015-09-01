//: polymorphism/shape/Square.java
package ex2;


import static Utils.Print.print;

public class Square extends Shape {

    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }

    @Override
    public void printf() {
        print("Square print");
    }
} ///:~
