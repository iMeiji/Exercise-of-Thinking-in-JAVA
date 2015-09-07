package part10.ex20;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/7.
 */

public interface Name {

    String getName();

    class MyName implements Name {

        @Override
        public String getName() {
            return "Tom";
        }

        public static void main(String[] agrs) {
            Name name = new MyName();
            print(name.getName());
        }
    }
}
