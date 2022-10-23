package org.example;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
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
        ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<>();
        m.put("zero", 0);
        m.putIfAbsent("two", 2);
        m.putAll(new ConcurrentHashMap<String, Integer>());

        System.out.println(m);
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
        ConcurrentHashMap<DayOfWeek, Integer> m = new ConcurrentHashMap<>();
        m.put(DayOfWeek.MONDAY, 1);
        m.putIfAbsent(DayOfWeek.TUESDAY,2);
        System.out.println(m);

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
        EnumMap<DayOfWeek, Integer> m = new EnumMap<>(DayOfWeek.class);
        m.put(DayOfWeek.WEDNESDAY, 3);
        m.putIfAbsent(DayOfWeek.TUESDAY,2);

        System.out.println(m);
    }
}
