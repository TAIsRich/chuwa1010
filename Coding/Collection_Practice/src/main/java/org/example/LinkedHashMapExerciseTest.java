package org.example;

import org.junit.Test;

import java.util.*;


public class LinkedHashMapExerciseTest {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.putIfAbsent("c",1);
        map.putIfAbsent("a", 2);

        Map<String, Integer> anotherMap = new HashMap<>();
        map.put("b", 1);
        map.put("d", 2);
        map.putAll(anotherMap);

        map.get("a");
        map.getOrDefault("c", 0);
        map.containsKey("a");
        map.containsKey("e");
        map.containsValue(1);

        for (String s : map.keySet()){
            System.out.println(s);
        }

        for (int a : map.values()){
            System.out.println(a);
        }

        map.isEmpty();

        System.out.println(map);
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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b",2);
        map.put("c", 3);

        map.replace("a", 1, 2);
        map.replace("b", 1);
        System.out.println(map);

        map.replaceAll((key, value) -> value * 2);
        System.out.println(map);

        map.remove("a");
        map.remove("b", 1);
        map.remove("b", 2);
        System.out.println(map);

        map.compute("c", (key, value) -> value * 2);
        map.computeIfAbsent("a", value -> 1*2);
        map.computeIfPresent("a", (key,value) -> value*2);
        System.out.println(map);
    }
}
