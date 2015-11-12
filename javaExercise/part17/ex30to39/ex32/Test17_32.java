package javaExercise.part17.ex30to39.ex32;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by yeming on 2015/11/10.
 */
public class Test17_32 {

    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<String>>> tests = new ArrayList<>();
    static List<Test<IntContainer>> qTests = new ArrayList<>();

    static {
        tests.add(new Test<List<String>>("add") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++) {
                        list.add(String.valueOf(j));
                        list.set(j, String.valueOf(j));
                    }
                }
                return loops * listSize;
            }
        });
        tests.add(new Test<List<String>>("get") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        // Tests for queue behavior:
        qTests.add(new Test<IntContainer>("addFirst") {
            int test(IntContainer list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++) {
                        list.add(47);
                        list.set(j, 47);
                    }
                }
                return loops * size;
            }
        });
        qTests.add(new Test<IntContainer>("addFirst") {
            int test(IntContainer list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });

    }

    public static void main(String[] args) {
        Tester.defaultParams = TestParam.array(reps, 1);
        Tester.run(new ArrayList<>(reps), tests);
        Tester.run(new IntContainer(reps), qTests);
    }
}
