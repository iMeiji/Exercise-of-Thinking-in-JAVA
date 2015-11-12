package javaExercise.part17.ex10to19.ex10;

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.*;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/11/4.
 */
class MySortedSet<T> implements SortedSet<T> {

    private List<T> list;

    public MySortedSet() {
        list = new LinkedList<>();
    }

    public MySortedSet(List<T> list) {
        this.list = list;
    }

    @Override
    public Comparator<? super T> comparator() {
        return null;
    }

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        int fromIndex = list.indexOf(fromElement);
        int toIndex = list.indexOf(toElement);
        try {
            return new MySortedSet<>(list.subList(fromIndex, toIndex));
        } catch(IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public SortedSet<T> headSet(T toElement) {
        int toIndex = list.indexOf(toElement);
        try {
            return new MySortedSet<>(list.subList(0, toIndex));
        } catch(IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        int toIndex = list.indexOf(fromElement);
        try {
            return new MySortedSet<>(list.subList(toIndex, list.size()-1));
        } catch(IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public T first() {
        try {
            return list.get(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public T last() {
        try {
            return list.get(list.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(T t) {
        int ip = Collections.binarySearch((List<Comparable<T>>)list, t);
        if(ip < 0) {
            ip = -(ip + 1);
            if(ip == list.size()) {
                list.add(t);
            } else {
                list.add(ip, t);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean res = false;
        for(T t: c) {
            res |= add(t);
        }
        return res;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.remove(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int hashCode() { return list.hashCode(); }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class Test17_10 {

    public static void main(String[] args) {
        MySortedSet<String> sortedSet = new MySortedSet<>(CollectionData.list(new RandomGenerator.String(), 10));
        print(sortedSet);
        sortedSet.add("aaa");
        print(sortedSet);
    }
}
