package javaExercise.part17.ex20to29.ex20;

import net.mindview.util.TextFile;

import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/6.
 */
public class Test17_20 {

    public static void main(String[] args) {
        List<String> words = new TextFile("C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part17\\ex13\\AssociativeArray.java", "\\W+");
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
        for(String word: words) {
            Integer number = map.get(word);
            if(number == null) {
                map.put(word, 1);
            } else {
                map.put(word, ++number);
            }
        }
        print(map);
    }
}
