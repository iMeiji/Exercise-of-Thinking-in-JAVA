package javaExercise.part14.ex12.coffee;

import net.mindview.util.TypeCounter;

import java.util.Iterator;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/14.
 */
public class Test14_12_Coffee_Count {

    public static void main(String[] args) {
        TypeCounter typeCounter = new TypeCounter(Coffee.class);
        for(Iterator<Coffee> it = new CoffeeGenerator(20).iterator();it.hasNext();) {
            Coffee coffee = it.next();
            printnb(coffee.getClass().getSimpleName() + " ");
            typeCounter.count(coffee);
        }
        print();
        print(typeCounter);

    }

}
