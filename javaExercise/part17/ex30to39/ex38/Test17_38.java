package javaExercise.part17.ex30to39.ex38;

import net.mindview.util.Countries;

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.*;
/**
 * Created by yeming on 2015/11/12.
 */
public class Test17_38 {

    static void testGet(Map<String, String> filledMap, int n) {
        for (int tc = 0; tc < 1000000; tc++) {
            for (int i = 0; i < Countries.DATA.length; i++) {
                String key = Countries.DATA[i][0];
                filledMap.get(key);
            }
        }

    }

    public static void main(String[] args) {
        //初始容量默认为16，默认负载因子0.75
        HashMap<String, String> map1 = new HashMap<>();
        map1.putAll(Countries.capitals(11));
        //指定初始容量默认为32
        HashMap<String, String> map2 = new HashMap<>(32);
        map2.putAll(map1);
        long t1 = System.currentTimeMillis();
        testGet(map1, 11);
        long t2 = System.currentTimeMillis();
        print("map1 : " + (t2 - t1));
        t1 = System.currentTimeMillis();
        testGet(map2, 11);
        t2 = System.currentTimeMillis();
        print("map2 : " + (t2 - t1));
    }
}
