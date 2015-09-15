package part11.ex23;

import java.util.*;

import static Utils.Print.*;

class Number {

    //数的值
    Integer i;

    //记数
    Integer counter;

    public Number(Integer i, Integer counter) {
        this.i = i;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "number " + i + " counter " + counter;
    }

}

public class Statistics {

    static Comparator<Number> CASE_INSENSITIVE_ORDER = new Comparator<Number>() {
        public int compare(Number o1, Number o2) {
            return o1.counter - o2.counter;
        }
    };


    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            maps.put(r, maps.containsKey(r) ? maps.get(r) + 1: 1);
        }
        print(maps);
        List<Number> numbers = new ArrayList<>();
        for(Integer i: maps.keySet()) {
            numbers.add(new Number(i, maps.get(i)));
        }
        Collections.sort(numbers, CASE_INSENSITIVE_ORDER);
        print(numbers);
    }
}
