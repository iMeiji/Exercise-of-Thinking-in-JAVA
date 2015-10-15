package javaExercise.part14.ex25;

import java.lang.reflect.Method;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/15.
 */
class A {
    private void f() {
        print("a f()");
    }

    protected void g() {
        print("a g()");
    }

    public void h() {
        print("a h()");
    }
}

public class Test14_25 {

    static void callHiddenMethod(Object obj, String methodName) throws Exception{
        Method method = obj.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);
    }

    public static void main(String[] args) throws Exception {
        A a = new A();
        callHiddenMethod(a, "f");
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "h");
    }
}
