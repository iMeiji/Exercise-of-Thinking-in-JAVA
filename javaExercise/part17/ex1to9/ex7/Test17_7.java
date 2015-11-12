package javaExercise.part17.ex1to9.ex7;

import net.mindview.util.Countries;

import java.util.*;

import static net.mindview.util.Print.*;

/**
 * Created by yeming on 2015/10/29.
 */
public class Test17_7 {

    public static void main(String[] args) {
        ArrayList<String> lt1 = new ArrayList<>(Countries.names(4));
        print("lt1");
        printList(lt1);

        LinkedList<String> lt2 = new LinkedList<>(Countries.names(8).subList(4 ,8));
        print("lt2");
        printList(lt2);

        print("1----------------------");
        int index1 = 0;
        for(ListIterator<String> it = lt1.listIterator();it.hasNext() && index1 < lt2.size();) {
            lt2.add(index1, it.next());
            index1 += 2;
        }

        print("lt2 " + lt2);

        print("2----------------------");
        int index2 = 0;
        for(ListIterator<String> it = lt2.listIterator(lt2.size());it.hasPrevious() && index2 < lt1.size();) {
            lt1.add(index2, it.previous());
            index2 += 2;
        }

        print("lt1 " + lt1);

    }

    static void printList(List<String> list) {
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            print(it.next());
        }
    }
}
