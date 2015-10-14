package javaExercise.part14.ex15.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/14.
 */
public class NewPetCreator {

    static List<PetFactory> petFactories = new ArrayList<>();

    static {
        petFactories.add(new Cat.MyFactory());
        petFactories.add(new Dog.MyFactory());
    }

    private static Random random = new Random(50);

    public static Pet createRandom() {
        int n = random.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }

    public static void main(String[] args) {
        for(int i=0;i<10; i++) {
            print(NewPetCreator.createRandom());
        }
    }
}
