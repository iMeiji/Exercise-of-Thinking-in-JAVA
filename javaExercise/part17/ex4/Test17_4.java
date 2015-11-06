package javaExercise.part17.ex4;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */
public class Test17_4 {

    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(new TextFile("SetOperations.java", "\\W+"));
        print(words);
    }

}
