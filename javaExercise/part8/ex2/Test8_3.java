package ex2;

/**
 * Created by yeming on 2015/9/1.
 */
public class Test8_3 {

    public static void main(String[] args) {
        RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();
        Shape shape = randomShapeGenerator.next();
        shape.printf();
    }
}
