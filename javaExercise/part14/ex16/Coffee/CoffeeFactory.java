package javaExercise.part14.ex16.Coffee;

/**
 * Created by yeming on 2015/10/14.
 */
public interface CoffeeFactory<T extends Coffee> {

    T create();
}
