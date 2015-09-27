package part13.ex16;

import java.io.File;
import java.util.regex.*;

import net.mindview.util.*;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        File file = new File(args[0]);
        if(file.isDirectory()) {
            for(File file1: file.listFiles()) {
                for (String line : new TextFile(file1.getAbsolutePath())) {
                    m.reset(line);
                    while (m.find())
                        System.out.println(index++ + ": " +
                                m.group() + ": " + m.start());
                }
            }
        } else {
            for (String line : new TextFile(args[0])) {
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " +
                            m.group() + ": " + m.start());
            }
        }


    }
}
