package javaExercise.part15.ex33;//: generics/GenericCast.java

import java.util.ArrayList;

class FullStackException extends RuntimeException {
}

class FixedSizeStack<T> {
    private int index;

    private int size;

    private ArrayList storage;

    public FixedSizeStack(int size) {
        storage = new ArrayList();
        this.size = size;
    }

    public void push(T item) {
        if (index < size) {
            index++;
            storage.add(item);
        } else {
            throw new FullStackException();
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (index > 0) {
            index--;
            T obj = (T) storage.get(index);
            storage.remove(index);
            return obj;
        } else {
            throw new FullStackException();
        }
    }
}

public class GenericCast {

    public static void main(String[] args) {
        FixedSizeStack<Integer> integers = new FixedSizeStack<>(1);
        integers.push(1);
        integers.pop();
//        integers.pop();

        integers.push(1);
        integers.push(2);
    }
}
