package Coding.collection;

import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

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
        ConcurrentHashMap<String, Integer> map =new ConcurrentHashMap<>();
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        ConcurrentHashMap<String, Integer> new_map =new ConcurrentHashMap<>();
        new_map.put("three", 3);
        map.putAll(new_map);
        System.out.println(map);
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
        map.putIfAbsent(DayOfWeek.TUESDAY, 3);
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
        enumMap.put(DayOfWeek.MONDAY, 1);
        enumMap.putIfAbsent(DayOfWeek.TUESDAY, 2);
        System.out.println(enumMap);
    }
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        SUNDAY;
    }
}
