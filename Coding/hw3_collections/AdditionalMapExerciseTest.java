package com.chuwa.exercise.collection;

import org.junit.Test;

import java.time.DayOfWeek;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        ConcurrentHashMap<String, Integer> m1 = new ConcurrentHashMap<>();
        m1.put("key1", 1);
        m1.putIfAbsent("key1", 2);
        m1.putIfAbsent("key2", 2);

        ConcurrentHashMap<String, Integer> m2 = new ConcurrentHashMap<>();
        m2.putAll(map);
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
        Map<DayOfWeek, Integer> m = new IdentityHashMap<>();
        m.put(DayOfWeek.MONDAY, 1);
        m.putIfAbsent(DayOfWeek.MONDAY, 1);
        m.put(DayOfWeek.TUESDAY, 2);
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
        EnumMap<DayOfWeek, Integer> m = new EnumMap<> (DayOfWeek.class);
        m.putIfAbsent(DayOfWeek.MONDAY, 1);
        m.put(DayOfWeek.MONDAY, 1);
        m.putIfAbsent(DayOfWeek.TUESDAY, 2);
    }
}
