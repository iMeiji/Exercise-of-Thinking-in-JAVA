package javaExercise.part18.ex20to29.ex26;//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        FileChannel fc = new FileInputStream(args[0]).getChannel();
        ByteBuffer byteBuffer = fc.map(FileChannel.MapMode.READ_ONLY, 0 ,fc.size());
        CharBuffer charBuffer = Charset.forName(System.getProperty("file.encoding")).decode(byteBuffer);
        String[] strings = charBuffer.toString().split("\n");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : strings) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
}
