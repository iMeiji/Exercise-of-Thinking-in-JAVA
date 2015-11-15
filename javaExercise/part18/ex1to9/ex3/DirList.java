package javaExercise.part18.ex1to9.ex3;//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}


import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class DirList {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test");
        String[] list;
        list = path.list(new DirFilter("test1.txt"));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        print(calFilesSize(list));
    }

    public static long calFilesSize(String[] files) {
        long fileLength = 0;
        for(String file: files) {
            print(file);
            fileLength = new File("C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test", file).length();
        }
        return fileLength;
    }
}

class DirFilter implements FilenameFilter {

    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
