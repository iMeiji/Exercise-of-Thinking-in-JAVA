package part10.ex23;

import java.util.ArrayList;
import java.util.List;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/7.
 */
public interface U {

    void f1();

    void f2();

    void f3();

    class A {
        public U getU() {
            return new U() {
                @Override
                public void f1() {
                    print("f1");
                }

                @Override
                public void f2() {
                    print("f2");
                }

                @Override
                public void f3() {
                    print("f3");
                }
            };
        }
    }

    class B {
        private List<U> us = new ArrayList<>();

        public void saveU(U u) {
            print("B saveU");
            us.add(u);
        }

        public void setUsNull() {
            print("B setUsNull");
            for(U u: us) {
                u = null;
            }
        }

        public void loopUs() {
            print("B loopUs");
            for(U u: us) {
                u.f1();
                u.f2();
                u.f3();
            }
        }
    }
}
