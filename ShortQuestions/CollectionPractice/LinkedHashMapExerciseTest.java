package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
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
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);

        HashMap<String, Integer> newMap = new LinkedHashMap<String, Integer>();
        newMap.putAll(map);

        int res1 = map.get("ethan");
        int res2 = map.getOrDefault("mike", 0);

        boolean b1 = map.containsKey("ethan");
        boolean b2 = map.containsValue(3);

        Set<String> set1 = map.keySet();
        Set<Integer> set2 = map.values();

        boolean b3 = map.isEmpty();
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
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);

        map.replace("ethan", 3);
        map.replace("ethan", 3, 5);
        map1.replaceAll((key, oldValue)
                -> oldValue * oldValue);

        Integer num = map.remove("ethan");
        boolean b1 = map.remove("ethan", 5);

        map1.compute((key, oldValue)
                -> oldValue + 2);
        map1.computeIfAbsent("mike",
                k -> 6);
        map1.computeIfPresent("mike",
                k -> 7);
    }
}
