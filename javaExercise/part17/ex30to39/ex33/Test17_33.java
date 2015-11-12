package javaExercise.part17.ex30to39.ex33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by yeming on 2015/11/10.
 */
public class Test17_33 {

    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<String>>> tests = new ArrayList<>();
    static List<Test<FastTraversalLinkedList>> qTests = new FastTraversalLinkedList<>();

    static {
        tests.add(new Test<List<String>>("add") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++) {
                        list.add(String.valueOf(j));
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
    }

    public static void main(String[] args) {
        Tester.defaultParams = TestParam.array(reps, 1);
        Tester.run(new ArrayList<>(), tests);
        Tester.run(new LinkedList<>(), tests);
        Tester.run(new FastTraversalLinkedList<>(), tests);
    }
}
