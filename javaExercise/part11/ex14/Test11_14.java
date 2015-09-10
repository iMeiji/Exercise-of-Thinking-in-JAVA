package part11.ex14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by yeming on 2015/9/9.
 */
public class Test11_14 {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        ListIterator<Integer> it = integers.listIterator();
        //插入10个数，每个数都差插入中间
        for (int i = 0; i < 10; i++) {
            it.add(i);
            if (i % 2 == 0) it.previous();
        }
        integers.forEach(Utils.Print::print);
    }
}
