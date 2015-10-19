package javaExercise.part15.ex27;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeming on 2015/10/19.
 */
public class Test15_27 {

    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<Integer>();
        //±àÒë´íÎó
//        numbers.add(Integer.valueOf(1));
        numbers.add(null);
        numbers.get(0);
    }
}
