package ex4;

/**
 * Created by yeming on 2015/8/10.
 */
public class SpeedCalculation {
    public static final float TIME = 6f;
    public static final float DISTANCE = 12f;

    public static float calculateSpeed(float distance, float time) {
        return distance/time;
    }
    public static void main(String[] args) {
        System.out.println(calculateSpeed(DISTANCE, TIME));
    }
}
