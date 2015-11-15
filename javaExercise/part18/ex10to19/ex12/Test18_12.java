package javaExercise.part18.ex10to19.ex12;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/13.
 */
public class Test18_12 {

    public static void main(String[] args) {
        String inFile = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test1.txt";
        String outFile = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test10.txt";

        try {
            BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(inFile)));
            LinkedList<String> list = new LinkedList<>();

            StringBuffer sb = new StringBuffer();
            String s;

            PrintWriter out = new PrintWriter(outFile);
            int lineNumber = 0;
            while((s = in.readLine()) != null) {
                out.println(lineNumber + " " + s);
                lineNumber++;
            }
            out.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
