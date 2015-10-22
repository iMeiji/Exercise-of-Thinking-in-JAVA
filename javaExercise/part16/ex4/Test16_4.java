package javaExercise.part16.ex4;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_4 {

    public static int[][][] createMultiDimensionalArray(int size1, int size2, int size3) {
        int[][][] arrays = new int[size1][size2][size3];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for(int m = 0; m < size3 ; m++) {
                    arrays[i][j][m] = 2;
                }
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        print(Arrays.deepToString(createMultiDimensionalArray(3, 4, 5)));
    }
}
