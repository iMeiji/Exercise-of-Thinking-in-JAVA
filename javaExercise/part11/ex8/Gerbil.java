package part11.ex8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static Utils.Print.print;

/**
 * Created by yeming on 2015/9/8.
 */
public class Gerbil {

    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void printNumber() {
        print(gerbilNumber);
    }

    static void hop(Collection<Gerbil> gerbils) {
        Iterator<Gerbil> iterator = gerbils.iterator();
        while(iterator.hasNext()) {
            iterator.next().printNumber();
        }
    }

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        Gerbil gerbil1 = new Gerbil(1);
        Gerbil gerbil2 = new Gerbil(2);
        Gerbil gerbil3 = new Gerbil(3);
        gerbils.add(gerbil1);
        gerbils.add(gerbil2);
        gerbils.add(gerbil3);
        Gerbil.hop(gerbils);
    }
}
