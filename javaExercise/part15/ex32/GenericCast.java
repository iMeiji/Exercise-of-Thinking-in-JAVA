package javaExercise.part15.ex32;//: generics/GenericCast.java

class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage[--index];
    }
}

public class GenericCast {

    public static void main(String[] args) {
        FixedSizeStack<Integer> integers = new FixedSizeStack<>(1);
        integers.push(1);
        integers.pop();
        try {
            integers.pop();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
} /* Output:
J I H G F E D C B A
*///:~
