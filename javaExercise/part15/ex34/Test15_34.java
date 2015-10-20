package javaExercise.part15.ex34;

/**
 * Created by yeming on 2015/10/20.
 */
abstract class Base <T extends Base<T>> {

    abstract T f1(T arg);

    T f2(T arg) {
        return f1(arg);
    }
}

class ExtendClass extends Base<ExtendClass> {

    @Override
    ExtendClass f1(ExtendClass arg) {
        return arg;
    }
}


public class Test15_34 {

    public static void main(String[] agrs) {
        ExtendClass extendClass = new ExtendClass();
        extendClass.f1(extendClass);
    }
}
