package javaExercise.part15.ex21;//: generics/ClassTypeCapture.java

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
    Class<T> kind;

    Map<String, Class<?>> types = new HashMap<>();

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public void addType(String typename, Class<?> kind) {
        types.put(typename, kind);
    }

    public Object createNew(String typename) {
        Class<?> cl = types.get(typename);
        try {
            return cl.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 =
                new ClassTypeCapture<>(Building.class);
        ctt1.addType("String", String.class);
        String aa = (String) ctt1.createNew("String");
    }
} /* Output:
true
true
false
true
*///:~
