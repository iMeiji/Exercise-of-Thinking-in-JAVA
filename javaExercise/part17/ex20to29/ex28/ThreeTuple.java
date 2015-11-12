//: net/mindview/util/ThreeTuple.java
package javaExercise.part17.ex20to29.ex28;

import net.mindview.util.TwoTuple;

//略
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
  public final C third;
  public ThreeTuple(A a, B b, C c) {
    super(a, b);
    third = c;
  }
  public String toString() {
    return "(" + first + ", " + second + ", " + third +")";
  }
} ///:~
