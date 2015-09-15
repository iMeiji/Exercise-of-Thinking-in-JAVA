package part11.ex21;//: holding/UniqueWords.java

import net.mindview.util.TextFile;

import java.util.*;

import static Utils.Print.print;

public class UniqueWords {

    public static void main(String[] args) {
        Map<String, Integer> letters = new HashMap<>();
        for (String word : new TreeSet<>(new TextFile("SetOperations.java", "\\W+"))) {
            for (char letter : word.toCharArray()) {
                String letterStr = String.valueOf(letter);
                letters.put(letterStr, letters.containsKey(letterStr) ? letters.get(letterStr) + 1 : 1);
            }
        }
        List<String> strs = new ArrayList<>(letters.keySet());
        Collections.sort(strs, String.CASE_INSENSITIVE_ORDER);
        for (String str : strs) {
            print(str + " " + letters.get(str));
        }
    }
}
