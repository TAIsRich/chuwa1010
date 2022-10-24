package com.chuwa.exercise.collection;

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
    //ConcurrentHashMap class is thread-safe
    //multiple threads can operate on a single object without any complications.
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<>();
        m.put("A", 0);
        m.putIfAbsent("C", 2);
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
    //It follows reference equality,
    //instead of using the equals() method it uses the == operator.
    //It is not synchronized and must be synchronized externally.
    //Iterators are fail-fast
    // throw ConcurrentModificationException in an attempt to modify while iterating.
    public void learn_IdentityHashMap() {
        Map<DayOfWeek, Integer> m = new IdentityHashMap<>();
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
    //EnumMap is an ordered collection
    //they are maintained in the natural order of their keys
    //EnumMap is much faster than HashMap
    //All keys of each EnumMap instance must be keys of the same enum type.
    //EnumMap does not allow inserting null key if we try to insert the null key, it will throw NullPointerException.
    //EnumMap is internally represented as arrays therefore it gives the better performance.
    public void learn_EnumMap() {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<DayOfWeek, Integer>(DayOfWeek.class);
        enumMap.put(DayOfWeek.THURSDAY, 4);
        enumMap.putIfAbsent(DayOfWeek.WEDNESDAY, 3);
        System.out.println(enumMap);
    }
}
