package part13.ex13;//: strings/StartEnd.java

import part13.ex12.Groups;

import java.util.regex.*;

import static net.mindview.util.Print.*;

public class StartEnd {
    public static String input = Groups.POEM;

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                print(regex);
                regexPrinted = true;
            }
            print(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() '" + m.group() +
                    "' start = " + m.start() + " end = " + m.end());
        if (m.lookingAt()) // No reset() necessary
            d.display("lookingAt() start = "
                    + m.start() + " end = " + m.end());
        if (m.matches()) // No reset() necessary
            d.display("matches() start = "
                    + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            print("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*",
                    "\\w*ever", "A\\w+", "Never.*?!"})
                examine(in, regex);
        }
    }
}