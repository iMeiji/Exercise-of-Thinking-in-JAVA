package javaExercise.part16.ex12;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_12 {

    public static void main(String[] args) {
        double[] doubles = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 10));
        print(Arrays.toString(doubles));
    }
}
