package ex22;

import ex21.Money;

/**
 * Created by yeming on 2015/8/18.
 */
public class Test22 {

    public static void main(String[] args) {
        for (Money money: Money.values()) {
            switch (money) {
                case ONE:
                    System.out.println("һԪ");
                    break;
                case FIVE:
                    System.out.println("��Ԫ");
                    break;
                case TEN:
                    System.out.println("ʮԪ");
                    break;
                case TWENTY:
                    System.out.println("��ʮԪ");
                    break;
                case FIFTY:
                    System.out.println("��ʮԪ");
                    break;
                case HUNDRED:
                    System.out.println("һ��Ԫ");
                    break;
            }
        }
    }
}
