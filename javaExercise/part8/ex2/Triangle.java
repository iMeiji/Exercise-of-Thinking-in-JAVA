//: polymorphism/shape/Triangle.java
package ex2;


import static Utils.Print.print;

public class Triangle extends Shape {

    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    private void print(String s) {
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }

    @Override
    public void printf() {
        print("Triangle print");
    }
}
