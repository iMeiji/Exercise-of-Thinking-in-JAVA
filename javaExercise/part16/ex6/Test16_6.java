package javaExercise.part16.ex6;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_6 {

    public static BerylliumSphere[][] createMultiDimensionalArray(int size1, int size2) {
        BerylliumSphere[][] arrays = new BerylliumSphere[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arrays[i][j] = new BerylliumSphere();
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        print(Arrays.deepToString(createMultiDimensionalArray(3, 4)));
    }
}
