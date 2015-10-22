package javaExercise.part16.ex3;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_3 {

    public static int[][] createMultiDimensionalArray(int size1, int size2) {
        int[][] arrays = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arrays[i][j] = Math.abs(size2 - size1);
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        print(Arrays.deepToString(createMultiDimensionalArray(3, 4)));
    }
}
