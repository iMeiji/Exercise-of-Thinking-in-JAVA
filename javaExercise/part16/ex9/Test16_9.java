package javaExercise.part16.ex9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeming on 2015/10/22.
 */

class Peel<T> {

    T t;

    public Peel(T t) {
        this.t = t;
    }

}

class Banana {

}

public class Test16_9 {

    public static void main(String[] args) {
        //error
//        Peel<Banana>[] peels = new Peel<Banana>[10];
        List<Peel<Banana>> peels = new ArrayList<>();
    }
}
