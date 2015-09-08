package part11.ex1;

import java.util.ArrayList;

import static Utils.Print.*;
/**
 * Created by yeming on 2015/9/8.
 */
public class Gerbil {

    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        print("ºÅÂë " + gerbilNumber + " is hopping");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        Gerbil gerbil1 = new Gerbil(1);
        Gerbil gerbil2 = new Gerbil(2);
        Gerbil gerbil3 = new Gerbil(3);
        gerbils.add(gerbil1);
        gerbils.add(gerbil2);
        gerbils.add(gerbil3);
        for(Gerbil gerbil: gerbils) {
            gerbil.hop();
        }
    }
}
