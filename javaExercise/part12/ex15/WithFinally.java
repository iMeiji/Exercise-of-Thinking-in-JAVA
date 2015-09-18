package part12.ex15;//: exceptions/WithFinally.java
// Finally Guarantees cleanup.

import part12.ex14.OnOffException1;
import part12.ex14.OnOffException2;
import part12.ex14.OnOffSwitch;
import part12.ex14.Switch;

public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off(); //finally总是被执行
        }
    }
} /* Output:
on
off
*///:~
