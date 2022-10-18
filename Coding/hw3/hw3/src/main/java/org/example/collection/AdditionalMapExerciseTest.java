package org.example.collection;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
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
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.putIfAbsent("map_key_1", 3);

        ConcurrentHashMap<String, Integer> newMap = new ConcurrentHashMap<>();
        newMap.putAll(map);

        System.out.println("=====ConcurrentHashMap=====");
        System.out.println("map information: " + map);
        System.out.println("newMap information: " + newMap);
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
        map.put(DayOfWeek.MONDAY, 100);
        map.put(DayOfWeek.TUESDAY, 200);
        map.put(DayOfWeek.WEDNESDAY, 300);
        map.putIfAbsent(DayOfWeek.MONDAY, 200);
        System.out.println("=====IdentityHashMap=====");
        System.out.println(map);
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
        enumMap.put(DayOfWeek.FRIDAY, 55);
        enumMap.put(DayOfWeek.SATURDAY, 66);
        enumMap.put(DayOfWeek.SUNDAY, 77);
        enumMap.putIfAbsent(DayOfWeek.FRIDAY, 44);
        System.out.println("=====EnumMap=====");
        System.out.println(enumMap);

    }
}
