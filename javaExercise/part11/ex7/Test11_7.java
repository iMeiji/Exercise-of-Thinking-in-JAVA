package part11.ex7;

import java.util.ArrayList;
import java.util.List;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/8.
 */
class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}


public class Test11_7 {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();

        {
            dogs.add(new Dog("aaa"));
            dogs.add(new Dog("bbb"));
            dogs.add(new Dog("ccc"));
            dogs.add(new Dog("ddd"));
            dogs.add(new Dog("eee"));
        }

        List<Dog> newDogs = dogs.subList(1, 2);

        for(Dog dog: newDogs) {
            print("newDogs " + dog.getName());
        }

        dogs.removeAll(newDogs);

        for(Dog dog: dogs) {
            print("dogs " + dog.getName());
        }

    }
}
