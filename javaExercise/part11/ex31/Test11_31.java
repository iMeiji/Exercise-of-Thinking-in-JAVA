package part11.ex31;

import ex2.Shape;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/16.
 */
public class Test11_31 {

    public static void main(String[] args) {
        RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator(4);
        for(Shape shape: randomShapeGenerator) {
            print(shape.getClass().getSimpleName());
        }
    }
}
