package com.chuwa.collection;

import org.junit.Test;
import java.util.*;
/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class HashMapExerciseTest {

    /**
     * e.g.
     * Map<String, Integer> map = new HashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * getOrDefault(Object key, V defaultValue)
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
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.putIfAbsent("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("c",3);
        map2.put("d",4);
        map.putAll(map2);

        System.out.println(map.get("a"));
        System.out.println(map.getOrDefault("c", -1));
        System.out.println(map.getOrDefault("e", -1));
        System.out.println(map.containsKey("c"));
        System.out.println(map.containsKey("e"));
        System.out.println(map.containsValue(1));

        for (String s: map.keySet()){
            System.out.println(s);
        }

        for (int i : map.values()){
            System.out.println(i);
        }

        System.out.println(map.isEmpty());
        System.out.println("-------");

    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
     *
     * remove(Object key)
     * remove(Object key, Object value)
     *
     * compute(Key, BiFunction)
     * computeIfAbsent(Key, Function)
     * computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map);

        map.replace("a", 1, -1);
        map.replace("b", -2);
        System.out.println(map);

        map.replaceAll((key, value) -> value*2);
        System.out.println(map);

        map.remove("a");
        map.remove("b",-4);
        System.out.println(map);

        map.compute("c", (key, val) -> (val==null)? 0 : val*3);
        map.computeIfAbsent("d", val -> 4);
        map.computeIfPresent("d", (key,value) -> value*4);
        System.out.println(map);




    }
}
