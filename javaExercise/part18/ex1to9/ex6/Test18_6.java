package javaExercise.part18.ex1to9.ex6;

import net.mindview.util.ProcessFiles;

import java.io.File;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/12.
 */
public class Test18_6 {

    public static void main(String[] args) {
        ProcessFiles processFiles = new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                long lastModifiedTime = file.lastModified();
                if(lastModifiedTime > System.currentTimeMillis() - 3600*1000) {
                    print(file.getName());
                }
            }
        }, "txt");
        processFiles.start(new String[] {"C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test"});
    }
}
