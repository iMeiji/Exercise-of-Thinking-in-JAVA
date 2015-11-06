package javaExercise.part17.ex1;

import java.util.*;

import net.mindview.util.Countries;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */
public class Test17_1 {

    public static void main(String[] args) {
        handleCountries((ArrayList) Countries.names());
        print("--------------------");
        LinkedList linkedList = new LinkedList(Countries.names());
        handleCountries(linkedList);

    }

    private static void handleCountries(List countries) {
        Collections.sort(countries);
        print("sort " + countries);
        Collections.shuffle(countries);
        print("shuffle 1 " + countries);
        Collections.shuffle(countries);
        print("shuffle 2 " + countries);
        Collections.shuffle(countries);
        print("shuffle 3 " + countries);
    }

}
