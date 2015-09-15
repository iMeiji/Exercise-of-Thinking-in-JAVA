package part11.ex28;

import java.util.PriorityQueue;
import java.util.Random;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/16.
 */
public class Test11_28 {

    public static void main(String[] args) {
        Random random = new Random(20);
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            doubles.add(random.nextDouble());
        }
        for (int i = 0; i < 10; i++) {
            print(doubles.poll());
        }
    }

}
