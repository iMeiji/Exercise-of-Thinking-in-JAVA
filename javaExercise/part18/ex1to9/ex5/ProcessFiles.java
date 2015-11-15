//: net/mindview/util/ProcessFiles.java
package javaExercise.part18.ex1to9.ex5;

import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class ProcessFiles {
    private Strategy strategy;
    private Pattern regex;
    public ProcessFiles(Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = Pattern.compile(regex);
    }

    // Demonstration of how to use it:
    public static void main(String[] args) {
        new ProcessFiles(new Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, "java").start(args);
    }

    public void start(String[] args) {
        try {
            if (args.length == 0)
                processDirectoryTree(new File("."));
            else
                for (String arg : args) {
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
                        // Allow user to leave off extension:
                        if (!regex.matcher(arg).matches())
                        strategy.process(
                                new File(arg).getCanonicalFile());
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(
                root.getAbsolutePath(), ".*\\." + regex))
            strategy.process(file.getCanonicalFile());
    }

    public interface Strategy {
        void process(File file);
    }
} /* (Execute to see output) *///:~
