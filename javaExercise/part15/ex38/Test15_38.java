package javaExercise.part15.ex38;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/10/20.
 */

class Coffee {
    int type;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}

class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public void setType(int type) {
        coffee.setType(type);
    }

    public int getType() {
        return coffee.getType();
    }
}

class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    public void mixMilk() {
        print("mixMilk");
    }
}

class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    public void mixChocolote() {
        print("ChocolateDecorator");
    }
}

public class Test15_38 {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        MilkCoffeeDecorator milkCoffeeDecorator = new MilkCoffeeDecorator(coffee);
        milkCoffeeDecorator.mixMilk();
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(coffee);
        chocolateDecorator.mixChocolote();
    }
}
