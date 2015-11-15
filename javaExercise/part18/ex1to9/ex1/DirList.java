package javaExercise.part18.ex1to9.ex1;//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.*;

public class DirList {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test");
        String[] list;
        list = path.list(new DirFilter(args));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            print(dirItem);
    }
}

class DirFilter implements FilenameFilter {
    private String[] args;

    public DirFilter(String[] args) {
        this.args = args;
    }

    public boolean accept(File dir, String name) {
        Set<String> words = new HashSet<>(new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));
        for (String arg : args) {
            if (words.contains(arg)) {
                return true;
            }
        }
        return false;
    }
}
