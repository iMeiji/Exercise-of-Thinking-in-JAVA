package javaExercise.part17.ex8;

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

//构造一个单向链表
class SList<T> {

    private Link<T> header = new Link<>(null, null);  //单项链表的头，仅包含header的链表为empty

    public SList() {
        header.next = header; //默认header的next指向自己，用于判断是否有next
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

        //最后一个元素
        private Link<T> lastReturned = header;
        //最后一个元素的next引用
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
                //从header向后查找到最后一个元素
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
