package javaExercise.part17.ex15;

import net.mindview.util.TextFile;

import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/5.
 */
public class Test17_15 {

    public static void main(String[] args) {
        List<String> words = new TextFile("C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part17\\ex13\\AssociativeArray.java", "\\W+");
        SlowMap<String, Integer> map = new SlowMap<>();
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
