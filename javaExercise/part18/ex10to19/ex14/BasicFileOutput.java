package javaExercise.part18.ex10to19.ex14;//: io/BasicFileOutput.java

import java.io.*;

import static net.mindview.util.Print.print;

public class BasicFileOutput {
    static String inFile = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test3.txt";
    static String outFile1 = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test10.txt";
    static String outFile2 = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test11.txt";


    public static void main(String[] args)
            throws IOException {
        LineNumberReader in = new LineNumberReader(new FileReader(inFile));
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            outWithoutBuffer(in);
        }
        print(System.currentTimeMillis() - time1);

        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            outWithBuffer(in);
        }
        print(System.currentTimeMillis() - time2);
    }

    /**
     * 无缓冲写入
     *
     * @param in
     * @throws IOException
     */
    public static void outWithoutBuffer(LineNumberReader in) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(outFile1));
//                new BufferedWriter(new FileWriter(outFile)));
        String s;
        while ((s = in.readLine()) != null)
            out.println(in.getLineNumber() + ": " + s);
        out.close();
    }

    /**
     * 缓冲写入
     *
     * @param in
     * @throws IOException
     */
    public static void outWithBuffer(LineNumberReader in) throws IOException {
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(outFile2)));
        String s;
        while ((s = in.readLine()) != null)
            out.println(in.getLineNumber() + ": " + s);
        out.close();
    }

}
