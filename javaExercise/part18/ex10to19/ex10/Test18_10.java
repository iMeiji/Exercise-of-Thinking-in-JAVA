package javaExercise.part18.ex10to19.ex10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/13.
 */
public class Test18_10 {

    public static void main(String[] args) {
        if(args.length < 1) {
            return;
        }
        String filePath = "C:\\Users\\yeming\\workspace\\GitHub\\Exercise-of-Thinking-in-JAVA\\javaExercise\\part18\\Test\\test1.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            LinkedList<String> list = new LinkedList<>();
            LinkedList<String> list2 = new LinkedList<>();
            StringBuffer sb = new StringBuffer();
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
            in.close();
            Collections.reverse(list);
            for(String str: list) {
                for (String regex : args) {
                    if(Pattern.compile(regex).matcher(str).matches()) {
                        list2.add(str);
                    }
                }
            }
            print(list2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
