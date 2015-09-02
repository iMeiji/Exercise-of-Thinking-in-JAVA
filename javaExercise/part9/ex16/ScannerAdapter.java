package part9.ex16;

/**
 * Created by yeming on 2015/9/2.
 */
public class ScannerAdapter implements Runnable {

    public ScannerAdapter() {
    }

    @Override
    public void run() {
        GenerateChar.f();
    }
}
