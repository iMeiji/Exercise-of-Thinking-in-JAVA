//: typeinfo/pets/ForNameCreator.java
package javaExercise.part14.ex11.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "javaExercise.part14.ex11.pets.Mutt",
            "javaExercise.part14.ex11.pets.Pug",
            "javaExercise.part14.ex11.pets.EgyptianMau",
            "javaExercise.part14.ex11.pets.Manx",
            "javaExercise.part14.ex11.pets.Cymric",
            "javaExercise.part14.ex11.pets.Rat",
            "javaExercise.part14.ex11.pets.Mouse",
            "javaExercise.part14.ex11.pets.Hamster",
            "javaExercise.part14.ex11.pets.Gerbil"  //–¬‘ˆGerbil¿‡
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~
