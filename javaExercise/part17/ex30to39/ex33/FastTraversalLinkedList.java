package javaExercise.part17.ex30to39.ex33;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by yeming on 2015/11/10.
 */
public class FastTraversalLinkedList<T> extends AbstractList<T> {

    private class FlaggedArrayList {
        public ArrayList<T> arrayList = new ArrayList<>();

        private FlaggedLinkedList companion;
        public boolean change = false;

        public void addCompanion(FlaggedLinkedList companion) {
            this.companion = companion;

        }

        public void sync() {
            if(companion.change = true) {
                arrayList = new ArrayList<>(companion.linkedList);
            }
            companion.change = false;
        }

        public T get(int index) {
            sync();
            return arrayList.get(index);
        }

        public Iterator<T> iterator() {
            sync();
            return arrayList.iterator();
        }

        public int size() {
            sync();
            return arrayList.size();
        }
    }

    private class FlaggedLinkedList {
        public LinkedList<T> linkedList = new LinkedList<>();

        private FlaggedArrayList companion;
        public boolean change = false;

        public void addCompanion(FlaggedArrayList companion) {
            this.companion = companion;

        }

        public void sync() {
            if(companion.change = true) {
                linkedList = new LinkedList<>(companion.arrayList);
            }
            companion.change = false;
        }

        public boolean add(T t) {
            sync();
            companion.change = true;
            return linkedList.add(t);
        }

        public void add(int index, T t) {
            sync();
            companion.change = true;
            linkedList.add(index, t);
        }

        public boolean remove(Object t) {
            sync();
            companion.change = true;
            return linkedList.remove(t);
        }

        public T remove(int index) {
            sync();
            companion.change = true;
            return linkedList.remove(index);
        }

    }

    FlaggedArrayList flaggedArrayList = new FlaggedArrayList();
    FlaggedLinkedList flaggedLinkedList = new FlaggedLinkedList();

    {
        flaggedArrayList.addCompanion(flaggedLinkedList);
        flaggedLinkedList.addCompanion(flaggedArrayList);
    }

    @Override
    public T get(int index) {
        return flaggedArrayList.get(index);
    }

    @Override
    public int size() {
        return flaggedArrayList.size();
    }

    @Override
    public boolean add(T t) {
        return flaggedLinkedList.add(t);
    }

    @Override
    public void add(int index, T t) {
        flaggedLinkedList.add(index, t);
    }

    @Override
    public boolean remove(Object t) {
        return flaggedLinkedList.remove(t);
    }

    @Override
    public T remove(int index) {
        return flaggedLinkedList.remove(index);
    }

    @Override
    public Iterator<T> iterator() {
        return flaggedArrayList.iterator();
    }
}
