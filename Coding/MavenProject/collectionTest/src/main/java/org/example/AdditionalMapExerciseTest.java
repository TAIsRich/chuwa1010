package org.example;

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
        //HashMap是线程不安全的，当出现多线程操作时，会出现安全隐患；而ConcurrentHashMap是线程安全的。
        //HashMap不支持并发操作，没有同步方法，ConcurrentHashMap支持并发操作，
        // 通过继承 ReentrantLock（JDK1.7重入锁）/CAS和synchronized(JDK1.8内置锁)来进行加锁（分段锁），
        // 每次需要加锁的操作锁住的是一个 segment，这样只要保证每个 Segment 是线程安全的，也就实现了全局的线程安全。
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Key1", 1001);
        map.putIfAbsent("Key2", 1002);
        map.putIfAbsent("Key2", 10021);
        System.out.println("Map: " + map);

        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
        map1.putAll(map);
        System.out.println("Map1: " + map1);
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
        //单说IdentityHashMap与常用的HashMap的区别是：前者比较key时是“引用相等”而后者是“对象相等”，
        // 即对于k1和k2，当k1==k2时，IdentityHashMap认为两个key相等，而HashMap只有在k1.equals(k2) == true
        // 时才会认为两个key相等。IdentityHashMap 允许使用null作为key和value. 不保证任何Key-value对的之间的顺序,
        // 更不能保证他们的顺序随时间的推移不会发生变化.
        Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
        map.put(DayOfWeek.MONDAY, 1);
        map.putIfAbsent(DayOfWeek.SATURDAY, 6);
        map.putIfAbsent(DayOfWeek.SATURDAY, 5);
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
        enumMap.putIfAbsent(DayOfWeek.SATURDAY, 6);
        enumMap.putIfAbsent(DayOfWeek.SATURDAY, 5);
        System.out.println(enumMap);
    }
}
