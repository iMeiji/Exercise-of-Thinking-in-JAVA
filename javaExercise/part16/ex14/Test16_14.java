package javaExercise.part16.ex14;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_14 {

    public static void main(String[] args) {
        int[] ints = ConvertTo.primitive(Generated.array(Integer.class, new CountingGenerator.Integer(), 3));
        double[] doubles = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 3));
        float[] floats = ConvertTo.primitive(Generated.array(Float.class, new CountingGenerator.Float(), 3));
        long[] longs = ConvertTo.primitive(Generated.array(Long.class, new CountingGenerator.Long(), 3));
        short[] shorts = ConvertTo.primitive(Generated.array(Short.class, new CountingGenerator.Short(), 3));
        char[] chars = ConvertTo.primitive(Generated.array(Character.class, new CountingGenerator.Character(), 3));

        print(Arrays.toString(ints));
        print(Arrays.toString(doubles));
        print(Arrays.toString(floats));
        print(Arrays.toString(longs));
        print(Arrays.toString(shorts));
        print(Arrays.toString(chars));
    }
}
