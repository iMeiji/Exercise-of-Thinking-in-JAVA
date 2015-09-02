package part9.ex17;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/2.
 */
interface I {
    int a = 0;
}

public class Test9_17 {

    public static void main(String[] args) {
        print(I.a); //static
//        I.a = 1; //error,final
    }
}
