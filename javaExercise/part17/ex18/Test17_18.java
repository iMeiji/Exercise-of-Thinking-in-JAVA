package javaExercise.part17.ex18;

import net.mindview.util.Countries;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/11/5.
 */
public class Test17_18 {

    public static void main(String[] args) {
        SlowSet<String> slowSet = new SlowSet<>();
        slowSet.addAll(Countries.names(10));
        slowSet.addAll(Countries.names(10));
        slowSet.addAll(Countries.names(10));
        print(slowSet);
        slowSet.removeAll(Countries.names(10));
        print(slowSet);
    }

}
