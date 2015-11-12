package javaExercise.part17.ex10to19.ex11;

import java.util.PriorityQueue;
import java.util.Random;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/11/4.
 */

class Number implements Comparable<Number> {
    int id;

    public Number() {
        Random random = new Random();
        id = random.nextInt();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id " + id;
    }

    @Override
    public int compareTo(Number number) {
        if(id == number.getId()) {
            return 0;
        } else {
            return id > number.getId() ? 1 : -1;
        }
    }

}

class NumberList extends PriorityQueue<Number> {


}

public class Test17_11 {

    public static void main(String[] args) {
        NumberList numbers = new NumberList();
        numbers.add(new Number());
        numbers.add(new Number());
        numbers.add(new Number());
        print(numbers);
    }
}
