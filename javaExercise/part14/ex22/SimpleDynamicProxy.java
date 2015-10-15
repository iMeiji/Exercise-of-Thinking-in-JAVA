package javaExercise.part14.ex22;//: typeinfo/SimpleDynamicProxy.java

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

class DynamicProxyHandler implements InvocationHandler {

    private static Map<String, Integer> mapsCount = new HashMap<>();

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if (args != null)
            for (Object arg : args)
                System.out.println("  " + arg);

        if(mapsCount.containsKey(method.getName())) {
            mapsCount.put(method.getName(), mapsCount.get(method.getName()) + 1);
        } else {
            mapsCount.put(method.getName(), 1);
        }
        return method.invoke(proxied, args);
    }

    public static void printCount() {
        print(mapsCount);
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
        DynamicProxyHandler.printCount();
    }
}
