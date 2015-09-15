package part11.ex17;

import java.util.*;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/8.
 */
public class Gerbil {

    String name;

    public Gerbil(String name) {
        this.name = name;
    }

    void hop() {
        print(" name " + name);
    }

    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("aaa", new Gerbil("aaa"));
        gerbilMap.put("bbb", new Gerbil("bbb"));
        gerbilMap.put("ccc", new Gerbil("ccc"));
        Iterator<String> it = gerbilMap.keySet().iterator();
        while (it.hasNext()) {
            String name = it.next();
            print(name);
            gerbilMap.get(name).hop();
        }
    }
}
