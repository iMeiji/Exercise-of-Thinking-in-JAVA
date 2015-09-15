package part11.ex19;

import java.util.*;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/15.
 */
public class Test11_19 {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        for(Integer number: numbers) {
            print(number.hashCode());
        }
        Arrays.sort(numbers.toArray());
        Set<Integer> numbers2 = new LinkedHashSet<>();
        for(Integer number: numbers) {
            numbers2.add(number);
        }
        print(numbers2);
    }
}
