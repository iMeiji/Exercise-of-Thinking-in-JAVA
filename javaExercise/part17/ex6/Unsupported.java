package javaExercise.part17.ex6;

import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */
public class Unsupported {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a b c".split(" "));
        test("Arrays.asList", list);
    }

    static void test(String msg, List<String> list) {
        print(msg);
        try {
            list.add("aa");
        } catch (UnsupportedOperationException e) {
            print("add " + e);
        }

        try {
            list.remove(1);
        } catch (UnsupportedOperationException e) {
            print("remove " + e);
        }
    }
}
