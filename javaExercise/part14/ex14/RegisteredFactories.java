package javaExercise.part14.ex14;//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.

import java.util.*;

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> parts = Arrays.asList(FuelFilter.class, AirFilter.class, CabinAirFilter.class,
            OilFilter.class, FanBelt.class, GeneratorBelt.class, PowerSteeringBelt.class);

    private static Random rand = new Random(47);

    public static Part randomPart() {
        int n = rand.nextInt(parts.size());
        try {
            return parts.get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
}

class AirFilter extends Filter {

}

class CabinAirFilter extends Filter {
}

class OilFilter extends Filter {

}

class Belt extends Part {
}

class FanBelt extends Belt {

}

class GeneratorBelt extends Belt {

}

class PowerSteeringBelt extends Belt {

}

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(Part.randomPart());
    }
}