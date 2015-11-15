package javaExercise.part18.ex10to19.ex13;//: io/BasicFileOutput.java

import java.io.*;

public class BasicFileOutput {
    static String inFile = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test3.txt";
    static String outFile = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test10.txt";

    public static void main(String[] args)
            throws IOException {
        LineNumberReader in = new LineNumberReader(new FileReader(inFile));

        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(outFile)));
        String s;
        while ((s = in.readLine()) != null)
            out.println(in.getLineNumber() + ": " + s);
        out.close();
    }
}
