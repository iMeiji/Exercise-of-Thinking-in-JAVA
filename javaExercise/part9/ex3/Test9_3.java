package part9.ex3;

/**
 * Created by yeming on 2015/9/2.
 */
abstract class Car {
    public abstract void print();

    public Car() {
        print();
    }
}

class NewCar extends Car{

    int a = 1;

    @Override
    public void print() {
        System.out.println(a);
    }
}

public class Test9_3 {
    public static void main(String[] args) {
        NewCar newCar = new NewCar();
        newCar.print();
    }
}

//outprint
//0
//1
//解释：先调用基类构造函数，抽象方法所自动识别调用导出类的print方法，此时导出类还没有初始化，所以先输出0
