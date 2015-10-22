package javaExercise.part16.ex2;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/22.
 */
class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Test16_2 {

    public static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[size];
        for (int i = 0; i < size; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        return berylliumSpheres;
    }

    public static void main(String[] args) {
        print(Arrays.toString(createArray(3)));
    }
}
