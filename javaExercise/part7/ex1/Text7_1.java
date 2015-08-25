package ex1;


/**
 * Created by yeming on 2015/8/25.
 */
public class Text7_1 {

    public static void main(String[] args) {
        TestClass1 test = new TestClass1();
        //Delayed init ∂Ë–‘≥ı ºªØ
        if(test.getI() == null) {
            test.setI("1");
        }
    }
}
