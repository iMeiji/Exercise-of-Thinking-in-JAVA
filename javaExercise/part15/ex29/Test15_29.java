package javaExercise.part15.ex29;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeming on 2015/10/20.
 */
public class Test15_29 {

    static void f1(Holder<List<?>> holder) {
        List<?> list = holder.get();
        Object object = list.get(0);
//        list.add(new Object());
        list.add(null);
        holder.set(new ArrayList<Integer>());
    }

    static void f2(List<Holder<?>> list) {
        Holder<?> holder = list.get(0);
        Object object = holder.get();
//        holder.set(new Object());
        holder.set(null);
        list.add(new Holder<>());
        list.add(new Holder<Integer>());
    }

}
