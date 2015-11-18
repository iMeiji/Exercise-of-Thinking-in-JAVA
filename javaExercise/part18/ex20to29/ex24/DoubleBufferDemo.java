package javaExercise.part18.ex20to29.ex24;//: io/IntBufferDemo.java
// Manipulating ints in a ByteBuffer with an IntBuffer

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class DoubleBufferDemo {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer ib = bb.asDoubleBuffer();
        // Store an array of int:
        ib.put(new double[]{11.1, 42.2, 47.3, 99.4, 143.5, 811.6, 1016.7});
        // Absolute location read and write:
        System.out.println(ib.get(3));
        ib.put(3, 1811);
        // Setting a new limit before rewinding the buffer.
        ib.flip();
        while (ib.hasRemaining()) {
            double i = ib.get();
            System.out.println(i);
        }
    }
} /* Output:
99
11
42
47
1811
143
811
1016
*///:~
