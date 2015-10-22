package javaExercise.part16.ex13;

import net.mindview.util.CountingGenerator;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/22.
 */
public class Test16_13 {

    public static void main(String[] args) {
        String strings = new CountingGenerator.Character().next().toString();
        print(strings);
    }
}
