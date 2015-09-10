package part11.ex16;//: holding/UniqueWords.java

import java.util.*;

import net.mindview.util.*;

import static Utils.Print.*;

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
