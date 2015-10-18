package javaExercise.part15.ex7;//: generics/Fibonacci.java
// Generate a Fibonacci sequence.

import net.mindview.util.*;

public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
}
