package part13.ex15;//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}

import java.util.regex.*;

import net.mindview.util.*;

public class JGrep {

    static void matchArgs(int patternFlag, String pattern, String filePath) {
        int index = 0;
        Pattern p = Pattern.compile(pattern, patternFlag);
        Matcher m = p.matcher("");
        for (String line : new TextFile(filePath)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        int patternFlag = Integer.valueOf(args[0]);
        switch (patternFlag) {
            case Pattern.CASE_INSENSITIVE:
                matchArgs(patternFlag, args[1], args[2]);
                break;
            case Pattern.MULTILINE:
                matchArgs(patternFlag, args[1], args[2]);
                break;
        }

    }
}
