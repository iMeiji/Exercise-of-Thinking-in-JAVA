package javaExercise.part16.ex23;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/23.
 */
public class Test16_23 {

    public static void main(String[] args) {
        Integer[] numbers = Generated.array(new Integer[10], new RandomGenerator.Integer(100));
        print("Unsorted array: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        print("Sorted array: " + Arrays.toString(numbers));

    }
}
