package com.chuwa.exercise.collection;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
        ConcurrentHashMap<String, Integer> studentScore = new ConcurrentHashMap<>();
        studentScore.put("Alice", 95);
        studentScore.putIfAbsent("Bob", 89);
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Lucy", 95);
        anotherMap.put("Blair", 77);
        studentScore.putAll(anotherMap);
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
        Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
        map.put(DayOfWeek.MONDAY, 1);
        map.put(DayOfWeek.TUESDAY, 2);
        map.put(DayOfWeek.WEDNESDAY, 3);
        map.put(DayOfWeek.THURSDAY, 4);
        map.put(DayOfWeek.FRIDAY, 5);
        map.put(DayOfWeek.SATURDAY, 6);
        map.putIfAbsent(DayOfWeek.SUNDAY, 7);
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
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
        enumMap.put(DayOfWeek.MONDAY, 1);
        enumMap.putIfAbsent(DayOfWeek.TUESDAY, 2);
        enumMap.putIfAbsent(DayOfWeek.WEDNESDAY, 3);
        enumMap.putIfAbsent(DayOfWeek.THURSDAY, 4);
        enumMap.putIfAbsent(DayOfWeek.FRIDAY, 5);
        enumMap.putIfAbsent(DayOfWeek.SATURDAY, 6);
        enumMap.putIfAbsent(DayOfWeek.SUNDAY, 7);
    }
}
