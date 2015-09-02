package part9.ex18;

/**
 * Created by yeming on 2015/9/2.
 */
interface Cycle {

}

abstract class CycleFactory<T extends Cycle> {
    public abstract Cycle getCycle();
}


class Unicycle implements Cycle {}

class UnicycleFactory extends CycleFactory<Unicycle> {

    @Override
    public Unicycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {}

class BicycleFactory extends CycleFactory<Bicycle> {

    @Override
    public Bicycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {}

class TricycleFactoory extends CycleFactory<Tricycle> {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Test9_18 {
    public static void main(String[] args) {
        new UnicycleFactory().getCycle();
        new BicycleFactory().getCycle();
        new TricycleFactoory().getCycle();
    }
}
