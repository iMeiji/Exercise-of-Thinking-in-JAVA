package javaExercise.part15.ex24;//: generics/ClassTypeCapture.java

import javaExercise.part14.ex14.factory.Factory;

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

class BuildFactory implements Factory<Building> {

    @Override
    public Building create() {
        return new Building();
    }
}

class HouseFactory implements Factory<House> {


    @Override
    public House create() {
        return new House();
    }
}

public class ClassTypeCapture {

    Factory<?> factory;

    Map<String, Factory<?>> types = new HashMap<>();

    public ClassTypeCapture(Factory<?> factory) {
        this.factory = factory;
    }

    public void addType(String typename, Factory<?> factory) {
        types.put(typename, factory);
    }

    public Object createNew(String typename) {
        return types.get(typename).create();
    }

    public boolean f(Object arg) {
        return factory.create().getClass().isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture ctt1 = new ClassTypeCapture(new BuildFactory());
        ctt1.addType("House", new HouseFactory());
        House aa = (House) ctt1.createNew("House");
    }
}
