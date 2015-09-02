//: interfaces/interfaceprocessor/Processor.java
package part9.ex11;

public interface Processor<T> {
    String name();

    T process(T input);
} ///:~
