package part10.ex16;

/**
 * Created by yeming on 2015/9/7.
 */
interface Cycle {

}

abstract class CycleFactory {
    public abstract Cycle getCycle();
}


class Unicycle implements Cycle {

    public static CycleFactory getCycleFactory() {
        return new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Unicycle();
            }
        };
    }
}


class Bicycle implements Cycle {
    public static CycleFactory getCycleFactory() {
        return new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Bicycle();
            }
        };
    }
}

class Tricycle implements Cycle {
    public static CycleFactory getCycleFactory() {
        return new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Tricycle();
            }
        };
    }
}


public class Test10_16 {
    public static void main(String[] args) {
        new Unicycle().getCycleFactory().getCycle();
        new Bicycle().getCycleFactory().getCycle();
        new Tricycle().getCycleFactory().getCycle();
    }
}

