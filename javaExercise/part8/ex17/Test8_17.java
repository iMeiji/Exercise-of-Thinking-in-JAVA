package ex17;

/**
 * Created by yeming on 2015/9/2.
 */
public class Test8_17 {

    public static void main(String[] args) {
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        Cycle unicycle = new Unicycle();
//        向上转型无法调用balance()
//        bicycle.balance();
//        tricycle.balance();
//        unicycle.balance();
        ((Bicycle) bicycle).balance();
        //error
//        ((Tricycle) tricycle).balance();
        ((Unicycle) unicycle).balance();
    }
}
