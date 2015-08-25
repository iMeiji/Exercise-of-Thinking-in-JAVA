package ex12;

/**
 * Created by yeming on 2015/8/25.
 */
public class Root {

    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Root() {
        System.out.println("Root");
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
    }

    void dispose() {
        System.out.println("Root dispose");
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }
}
