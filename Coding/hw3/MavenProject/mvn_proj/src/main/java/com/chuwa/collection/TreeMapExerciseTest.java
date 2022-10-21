package com.chuwa.collection;

import org.junit.Test;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
     *
     * containsKey(Object key)
     * containsValue(Object value)
     *
     * keySet()
     * values()
     * isEmpty()
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.putIfAbsent("b",2);
        map.putIfAbsent("b",3);
        map.putIfAbsent("c",4);
        System.out.println(map);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("e", 5);
        map2.put("f", 6);
        map.putAll(map2);
        System.out.println(map);

        System.out.println(map.get("c"));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.containsKey("e"));
        System.out.println(map.containsValue(3));

        for(String s: map.keySet()){
            System.out.println(s);
        }

        for(int n: map.values()){
            System.out.println(n);
        }

        System.out.println(map.isEmpty());
        System.out.println("------");

    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.putIfAbsent("b",2);
        map.putIfAbsent("c",3);
        System.out.println(map);

        map.replace("a", 1, 100);
        map.replace("b", 200);

        map.remove("c");
        System.out.println(map);

    }
}
