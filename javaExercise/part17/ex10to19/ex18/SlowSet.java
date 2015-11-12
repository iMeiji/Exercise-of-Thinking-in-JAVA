package javaExercise.part17.ex10to19.ex18;

import java.util.*;

/**
 * Created by yeming on 2015/11/5.
 */
public class SlowSet<T> extends AbstractSet<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public boolean add(T t) {
        if(!list.contains(t)) {
            list.add(t);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if(list.contains(o)) {
            list.remove(list.indexOf(0));
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }





    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }
}
