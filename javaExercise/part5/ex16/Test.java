package ex16;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test {

    String[] strs;

    public void setStrs(String ... strs) {
        this.strs = strs;
        for(String str: this.strs) {
            System.out.println("str " + str);
        }
    }
}
