package ex14;

/**
 * Created by yeming on 2015/8/25.
 */
public class Car {

    private Engine engine = new Engine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car car = new Car();
//        car.getEngine() 并不理解题目的意思
    }
}
