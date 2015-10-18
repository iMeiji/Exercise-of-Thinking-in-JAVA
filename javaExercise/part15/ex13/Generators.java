package javaExercise.part15.ex13;//: generics/Generators.java
// A utility to use with Generators.


import java.util.*;

import javaExercise.part14.ex12.coffee.CoffeeGenerator;
import javaExercise.part15.ex7.Fibonacci;
import net.mindview.util.*;

import static net.mindview.util.Print.*;

public class Generators {
    public static Collection fill(Collection coll, Generator gen, int n) {
        print("Collection");
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static List fill(List coll, Generator gen, int n) {
        print("List");
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static Queue fill(Queue coll, Generator gen, int n) {
        print("Queue");
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static Set fill(Set coll, Generator gen, int n) {
        print("Set");
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static LinkedList fill(LinkedList coll, Generator gen, int n) {
        print("LinkedList");
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static void main(String[] args) {
//        Collection coffee = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
//        for (Object c : coffee)
//            System.out.println(c);
//        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
//        for (int i : fnumbers)
//            System.out.print(i + ", ");

        Collection coffee = fill(new LinkedList(), new CoffeeGenerator(), 4);
        for (Object c : coffee)
            System.out.println(c);
        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fnumbers)
            System.out.print(i + ", ");

    }


} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
*///:~
