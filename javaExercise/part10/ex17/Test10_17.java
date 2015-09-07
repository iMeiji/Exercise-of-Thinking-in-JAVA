package part10.ex17;

import java.util.Random;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/7.
 */
interface RandomGame {

    int playGame();
}

interface RandomGameFactory<T extends RandomGame> {

    T getRandomGame();
}

class CoinToss implements RandomGame {

    RandomGameFactory<CoinToss> getRandomGameFactory() {
        return new RandomGameFactory<CoinToss>() {
            @Override
            public CoinToss getRandomGame() {
                return new CoinToss();
            }
        };
    }

    @Override
    public int playGame() {
        Random random = new Random();
        return random.nextInt(2);
    }
}

class CrapShoot implements RandomGame {

    @Override
    public int playGame() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    RandomGameFactory<CrapShoot> getRandomGameFactory() {
        return new RandomGameFactory<CrapShoot>() {
            @Override
            public CrapShoot getRandomGame() {
                return new CrapShoot();
            }
        };
    }

}


public class Test10_17 {

    public static void main(String[] args) {
        CoinToss coinToss = new CoinToss().getRandomGameFactory().getRandomGame();
        CrapShoot crapShoot = new CrapShoot().getRandomGameFactory().getRandomGame();
    }
}
