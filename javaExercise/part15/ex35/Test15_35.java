package javaExercise.part15.ex35;

import javaExercise.part15.coffee.Latte;
import javaExercise.part15.coffee.Mocha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yeming on 2015/10/20.
 */
public class Test15_35 {

    static void oldStyleMethod(List lattes) {
        lattes.add(new Mocha());
    }

    public static void main(String[] args) {
        List<Latte> lattes1 = new ArrayList<>();
        oldStyleMethod(lattes1);

        List<Latte> lattes2 = Collections.checkedList(new ArrayList<>(), Latte.class);

        try {
            oldStyleMethod(lattes2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
