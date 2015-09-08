package part11.ex3;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

interface Selector {

    void add(Object obj);
}

public class Sequence {

    private List items = new ArrayList<>();

    private class SequenceSelector implements Selector {

        @Override
        public void add(Object obj) {
            items.add(obj);
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.selector().add(i);
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
