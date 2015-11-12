package javaExercise.part17.ex30to39.ex30;//: containers/ListPerformance.java
// Demonstrates performance differences in Lists.
// {Args: 100 500} Small to keep build testing short

import net.mindview.util.CollectionData;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.*;

public class ListPerformance {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<String>>> tests = new ArrayList<>();
    static List<Test<LinkedList<String>>> qTests = new ArrayList<>();

    static {
        tests.add(new Test<List<String>>("add") {
            int test(List<String> list, TestParam tp) {
                for (int i = 0; i < tp.loops; i++) {
                    list.clear();
                    list.addAll(CollectionData.list(new RandomGenerator.String(), tp.size));
                    Collections.sort(list);
                }
                return tp.loops;
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
        ListTester.run(new ArrayList<>(), tests);
        ListTester.run(new LinkedList<>(), tests);
    }
}