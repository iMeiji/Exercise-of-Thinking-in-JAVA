package part11.ex22;

import net.mindview.util.TextFile;

import java.util.*;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/15.
 */
class Word {
    public String name;
    public int count = 1;

    public Word(String name) {
        this.name = name;
    }

    public void addCounts() {
        count++;
    }

}


public class Test11_22 {

    static Comparator<Word> CASE_INSENSITIVE_ORDER = new Comparator<Word>() {
        public int compare(Word o1, Word o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    };

    public static void main(String[] args) {

        Set<Word> words = new HashSet<>();
        for (String wd : new ArrayList<>(new TextFile("C:\\Users\\yeming\\Documents\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part11\\ex22\\1.txt", "\\W+"))) {
            addWord(words, wd);
        }
        List<Word> wordList = new ArrayList<>(words);
        Collections.sort(wordList, CASE_INSENSITIVE_ORDER);
        for (Word word : wordList) {
            print(word.name + " " + word.count);
        }
    }

    private static void addWord(Set<Word> words, String wd) {
        for (Word word1 : words) {
            if (wd.equals(word1.name)) {
                word1.addCounts();
                return;
            }
        }
        words.add(new Word(wd));
    }

}
