package javaExercise.part16.ex1;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_1 {

    public static void f(BerylliumSphere[] berylliumSpheres) {
        print("f BerylliumSphere");
    }

    public static void main(String[] args) {
        f(new BerylliumSphere[3]);
//        f({new BerylliumSphere()});
        BerylliumSphere[] berylliumSpheres = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        f(berylliumSpheres);
    }
}
