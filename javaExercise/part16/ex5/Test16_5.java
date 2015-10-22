package javaExercise.part16.ex5;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_5 {

    public static int[][][] createMultiDimensionalArray(int size1, int size2, int size3) {
        int[][][] arrays = new int[size1][size2][size3];
        return arrays;
    }

    public static void main(String[] args) {
        print(Arrays.deepToString(createMultiDimensionalArray(3, 4, 5)));
    }
}
