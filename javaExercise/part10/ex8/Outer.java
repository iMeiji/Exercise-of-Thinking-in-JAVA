package part10.ex8;

/**
 * Created by yeming on 2015/9/6.
 */
public class Outer {

    public int getInnerNumber() {
        return new Inner().i;  //���Է����ڲ����privateԪ��
    }

    public class Inner {
        private int i = 0;
    }
}
