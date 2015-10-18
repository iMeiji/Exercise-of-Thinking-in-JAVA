package javaExercise.part15.ex8;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by yeming on 2015/10/16.
 */

class StoryCharacters {

    private String name;

    public StoryCharacters(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class GoodGuys extends StoryCharacters {

    public GoodGuys(String name) {
        super(name);
    }
}

class Tom extends GoodGuys {

    public Tom() {
        super("Tom");
    }
}

class Amy extends GoodGuys {

    public Amy() {
        super("Amy");
    }
}

class BadGuys extends StoryCharacters {

    public BadGuys(String name) {
        super(name);
    }
}

class Peter extends BadGuys {

    public Peter() {
        super("Peter");
    }
}

public class CharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {

    private int size;

    private Random random = new Random(11);

    private Class[] types = {Tom.class, Amy.class, Peter.class};

    public CharactersGenerator(int size) {
        this.size = size;
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[random.nextInt(3)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    class CharactersIterator implements Iterator<StoryCharacters> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return CharactersGenerator.this.next();
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new CharactersIterator();
    }

    public static void main(String[] args) {
        for(StoryCharacters storyCharacters: new CharactersGenerator(12)) {
            print(storyCharacters.getName());
        }
    }

}
