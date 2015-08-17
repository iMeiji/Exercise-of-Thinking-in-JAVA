package ex12;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test12 {

    public static void main(String[] args) throws Throwable {
        Tank tank = new Tank();
        tank.setStatusFill();
        tank.finalize();
        tank.setStatusEmpty();
        tank.finalize();
    }
}
