package javaExercise.part17.ex30to39.ex39;

import net.mindview.util.Countries;

/**
 * Created by yeming on 2015/11/12.
 */
public class Test17_39 {

    public static void main(String[] args) {
        SimpleHashMap<String, String> stringMap = new SimpleHashMap<>();
        stringMap.putAll(Countries.capitals(50));
    }
}
