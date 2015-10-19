package javaExercise.part15.ex23;//: generics/FactoryConstraint.java

interface FactoryI<T> {
//    T create();

    T create(int arg);
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory, int arg) {
        x = factory.create(arg);
    }
    // ...
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create(int arg) {
        return new Integer(arg);
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {

        @Override
        public Widget create(int arg) {
            return null;
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<>(new IntegerFactory(), 10);
        new Foo2<>(new Widget.Factory(), 10);
    }
} ///:~
