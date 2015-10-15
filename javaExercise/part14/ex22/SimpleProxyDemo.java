package javaExercise.part14.ex22;//: typeinfo/SimpleProxyDemo.java

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.*;

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }

    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {

    private static Map<String, Integer> mapsCount = new HashMap<>();

    static {
        mapsCount.put("doSomething", 0);
        mapsCount.put("somethingElse", 0);
    }

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        print("SimpleProxy doSomething");
        proxied.doSomething();
        mapsCount.put("doSomething", mapsCount.get("doSomething") + 1);
    }

    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
        mapsCount.put("somethingElse", mapsCount.get("somethingElse") + 1);
    }

    public static void printCount() {
        print(mapsCount);
    }
}

class SimpleProxyDemo {


    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            consumer(new RealObject());
            consumer(new SimpleProxy(new RealObject()));
        }
        SimpleProxy.printCount();
    }
}
