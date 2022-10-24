package org.example;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.IdentityHashMap;
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
    ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    @Test
    public void learn_ConcurrentHashMap() {
        map.put("1",1);
        map.putIfAbsent("2",2);
        ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<>();
        m.put("3",3);
        m.put("4",4);
        map.putAll(m);
        printMap();

    }

    /**
     * e.g.
     * Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    IdentityHashMap<DayOfWeek, Integer> map2 = new IdentityHashMap<>();
    @Test
    public void learn_IdentityHashMap() {
        map2.put(DayOfWeek.MONDAY,1);
        map2.putIfAbsent(DayOfWeek.FRIDAY,5);

    }

    /**
     * e.g.
     * EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
    @Test
    public void learn_EnumMap() {
        enumMap.put(DayOfWeek.MONDAY,1);
        enumMap.putIfAbsent(DayOfWeek.FRIDAY,5);

    }
    public <E> void print(E e){
        System.out.println(e);
    }
    public void printMap(){
        map.forEach((key,value)->{
            System.out.print(key+":");
            System.out.print(value);
            System.out.print(",  ");
        });
        System.out.println();
    }
}
