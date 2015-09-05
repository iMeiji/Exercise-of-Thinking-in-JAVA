package part10.ex6.part3;

import part10.ex6.part2.Outer;
import part10.ex6.part1.Name;

/**
 * Created by yeming on 2015/9/6.
 */
public class ExtendOuter extends Outer {

    public Name getName() {
        return new Inner();
    }
}
