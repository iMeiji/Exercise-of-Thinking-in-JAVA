package javaExercise.part17.ex25;//: containers/SimpleHashMap.java
// A demonstration hashed Map.

import java.util.*;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    static final int SIZE = 997;

    @SuppressWarnings("unchecked")
    MapEntry<K, V>[] buckets = new MapEntry[SIZE]; //槽位只保存一个mapEntry

    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K, V> prevPair = null;
        MapEntry<K, V> newPair = new MapEntry<>(key, value);
        boolean found = false;
        //槽位为null，槽位存新pair
        if (buckets[index] == null) {
            buckets[index] = newPair;
        }
        for (MapEntry<K, V> pair = buckets[index]; pair != null; pair = pair.next) {
            if (pair.getKey().equals(key)) {
                oldValue = pair.getValue();
                if (prevPair != null) {
                    //槽位有pair，next指向新pair
                    prevPair.next = newPair;
                } else {
                    //槽位无pair，槽位存新pair
                    buckets[index] = newPair;
                }
                newPair.next = pair.next;
                found = true;
                break;
            }
            prevPair = pair;
        }
        if(!found) {
            prevPair.next = newPair;
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) return null;
        for(MapEntry<K, V> iPair = buckets[index];iPair != null;iPair = iPair.next) {
            if (iPair.getKey().equals(key)) {
                return iPair.getValue();
            }
        }
        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        for(MapEntry<K, V> bucket: buckets) {
            for(MapEntry<K, V> iPair = bucket; iPair != null; iPair = iPair.next) {
                set.add(iPair);
            }
        }
        return set;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        buckets = new MapEntry[SIZE];
    }

    public V remove(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;

        MapEntry<K, V> bucket = buckets[index];
        if (bucket == null) return null;
        for (MapEntry<K, V> pair = buckets[index]; pair != null; pair = pair.next) {
            if (pair.getKey().equals(key)) {
                V value = pair.getValue();
                pair = null;
                return value;
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            return false;
        }
        MapEntry<K, V> bucket = buckets[index];
        for (MapEntry<K, V> pair = bucket; pair != null; pair = pair.next) {
            if(pair.getValue().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value) {
        for(MapEntry<K, V> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> pair = bucket; pair != null; pair = pair.next) {
                if(pair.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        int sz = 0;
        for(MapEntry<K,V> bucket : buckets) {
            for(MapEntry<K, V> iPair = bucket; iPair != null; iPair = iPair.next) {
                sz++;
            }
        }
        return sz;
    }

    public boolean isEmpty() {
        for(MapEntry<K,V> bucket : buckets) {
            if (bucket != null) {
                return false;
            }
        }
        return true;
    }
}
