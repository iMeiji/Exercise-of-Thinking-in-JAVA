package javaExercise.part16.ex21;//: arrays/ContainerComparison.java

import java.util.*;

import static net.mindview.util.Print.print;

class BerylliumSphere implements Comparable<BerylliumSphere> {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(BerylliumSphere berylliumSphere) {
        return (int) (berylliumSphere.getId() - id);
    }
}

public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[5];
        for (int i = 0; i < 5; i++)
            spheres[i] = new BerylliumSphere();
        print(Arrays.toString(spheres));
        Arrays.sort(spheres);
        print(Arrays.toString(spheres));
    }

}
