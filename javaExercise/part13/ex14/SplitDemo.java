package part13.ex14;//: strings/SplitDemo.java

import java.util.regex.*;
import java.util.*;

import static net.mindview.util.Print.*;
import static net.mindview.util.Print.print;

public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        print(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
        print(Arrays.toString(input.split("!!")));
        print(Arrays.toString(input.split("!!", 3)));
    }
} /* Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
