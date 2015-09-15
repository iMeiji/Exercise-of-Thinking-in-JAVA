package part11.ex29;

import java.util.PriorityQueue;

/**
 * Created by yeming on 2015/9/16.
 */
class Dog {

}

public class Test11_29 {

    public static void main(String[] args) {
        PriorityQueue<Dog> queue = new PriorityQueue<>();
        queue.add(new Dog());
        //error queue.add(new Dog());
    }

}
