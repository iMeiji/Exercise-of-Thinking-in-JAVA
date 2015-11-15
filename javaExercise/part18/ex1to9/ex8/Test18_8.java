package javaExercise.part18.ex1to9.ex8;

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
public class Test18_8 {

    public static void main(String[] args) {
        if(args.length < 1) {
            return;
        }
        String filePath = args[0];
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            LinkedList<String> list = new LinkedList<>();
            StringBuffer sb = new StringBuffer();
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
            in.close();
            Collections.reverse(list);
            print(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
