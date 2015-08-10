import java.lang.System;

public class ArgsTest {

    public static void main(String[] args) {
        if(args.length >= 3) {
            System.out.println("参数1 " + args[0] + " 参数2 " + args[1] + " 参数2 " + args[2]);
        }
    }
}