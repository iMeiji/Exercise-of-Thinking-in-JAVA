package javaExercise.part17.ex2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.mindview.util.Countries;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */
public class Test17_2 {

    public static void main(String[] agrs) {

        Map<String, String> aMap = new HashMap<>();
        Set<String> aSet = new HashSet<>();

        for(String country: Countries.capitals().keySet()) {
            if(country.startsWith("A")) {
                aMap.put(country, Countries.capitals().get(country));
                aSet.add(country);
            }
        }

        print("aMap¡¡" + aMap);
        print("aSet¡¡" + aSet);
    }
}
