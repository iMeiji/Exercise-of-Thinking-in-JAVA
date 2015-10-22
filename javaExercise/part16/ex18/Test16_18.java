package javaExercise.part16.ex18;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/22.
 */

class BSGenerator implements Generator<BerylliumSphere> {

    @Override
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}

public class Test16_18 {

    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres1 = Generated.array(BerylliumSphere.class, new BSGenerator(), 5);
        BerylliumSphere[] berylliumSpheres2 = new BerylliumSphere[5];
        System.arraycopy(berylliumSpheres1, 0, berylliumSpheres2, 0, berylliumSpheres1.length);
        print(Arrays.toString(berylliumSpheres2));
        berylliumSpheres1 = null;
        print(Arrays.toString(berylliumSpheres2));
    }
}
