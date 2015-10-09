package javaExercise.part14.ex7;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import static net.mindview.util.Print.*;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        for(String className: args) {
            try {
                Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
} /* 命令行执行：
在C:\Users\yeming\workspace\GitHub\Exercise-of-Thinking-in-JAVA目录下
1. javac -d . -cp C:\Users\yeming\workspace\GitHub\Exercise-of-Thinking-in-JAVA\net\mindview\"util" .\javaExercise\part14\ex7\SweetShop.java
2.java javaExercise.part14.ex7.SweetShop javaExercise.part14.ex7.Candy

*///:~
