package javaExercise.part15.ex30;

/**
 * Created by yeming on 2015/10/20.
 */
public class Test15_30 {

    public static void main(String[] args) {
        Holder<Integer> holder1 = new Holder<>();
        holder1.set(1);
        int i = holder1.get();

        Holder<Short> holder2 = new Holder<>();
        holder2.set((short)1);
        short s = holder2.get();

        Holder<Byte> holder3 = new Holder<>();
        holder3.set((byte)2);
        byte b = holder3.get();

        //其他类型省略
    }
}
