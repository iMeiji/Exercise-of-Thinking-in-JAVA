package javaExercise.part16.ex15;//: arrays/ContainerComparison.java

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.util.*;

import static net.mindview.util.Print.*;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

class BSGenerator implements Generator<BerylliumSphere> {

    @Override
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}

public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = Generated.array(BerylliumSphere.class, new BSGenerator(), 5);
        print(Arrays.toString(spheres));
        print(spheres[4]);

        List<BerylliumSphere> sphereList = Arrays.asList(Generated.array(BerylliumSphere.class, new BSGenerator(), 5));
        print(sphereList);
        print(sphereList.get(4));

        int[] integers = {0, 1, 2, 3, 4, 5};
        print(Arrays.toString(integers));
        print(integers[4]);

        List<Integer> intList = new ArrayList<Integer>(
                Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        print(intList);
        print(intList.get(4));
    }
} /* Output:
[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4, null, null, null, null, null]
Sphere 4
[Sphere 5, Sphere 6, Sphere 7, Sphere 8, Sphere 9]
Sphere 9
[0, 1, 2, 3, 4, 5]
4
[0, 1, 2, 3, 4, 5, 97]
4
*///:~
