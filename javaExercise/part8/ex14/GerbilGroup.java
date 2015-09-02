package ex14;

/**
 * Created by yeming on 2015/9/2.
 */
public class GerbilGroup {

    Gerbil gerbil;

    public GerbilGroup(Gerbil gerbil) {
        this.gerbil = gerbil;
        this.gerbil.addRef();
    }

    protected void dispose() {
        gerbil.dispose();
    }
}
