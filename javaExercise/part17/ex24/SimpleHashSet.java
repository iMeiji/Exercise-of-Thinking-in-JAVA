package javaExercise.part17.ex24;

import java.util.*;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/11/6.
 */
public class SimpleHashSet<E> extends AbstractSet<E> {

    static final int SIZE = 997;

    private LinkedList<E>[] buckets = new LinkedList[SIZE];

    @Override
    public boolean add(E key) {
        boolean found = false;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<E> bucket = buckets[index];
        ListIterator<E> it = bucket.listIterator();
        while (it.hasNext()) {
            if (key.equals(it.next())) {
                it.add(key);
                found = true;
                break;
            }
        }
        if (!found) {
            bucket.add(key);
        }
        return false;
    }

    @Override
    public int size() {
        int size = 0;
        for (LinkedList<E> bucket : buckets) {
            if (bucket != null) {
                size += bucket.size();
            }
        }
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int count;
            private boolean canRemove;
            private int index1; //index of buckets
            private int index2; //index of bucket

            @Override
            public boolean hasNext() {
                return count < size();
            }

            @Override
            public E next() {
                if(hasNext()) {
                    canRemove = true;
                    count++;
                    for(;index1 < buckets.length;index1++) {
                        if(buckets[index1] == null) {
                            continue;
                        }
                        if(index2 < buckets[index1].size()) {
                            return buckets[index1].get(index2++);
                        } else {
                            index2 = 0;
                            continue;
                        }
                    }
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                if (canRemove) {
                    canRemove = false;
                    buckets[index1].remove(--index2);
                    if (buckets[index1].isEmpty()) {
                        buckets[index1++] = null;
                    }
                    count--;
                } else {
                    throw new IllegalStateException();
                }
            }

        };

    }

    public static void main(String[] args) {
        SimpleHashSet<String> simpleHashSet = new SimpleHashSet<>();
        simpleHashSet.add("str1");
        simpleHashSet.add("str2");
        print(simpleHashSet);
        print(simpleHashSet.size());
        simpleHashSet.remove("str1");
        print(simpleHashSet.size());

        Iterator<String> iterator = simpleHashSet.iterator();
        while (iterator.hasNext()) {
            print(iterator.next());
        }
    }
}
