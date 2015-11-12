//: net/mindview/util/TwoTuple.java
package net.mindview.util;

public class TwoTuple<A, B> implements Comparable<TwoTuple<A, B>> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    @Override
    public int hashCode() {
        return first.hashCode() + second.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof TwoTuple &&
                first.equals(((TwoTuple) o).first)
                && second.equals(((TwoTuple) o).second);

    }

    @Override
    @SuppressWarnings("unchecked")
    public int compareTo(TwoTuple<A, B> obj) {
        int res = ((Comparable<A>)first).compareTo(obj.first);
        if(res != 0) return res;
        return ((Comparable<B>)second).compareTo(obj.second);
    }
}
