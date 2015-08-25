package ex7;

/**
 * Created by yeming on 2015/8/25.
 */
public class ClassC extends ClassA {

    private ClassB classB;

    {
        classB = new ClassB("classB");
    }

    public ClassC(String str) {
        super(str);
        System.out.println("ClassC " + str);
    }
}
