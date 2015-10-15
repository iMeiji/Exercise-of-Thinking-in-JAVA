package javaExercise.part14.ex23;//: typeinfo/SimpleDynamicProxy.java


import java.lang.reflect.*;

import static net.mindview.util.Print.print;

class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Œﬁ«Ó—≠ª∑£¨java.lang.StackOverflowError
        print("proxy " + proxy);

        return method.invoke(proxied, args);
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
    }
}
