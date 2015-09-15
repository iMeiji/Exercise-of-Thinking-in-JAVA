package part11.ex25;

import net.mindview.util.TextFile;

import java.util.*;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/15.
 */

public class Test11_25 {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> wordMap = new HashMap<>();
        List<String> words = new ArrayList<>(new TextFile("C:\\Users\\yeming\\Documents\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part11\\ex22\\1.txt", "\\W+"));
        for (int i=0;i<words.size();i++) {
            String word = words.get(i);
            if(wordMap.containsKey(word)) {
                wordMap.get(word).add(i);
            } else {
                ArrayList<Integer> indexs =  new ArrayList<>();
                indexs.add(i);
                wordMap.put(word, indexs);
            }
        }
        for(String word: wordMap.keySet()) {
            print(word);
            for(Integer index: wordMap.get(word)) {
                print(index);
            }
        }

    }

}
