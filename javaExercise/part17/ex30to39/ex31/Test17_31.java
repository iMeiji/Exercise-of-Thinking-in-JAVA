package javaExercise.part17.ex30to39.ex31;

import net.mindview.util.CollectionData;
import net.mindview.util.CountingGenerator;

import java.util.*;

/**
 * Created by yeming on 2015/11/10.
 */
public class Test17_31 {

    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<String>>> tests = new ArrayList<>();
    static List<Test<StringContainer>> qTests = new ArrayList<>();

    static {
        tests.add(new Test<List<String>>("add") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++)
                        list.add(String.valueOf(j));
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
        qTests.add(new Test<StringContainer>("add") {
            int test(StringContainer list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.add("47");
                }
                return loops * size;
            }
        });
        qTests.add(new Test<StringContainer>("get") {
            int test(StringContainer list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });

    }


    static class ListTester extends Tester<List<String>> {
        public ListTester(List<String> container, List<Test<List<String>>> tests) {
            super(container, tests);
        }

        // Fill to the appropriate size before each test:
        @Override
        protected List<String> initialize(int size) {
            container.clear();
            container.addAll(CollectionData.list(new CountingGenerator.String(), size));
            return container;
        }

        // Convenience method:
        public static void run(List<String> list, List<Test<List<String>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }

    public static void main(String[] args) {
        Tester.defaultParams = TestParam.array(reps, 1);
        Tester.run(new ArrayList<>(reps), tests);
        Tester.run(new StringContainer(reps), qTests);
    }
}
