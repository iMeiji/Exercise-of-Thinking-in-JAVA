package part11.ex9;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Iterator {

        private int i;

        @Override
        public boolean hasNext() {
            return i < items.length;
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return items[i++];
            } else {
                throw new NoSuchElementException();
            }
        }

    }

    public Iterator selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator selector = sequence.selector();
        while (selector.hasNext()) {
            selector.next();
        }

    }
}
