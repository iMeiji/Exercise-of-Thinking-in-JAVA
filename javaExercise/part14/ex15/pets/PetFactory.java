package javaExercise.part14.ex15.pets;

/**
 * Created by yeming on 2015/10/14.
 */
public interface PetFactory<T extends Pet> {
    T create();
}
