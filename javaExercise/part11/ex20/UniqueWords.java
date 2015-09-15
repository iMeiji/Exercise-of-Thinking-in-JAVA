package part11.ex20;//: holding/UniqueWords.java

import net.mindview.util.TextFile;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import static Utils.Print.print;

public class UniqueWords {

    public static void main(String[] args) {
        HashSet<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "a", "e", "i", "o", "u");

        HashMap<String, Integer> vowelMap = new HashMap<>();

        for(String word: new TreeSet<>(new TextFile("SetOperations.java", "\\W+"))) {
            for(char letter : word.toCharArray()) {
                String letterStr = String.valueOf(letter);
                if (vowels.contains(letterStr)) {
                    int number = vowelMap.containsKey(letterStr) ? vowelMap.get(letterStr) : 0;
                    vowelMap.put(letterStr, ++number);
                }
            }
        }

        print(vowelMap.toString());

    }
}
