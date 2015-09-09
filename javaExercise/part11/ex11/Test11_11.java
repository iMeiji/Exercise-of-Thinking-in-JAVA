package part11.ex11;

import java.util.*;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/9.
 */
class Dog implements Comparable<Dog> {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "我是一只狗, 我叫" + name;
    }

    //排序
    @Override
    public int compareTo(Dog dog) {
        return name.length() - dog.getName().length();
    }
}


public class Test11_11 {

    static int dogOrder;

    public static void addDogs(Collection<Dog>... dogsCollections) {
        for (Collection<Dog> dogs : dogsCollections) {
            for (int i = 0; i < 5; i++) {
                print("狗" + dogOrder);
                dogs.add(new Dog("狗" + dogOrder));
                dogOrder++;
            }
        }
    }

    public static void printCollection(Collection<Dog> ... dogsCollections) {
        for (Collection<Dog> dogs : dogsCollections) {
            Iterator<Dog> iterator = dogs.iterator();
            while (iterator.hasNext()) {
                print(iterator.next().toString());
            }
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        List<Dog> dogs2 = new LinkedList<>();
        Set<Dog> dogs3 = new HashSet<>();
        Set<Dog> dogs4 = new TreeSet<>();
        Set<Dog> dogs5 = new LinkedHashSet<>();
        addDogs(dogs1, dogs2, dogs3, dogs4, dogs5);
        printCollection(dogs1, dogs2, dogs3, dogs4, dogs5);
    }
}
