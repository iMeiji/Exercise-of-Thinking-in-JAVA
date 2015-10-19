package javaExercise.part15.ex26;

/**
 * Created by yeming on 2015/10/19.
 */
public class Test15_26 {

    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0] = Integer.valueOf(2);
        try {
            //´íÎó
            numbers[1] = Float.valueOf(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
