package javaExercise.part18.ex1to9.ex9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/11/13.
 */
public class Test18_9 {

    public static void main(String[] args) {
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
                list2.add(str.toUpperCase());
            }
            System.out.print(list2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
