package part10.ex2;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/5.
 */
public class StringSequence {

    private String str;

    public StringSequence(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

    public static void main(String[] args){
        StringSequence stringSequence1 = new StringSequence("abc");
        StringSequence stringSequence2 = new StringSequence("def");

        Sequence sequence = new Sequence(2);
        sequence.add(stringSequence1);
        sequence.add(stringSequence2);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            print(selector.current());
            selector.next();
        }
    }

}
