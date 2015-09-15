package part11.ex18;

import java.util.*;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/15.
 */
public class Test11_18 {

    public static void main(String[] args) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        Random random = new Random(10);
        for (int i = 0; i < 100; i++) {
            Integer number = random.nextInt(10);
            Integer times = numberMap.get(number);
            numberMap.put(number, numberMap.containsKey(number) ? times + 1 : 1);
        }
        for(Integer number: numberMap.keySet()) {
            print(number.hashCode());
        }
        Integer[] numbers = numberMap.keySet().toArray(new Integer[0]);
        Arrays.sort(numbers);
        Map<Integer, Integer> linkedNumberMap = new LinkedHashMap<>();
        for(Integer number: numbers) {
            linkedNumberMap.put(number, numberMap.get(number));
        }
        print(linkedNumberMap);
    }

}
