package javaExercise.part15.ex18;

import javaExercise.part15.ex13.Generators;
import net.mindview.util.Generator;

import java.util.*;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/18.
 */
class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {

    }

    @Override
    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator = new Generator<LittleFish>() {
        @Override
        public LittleFish next() {
            return new LittleFish();
        }
    };
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {

    }

    @Override
    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<BigFish> generator = new Generator<BigFish>() {
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };
}

public class Ocean {

    public static void eat(BigFish bigFish, LittleFish littleFish) {
        print(bigFish + " eat " + littleFish);
    }

    public static void main(String[] args) {
        Random random = new Random(11);
        Queue<LittleFish> littleFishes = new LinkedList<>();
        Generators.fill(littleFishes, LittleFish.generator, 15);
        List<BigFish> bigFishes = new ArrayList<>();
        Generators.fill(bigFishes, BigFish.generator, 3);
        for(LittleFish littleFish: littleFishes) {
            eat(bigFishes.get(random.nextInt(bigFishes.size())), littleFish);
        }
    }
}
