package javaExercise.part15.ex6;//: generics/RandomList.java

import java.util.*;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<Integer> rs = new RandomList<Integer>();
        for(int i=0;i<10;i++) {
            rs.add(i);
        }
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
    }
}
