package part11.ex24;

import java.util.*;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/15.
 */
class Dog {

    int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age " + age;
    }
}

public class Test11_24 {

    public static void main(String[] args) {
        Map<String, Dog> dogMap = new LinkedHashMap<>();
        dogMap.put("ccc", new Dog(10));
        dogMap.put("fff", new Dog(20));
        dogMap.put("aaa", new Dog(30));
        dogMap.put("ddd", new Dog(40));
        print("before " + dogMap);
        String[] dogNames = dogMap.keySet().toArray(new String[0]);
        Arrays.sort(dogNames);
        Map<String, Dog> dogMap2 = new LinkedHashMap<>();
        for(String name: dogNames) {
            dogMap2.put(name, dogMap.get(name));
        }
        print("after " + dogMap2);
    }
}
