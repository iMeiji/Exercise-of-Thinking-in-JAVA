package part10.ex6.part2;

import part10.ex6.part1.Name;

/**
 * Created by yeming on 2015/9/6.
 */
public class Outer {

    protected class Inner implements Name {

        public Inner() {}

        @Override
        public void getName() {

        }
    }
}
