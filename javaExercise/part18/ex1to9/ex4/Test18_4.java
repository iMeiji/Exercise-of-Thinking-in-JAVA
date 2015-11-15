package javaExercise.part18.ex1to9.ex4;

import net.mindview.util.Directory;

import java.io.File;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/11/12.
 */
public class Test18_4 {

    public static void main(String[] args) {
        String file = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test";
        long fileSize = 0;
        for(File path: Directory.walk(file, "test1.txt").files) {
               fileSize += path.length();
        }
        print(fileSize);

    }
}
