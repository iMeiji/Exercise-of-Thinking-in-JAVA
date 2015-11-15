package javaExercise.part18.ex1to9.ex2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/11/12.
 */
public class SortedDirList {

    private File path;

    public SortedDirList(File path) {
        this.path = path;
    }

    public String[] list() {
        String[] list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public String[] list(String regex) {
        String[] list = path.list(new FilenameFilter() {

            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test";
        SortedDirList sortedDirList = new SortedDirList(new File(filePath));
        print(Arrays.asList(sortedDirList.list()));
        print(Arrays.asList(sortedDirList.list("test1.txt")));
    }
}
