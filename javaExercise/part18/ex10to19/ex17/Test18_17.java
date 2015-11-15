package javaExercise.part18.ex10to19.ex17;

import net.mindview.util.TextFile;

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/16.
 */
public class Test18_17 {

    static String file = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test1.txt";

    public static Map<String, Integer> countWordInFile(String fileName) {
        Map<String, Integer> maps = new HashMap<>();

        String words = TextFile.read(fileName);
        for (String lines : words.split("\\n")) {
            for (String word : lines.split("\\s+")) {
                maps.put(word, maps.containsKey(word) ? maps.get(word) + 1 : 1);
            }
        }
        return maps;
    }

    public static void main(String[] args) {
        print(countWordInFile(file));
    }

}
