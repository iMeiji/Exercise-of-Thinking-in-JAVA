package ex7;

import java.util.Random;

/**
 * Created by yeming on 2015/8/10.
 */
public class CoinToss {
    public static final int POSITIVE = 0; //Ӳ�ҵ�����
    public static final int NEGATIVE = 1; //Ӳ�ҵķ���

    public static void main(String[] args) {
        Random random = new Random();
        //�����10��Ӳ��
        for(int i=0; i<10; i++) {
            switch (random.nextInt(2)) {
                case POSITIVE:
                    System.out.println("����");
                case NEGATIVE:
                    System.out.println("����");
            }
        }
    }
}
