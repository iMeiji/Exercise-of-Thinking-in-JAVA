package javaExercise.part14.ex20;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/15.
 */

class Toy {

}

class SuperToy extends Toy {

}


public class Test14_20 {

    public static void main(String[] args) {
        if(args.length != 1) {
            print("args length should be 1");
            System.exit(1);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
//            将父类向下转型为之类
//            c.asSubclass();
            //类型转换
            Class<Toy> toyClass = Toy.class;
            Toy toy = toyClass.cast(c);


            print("c.getName() " + c.getName());
            print("c.getSimpleName() " + c.getSimpleName());
            print("c.getCanonicalName() " + c.getCanonicalName());
            print("c.getTypeName() " + c.getTypeName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
