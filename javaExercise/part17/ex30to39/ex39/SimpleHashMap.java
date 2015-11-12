package javaExercise.part17.ex30to39.ex39;//: containers/SimpleHashMap.java
// A demonstration hashed Map.

import net.mindview.util.Countries;

import java.util.*;

import static net.mindview.util.Print.print;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    //负载因子
    private static final double loadFactor = 0.75;
    //初始容量
    private final static int initialCapacity = 11;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[initialCapacity];
    //尺寸
    private int count;
    //容量
    private int capacity = initialCapacity;
    //阈值
    private int threshold = (int) (capacity * loadFactor);

    /**
     * 判断是否为质数
     *
     * @param number
     * @return
     */
    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 获取比指定数两倍大的质数中的最小的数
     *
     * @param number
     * @return
     */
    private static int getPrime(int number) {
        for (int i = 2 * number; ; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
    }

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % initialCapacity;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }
        if (!found) {
            if (count > threshold) {
                rehash();
            }
            if (buckets[index] == null) {
                buckets[index] = new LinkedList<>();
            }
            buckets[index].add(pair);
            count++;
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % initialCapacity;
        if (buckets[index] == null) return null;
        for (MapEntry<K, V> iPair : buckets[index])
            if (iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }

    /**
     * when loadFactor > 0.75 call rehash()
     */
    private void rehash() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        capacity = getPrime(capacity);

        print("rehash " + capacity);

        buckets = new LinkedList[capacity];
        threshold = (int) (capacity * loadFactor);
        count = 0;

        while (it.hasNext()) {
            Map.Entry<K, V> me = it.next();
            put(me.getKey(), me.getValue());
        }
    }
}
