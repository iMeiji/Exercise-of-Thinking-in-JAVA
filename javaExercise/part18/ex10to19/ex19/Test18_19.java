package javaExercise.part18.ex10to19.ex19;

import net.mindview.util.BinaryFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/16.
 */
public class Test18_19 {

    static String file = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test1.txt";

    public static Map<Byte, Integer> countWordInFile(String fileName) throws IOException {
        Map<Byte, Integer> maps = new HashMap<>();

        byte[] bytes = BinaryFile.read(fileName);
        for (Byte b: bytes){
            maps.put(b, maps.containsKey(b) ? maps.get(b) + 1 : 1);
        }
        return maps;
    }

    public static void main(String[] args) throws IOException {
        print(countWordInFile(file));
    }

}
