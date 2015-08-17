package ex10;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test {

    @Override
    protected void finalize() throws Throwable{
        System.out.println("finalize 方法被调用");
        super.finalize();
    }
}
