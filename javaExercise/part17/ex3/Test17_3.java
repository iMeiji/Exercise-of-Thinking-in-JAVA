package javaExercise.part17.ex3;

import net.mindview.util.Countries;
import net.mindview.util.Sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */
public class Test17_3 {

    public static void main(String[] args) {
        HashSet<String> countries1 = new HashSet<>(Countries.names());
        countries1.addAll(new HashSet<>(Countries.names()));
        countries1.addAll(new HashSet<>(Countries.names()));

        print("countries1 " + countries1);

        LinkedHashSet<String> countries2 = new LinkedHashSet<>(Countries.names());
        countries2.addAll(new HashSet<>(Countries.names()));
        countries2.addAll(new HashSet<>(Countries.names()));

        print("countries2 " + countries2);

        TreeSet<String> countries3 = new TreeSet<>(Countries.names());
        countries3.addAll(new HashSet<>(Countries.names()));
        countries3.addAll(new HashSet<>(Countries.names()));

        print("countries3 " + countries3);
    }

}
