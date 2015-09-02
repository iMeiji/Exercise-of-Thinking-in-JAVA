package ex15;//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.

import static Utils.Print.print;

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int sideLength;

    RectangularGlyph(int sideLength) {
        this.sideLength = sideLength;
        print("RectangularGlyph.RectangularGlyph(), sideLength = " + sideLength);
    }

    void draw() {
        print("RectangularGlyph.draw(), sideLength = " + sideLength);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(4);
    }
}