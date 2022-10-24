package collectionHW;

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
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap();
        map.put(1,2);
        map.putIfAbsent(3,4);
        System.out.println(map);
        map.putAll(map);

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

        map.put(DayOfWeek.FRIDAY,5);
        map.putIfAbsent(DayOfWeek.MONDAY,1);
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
        enumMap.put(DayOfWeek.SATURDAY,6);
        enumMap.putIfAbsent(DayOfWeek.MONDAY,1);
        System.out.println(enumMap);


    }
}
