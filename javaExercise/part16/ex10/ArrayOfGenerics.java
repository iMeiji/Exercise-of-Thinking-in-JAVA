package javaExercise.part16.ex10;//: arrays/ArrayOfGenerics.java
// It is possible to create arrays of generics.

import java.util.*;

public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();
        ls.add(new ArrayList<>());
        ls.get(0).add("Array of Generics");
        System.out.println(ls.toString());
    }
} ///:~
