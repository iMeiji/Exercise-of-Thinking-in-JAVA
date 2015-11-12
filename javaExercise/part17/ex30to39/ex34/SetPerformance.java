package javaExercise.part17.ex30to39.ex34;//: containers/SetPerformance.java
// Demonstrates performance differences in Sets.
// {Args: 100 5000} Small to keep build testing short

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

import java.util.*;

public class SetPerformance {
    static List<Test<Set<String>>> tests = new ArrayList<>();

    static {
        tests.add(new Test<Set<String>>("add") {
            int test(Set<String> set, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                Generator<String> gen;
                for (int i = 0; i < loops; i++) {
                    set.clear();
                    for (int j = 0; j < size; j++) {
                        gen = new CountingGenerator.String();
                        set.add(gen.next());
                    }
                }
                return loops * size;
            }
        });
        tests.add(new Test<Set<String>>("contains") {
            int test(Set<String> set, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                Generator<String> gen;
                for (int i = 0; i < loops; i++)
                    for (int j = 0; j < span; j++) {
                        gen = new CountingGenerator.String();
                        set.contains(gen.next());
                    }
                return loops * span;
            }
        });
        tests.add(new Test<Set<String>>("iterate") {
            int test(Set<String> set, TestParam tp) {
                int loops = tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator<String> it = set.iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops * set.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<>(), tests);
        Tester.run(new HashSet<>(), tests);
        Tester.run(new LinkedHashSet<>(), tests);
    }
}
