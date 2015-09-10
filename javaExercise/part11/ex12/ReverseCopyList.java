package part11.ex12;

import java.util.*;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/9.
 */
public class ReverseCopyList {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer> reverseNumber = new ArrayList<>();

        //Method1
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverseNumber.add(numbers.get(i));
        }

        print("Method1");
        reverseNumber.forEach(Utils.Print::print);

        reverseNumber.clear();

        //Method2
        reverseNumber.addAll(numbers);
        Collections.reverse(reverseNumber);

        print("Method2");
        reverseNumber.forEach(Utils.Print::print);

        reverseNumber.clear();

        //Method3
        ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
        while (listIterator.hasPrevious()) {
            reverseNumber.add(listIterator.previous());
        }

        print("Method3");
        reverseNumber.forEach(Utils.Print::print);

    }
}
