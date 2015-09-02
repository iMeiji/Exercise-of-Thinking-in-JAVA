package ex14;

/**
 * Created by yeming on 2015/9/2.
 */
public class Test8_14 {

    public static void main(String[] args) {
        Gerbil gerbil = new Gerbil();
        GerbilGroup[] gerbils = {new GerbilGroup(gerbil), new GerbilGroup(gerbil), new GerbilGroup(gerbil)};
        for (GerbilGroup group : gerbils) {
            group.dispose();
        }
    }
}
