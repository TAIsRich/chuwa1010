package com.chuwa.exercise.collection;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Amy Liu
 * @date 10/17/22
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
        ConcurrentHashMap<String, Integer> map= new ConcurrentHashMap<>();
        map.put("key1", 1);
        map.putIfAbsent("key2", 2);
        map.putIfAbsent("key1",2);

        ConcurrentHashMap<String, Integer> newMap= new ConcurrentHashMap<>();
        newMap.putAll(map);

        System.out.println("the origin concurrent hashmap is \n" + map);
        System.out.println("\nthe new ConcurrentHashMap is \n" + newMap);
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
        Map<DayOfWeek, Integer> map= new IdentityHashMap<>();
        map.put(DayOfWeek.MONDAY, 1);
        map.putIfAbsent(DayOfWeek.MONDAY, 3);
        map.put(DayOfWeek.FRIDAY, 6);
        System.out.println("The identity hashmap is: "+ map );
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
        EnumMap<DayOfWeek, Integer> map= new EnumMap<>(DayOfWeek.class);
        map.putIfAbsent(DayOfWeek.FRIDAY,5);
        map.put(DayOfWeek.MONDAY,1);
        map.putIfAbsent(DayOfWeek.MONDAY,3);
        System.out.println("the enum map is " + map);
    }
}
