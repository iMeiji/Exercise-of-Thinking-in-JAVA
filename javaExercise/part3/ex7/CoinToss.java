package ex7;

import java.util.Random;

/**
 * Created by yeming on 2015/8/10.
 */
public class CoinToss {
    public static final int POSITIVE = 0; //硬币的正面
    public static final int NEGATIVE = 1; //硬币的反面

    public static void main(String[] args) {
        Random random = new Random();
        //随机抛10次硬币
        for(int i=0; i<10; i++) {
            switch (random.nextInt(2)) {
                case POSITIVE:
                    System.out.println("正面");
                case NEGATIVE:
                    System.out.println("反面");
            }
        }
    }
}
