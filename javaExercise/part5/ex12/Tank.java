package ex12;

/**
 * Created by yeming on 2015/8/18.
 */
public class Tank {

    //×´Ì¬£ºÂú
    public static final int STATUS_FILL = 0;
    //×´Ì¬£º¿Õ
    public static final int STATUS_EMPTY = 1;

    //µ±Ç°×´Ì¬
    private int status = 1;

    public void setStatusFill() {
        status = STATUS_FILL;
    }

    public void setStatusEmpty() {
        status = STATUS_EMPTY;
    }

    @Override
    protected void finalize() throws Throwable {
        if(status == STATUS_FILL) {
            System.out.println("Tank is fill! Finalize is stop!");
        } else {
            System.out.println("Tank is empty. Finalize is ok!");
            super.finalize();
        }
    }
}
