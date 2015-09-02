package part9.ex19;

import java.util.Random;
import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/2.
 */

interface RandomGame {

    int playGame();
}

interface RandomGameFactory<T extends RandomGame> {

    T getRandomGame();
}

class CoinToss implements RandomGame {

    @Override
    public int playGame() {
        Random random = new Random();
        return random.nextInt(2);
    }
}

class CoinTossFactory implements RandomGameFactory<CoinToss> {

    @Override
    public CoinToss getRandomGame() {
        return new CoinToss();
    }
}

class CrapShoot implements RandomGame {

    @Override
    public int playGame() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

class CrapShootFactory implements RandomGameFactory<CrapShoot> {

    @Override
    public CrapShoot getRandomGame() {
        return new CrapShoot();
    }
}


public class Test9_19 {

    public static void main(String[] args) {
        CoinToss coinToss = new CoinTossFactory().getRandomGame();
        print(coinToss.playGame());
        print(coinToss.playGame());

        CrapShoot crapShoot = new CrapShootFactory().getRandomGame();
        print(crapShoot.playGame());
        print(crapShoot.playGame());
    }
}
