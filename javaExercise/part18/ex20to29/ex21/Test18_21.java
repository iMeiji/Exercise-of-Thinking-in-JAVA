package javaExercise.part18.ex20to29.ex21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yeming on 2015/11/16.
 */
public class Test18_21 {

    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = stdin.readLine()) != null && s.length() != 0) {
            System.out.print(s.toUpperCase());
        }
    }

}
