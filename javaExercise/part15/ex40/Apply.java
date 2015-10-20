package javaExercise.part15.ex40;//: generics/Apply.java
// {main: ApplyTest}

import javaExercise.part15.ex40.pets.Cat;
import javaExercise.part15.ex40.pets.Pet;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

import static net.mindview.util.Print.*;

public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq)
                f.invoke(t, args);
        } catch (Exception e) {
            // Failures are programmer errors
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest {
    public static void main(String[] args) throws Exception {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        Apply.apply(cats, Cat.class.getMethod("speak"));
    }
} /* (Execute to see output) *///:~
