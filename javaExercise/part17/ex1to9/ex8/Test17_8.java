package javaExercise.part17.ex1to9.ex8;

import java.util.NoSuchElementException;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */

interface SListIterator<T> {
    boolean hasNext();

    T next();

    void remove();

    void add(T element);
}

//����һ����������
class SList<T> {

    private Link<T> header = new Link<>(null, null);  //���������ͷ��������header������Ϊempty

    public SList() {
        header.next = header; //Ĭ��header��nextָ���Լ��������ж��Ƿ���next
    }

    private class Link<T> {
        T element;
        Link<T> next;

        public Link(T element, Link<T> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        String str = "";
        SListIterator<T> sListIterator = iterator();
        while (sListIterator.hasNext()) {
            str += sListIterator.next();
        }
        return str;
    }

    public SListIterator<T> iterator() {
        return new SListIteratorImpl();
    }

    private class SListIteratorImpl implements SListIterator<T> {

        //���һ��Ԫ��
        private Link<T> lastReturned = header;
        //���һ��Ԫ�ص�next����
        private Link<T> next;

        public SListIteratorImpl() {
            next = header.next;
        }

        @Override
        public boolean hasNext() {
            return next != header;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            return lastReturned.element;
        }

        @Override
        public void remove() {
            if(lastReturned == header) {
                throw new IllegalStateException();
            }
            for(Link<T> curr = header;;curr = curr.next) {
                if(curr.next == lastReturned) {
                    lastReturned = curr;
                    break;
                }
            }

        }

        @Override
        public void add(T element) {
            lastReturned = header;
            Link<T> newLink = new Link<>(element, next);
            if (header.next == header) // Empty list
                header.next = newLink;
            else {
                //��header�����ҵ����һ��Ԫ��
                for (Link<T> curr = header; ; curr = curr.next)
                    if (curr.next == next) {
                        curr.next = newLink;
                        break;
                    }
            }
        }
    }

}

public class Test17_8 {

    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SListIterator<String> sListIterator = sList.iterator();
        sListIterator.add("aaa");
        sListIterator.add("bbb");
        sListIterator.add("ccc");

        print(sList);
    }
}
