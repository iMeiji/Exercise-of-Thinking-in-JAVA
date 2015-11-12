package javaExercise.part17.ex10to19.ex13;//: containers/AssociativeArray.java
// Associates keys with values.

import net.mindview.util.TextFile;

import java.util.List;

import static net.mindview.util.Print.*;

public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V value) {
        if (index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[]{key, value};
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (int i = 0; i < index; i++)
            if (key.equals(pairs[i][0]))
                return (V) pairs[i][1];
        return null; // Did not find key
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if (i < index - 1)
                result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        List<String> words = new TextFile("C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part17\\ex13\\AssociativeArray.java", "\\W+");
        AssociativeArray<String, Integer> map = new AssociativeArray<>(words.size());
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
