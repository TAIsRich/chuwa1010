package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

    /**
     * e.g.
     * ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     */
    @Test
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);

        ConcurrentHashMap<String, Integer> newMap = new ConcurrentHashMap<String, Integer>();
        newMap.putAll(map);
    }

    /**
     * e.g.
     * Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_IdentityHashMap() {
        //It follows reference equality, instead of using the equals() method it uses the == operator.
        IdentityHashMap<String, Integer> map = new IdentityHashMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);
    }

    /**
     * e.g.
     * EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_EnumMap() {
        enumMap<String, Integer> map = new enumMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);
    }
}
