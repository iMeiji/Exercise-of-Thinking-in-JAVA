package part11.ex10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yeming on 2015/9/1.
 */
public class Text11_10 {

    private static void f(Rodent rodent) {
        rodent.f();
    }

    public static void main(String[] args) {
        List<Rodent> rodents = new ArrayList<>();
        rodents.add(new Mouse());
        rodents.add(new Gerbil());
        rodents.add(new Hamster());
        Iterator<Rodent> it = rodents.iterator();
        while(it.hasNext()) {
            f(it.next());
        }
    }
}
