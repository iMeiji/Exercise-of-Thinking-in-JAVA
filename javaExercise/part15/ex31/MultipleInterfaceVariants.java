package javaExercise.part15.ex31;//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)

interface Payable<T> {
}

class Employee implements Payable {
}

class Hourly extends Employee implements Payable {
} ///:~
