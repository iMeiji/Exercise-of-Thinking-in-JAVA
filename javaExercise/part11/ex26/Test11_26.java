package part11.ex26;

import net.mindview.util.TextFile;

import java.util.*;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/15.
 */

public class Test11_26 {

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
        Map<Integer, String> wordsMap = new TreeMap<>();
        for(Map.Entry<String,ArrayList<Integer>> entry: wordMap.entrySet()) {
            for(Integer index: entry.getValue()) {
                wordsMap.put(index, entry.getKey());
            }
        }

        for(String str: wordsMap.values()) {
            print(str);
        }

    }

}
