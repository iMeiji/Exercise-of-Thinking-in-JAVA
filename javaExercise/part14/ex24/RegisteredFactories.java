package javaExercise.part14.ex24;//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.

import javaExercise.part14.ex14.factory.Factory;
import net.mindview.util.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

import static net.mindview.util.Print.*;

interface IPart {

}

class NullPartProxyHandle implements InvocationHandler {

    private String nullName;

    private IPart proxied = new NPart();

    NullPartProxyHandle(Class<? extends IPart> type) {
        nullName = type.getSimpleName() + " NullPart";
    }

    private class NPart implements IPart, Null {

        @Override
        public String toString() {
            return nullName;
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxy, args);
    }
}

class Part implements IPart {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<IPart>> partFactories = new ArrayList<>();

    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static IPart createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements javaExercise.part14.ex14.factory.Factory<IPart> {
        public IPart create() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFactories {

    public static IPart newNullPart(Class<? extends IPart> type) {
        return (IPart) Proxy.newProxyInstance(IPart.class.getClassLoader(), new Class<?>[] {Null.class, IPart.class}
                , new NullPartProxyHandle(type));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            IPart part = Part.createRandom();
            System.out.println(part);
            System.out.println(newNullPart(part.getClass()));
        }
    }
}
