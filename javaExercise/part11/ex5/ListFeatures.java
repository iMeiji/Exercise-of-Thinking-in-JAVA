package part11.ex5;//: holding/ListFeatures.java


import java.util.*;

import static Utils.Print.*;

public class ListFeatures {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        print("1: " + integers);
        integers.add(111); // Automatically resizes
        integers.add(222);
        print("2: " + integers);
        print("3: " + integers.contains(111));
        integers.remove(1); // Remove by object
        Integer p = integers.get(0);
        print("4: " + p + " " + integers.indexOf(p));
        Integer cymric = new Integer(222);
        print("5: " + integers.indexOf(cymric));
        print("6: " + integers.remove(cymric));
        // Must be the exact object:
        print("7: " + integers.remove(p));
        print("8: " + integers);
        integers.add(0, new Integer(333)); // Insert at an index
        print("9: " + integers);
        List<Integer> sub = integers.subList(1, 4);
        print("subList: " + sub);
        print("10: " + integers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
        // Order is not important in containsAll():
        print("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, new Random(12)); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + integers.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Integer>(integers); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        copy.set(1, new Integer(555)); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + integers.isEmpty());
        integers.clear(); // Remove all elements
        print("19: " + integers);
        print("20: " + integers.isEmpty());
        Object[] o = integers.toArray();
        print("22: " + o[3]);
    }
}
