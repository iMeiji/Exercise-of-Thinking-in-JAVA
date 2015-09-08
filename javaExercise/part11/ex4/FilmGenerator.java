package part11.ex4;

import java.util.*;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/8.
 */
public class FilmGenerator {

    private List<String> films = new ArrayList<>();

    {
        films.add("Snow hite");
        films.add("Star Wars");
        films.add("aaaaa");
    }

    private int index;

    public String next() {
        String nextFilm;
        if (index < films.size()) {
            nextFilm = films.get(index);
            index++;
        } else {
            nextFilm = films.get(0);
            index = 1;
        }
        return nextFilm;
    }

    public static void fillCollection(Collection collection, int size) {
        FilmGenerator filmGenerator = new FilmGenerator();
        for (int i = 0; i < size; i++) {
            collection.add(filmGenerator.next());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> films1 = new LinkedList<>();
        HashSet<String> films2 = new HashSet<>();
        LinkedHashSet<String> films3 = new LinkedHashSet<>();
        TreeSet<String> films4 = new TreeSet<>();

        FilmGenerator.fillCollection(films1, 5);
        FilmGenerator.fillCollection(films2, 5);
        FilmGenerator.fillCollection(films3, 5);
        FilmGenerator.fillCollection(films4, 5);

        print(films1);
        print(films2);
        print(films3);
        print(films4);
    }


}
