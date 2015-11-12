//: net/mindview/util/FourTuple.java
package javaExercise.part17.ex20to29.ex28;

import net.mindview.util.ThreeTuple;

//略
public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
  public final D fourth;
  public FourTuple(A a, B b, C c, D d) {
    super(a, b, c);
    fourth = d;
  }
  public String toString() {
    return "(" + first + ", " + second + ", " +
      third + ", " + fourth + ")";
  }
} ///:~
