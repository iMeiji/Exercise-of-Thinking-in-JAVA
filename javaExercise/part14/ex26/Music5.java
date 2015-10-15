//: interfaces/music5/Music5.java
// Interfaces.
package javaExercise.part14.ex26;

import static net.mindview.util.Print.*;

interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final

    // Cannot have method definitions:
    void play(Note n); // Automatically public

    void adjust();

    void prepareInstrument();
}

//¹ÜÀÖÆ÷
class Wind implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public void prepareInstrument() {
        clearSpitValve();
    }

    public void clearSpitValve() {
        print(this + ".clearSpitValve()");
    }
}

class Percussion implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public void prepareInstrument() {
        print(this + ".prepareInstrument()");
    }
}

class Stringed implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public void prepareInstrument() {
        print(this + ".prepareInstrument()");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    static void prepareAll(Instrument[] e) {
        for (Instrument i : e) {
            i.prepareInstrument();
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        prepareAll(orchestra);
    }
}
