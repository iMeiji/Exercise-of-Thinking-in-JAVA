package ex2;

import ex1.Bicycle;
import ex1.Cycle;
import ex1.Tricycle;
import ex1.Unicycle;

/**
 * Created by yeming on 2015/9/1.
 */
public class Test8_4 {

    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
