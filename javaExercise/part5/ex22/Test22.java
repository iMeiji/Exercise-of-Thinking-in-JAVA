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
                    System.out.println("一元");
                    break;
                case FIVE:
                    System.out.println("五元");
                    break;
                case TEN:
                    System.out.println("十元");
                    break;
                case TWENTY:
                    System.out.println("二十元");
                    break;
                case FIFTY:
                    System.out.println("五十元");
                    break;
                case HUNDRED:
                    System.out.println("一百元");
                    break;
            }
        }
    }
}
