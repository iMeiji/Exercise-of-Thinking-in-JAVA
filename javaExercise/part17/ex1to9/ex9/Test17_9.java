package javaExercise.part17.ex1to9.ex9;

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.TreeSet;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/11/4.
 */
public class Test17_9 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(CollectionData.list(new RandomGenerator.String(), 10));
        print("treeSet " + treeSet);
    }
}
