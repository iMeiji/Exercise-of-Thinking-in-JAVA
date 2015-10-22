package javaExercise.part16.ex20;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/23.
 */
public class Test16_20 {

    public static void main(String[] args) {
        int[][] aa = {{1, 1}, {1, 1}};
        int[][] bb = {{1, 1}, {1, 1}};
        int[][] cc = {{1, 2}, {1, 1}};
        print(Arrays.deepEquals(aa, bb));
        print(Arrays.deepEquals(aa, cc));
    }
}
