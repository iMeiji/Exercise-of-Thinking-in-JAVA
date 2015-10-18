package javaExercise.part15.ex7;

import java.util.Iterator;
import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/16.
 */
public class IterableFibonacci implements Iterable<Integer>{

    private Fibonacci fibonacci = new Fibonacci();

    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                return fibonacci.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i: new IterableFibonacci(20)) {
            print(i);
        }
    }
}
