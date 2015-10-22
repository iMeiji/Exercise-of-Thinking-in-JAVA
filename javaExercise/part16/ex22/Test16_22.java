package javaExercise.part16.ex22;

import java.util.Arrays;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/23.
 */
public class Test16_22 {

    public static void main(String[] args) {
        int[] numbers = {23, 3, 45, 2};
        int index = Arrays.binarySearch(numbers, 2);
        print(index); //对未排序的数组进行查找，结果不可预知
    }

}
