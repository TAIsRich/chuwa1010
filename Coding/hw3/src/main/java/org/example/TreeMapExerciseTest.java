package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
     *
     * containsKey(Object key)
     * containsValue(Object value)
     *
     * keySet()
     * values()
     * isEmpty()
     */
    TreeMap<String, Integer> map = new TreeMap<>();
    @Test
    public void learn_Inserting_And_Retrieving() {
        map.put("first",1);
        map.put("second",2);
        map.put("Third",3);
        map.put("Forth",4);
        map.putIfAbsent("fifth",5);
        printMap();

        TreeMap<String,Integer> map2 = new TreeMap<>();
        map2.put("sixth",6);
        map2.put("seventh",7);
        map.putAll(map2);
        printMap();
        print(map.get("sixth"));
        print(map.firstKey());
        print(map.lastKey());
        print(map.containsKey("first"));
        print(map.containsValue(7));

        print(map.keySet());

        print(map.values());

        print(map.isEmpty());

    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        map.put("first",1);
        map.put("second",2);
        map.put("Third",3);
        map.put("Forth",4);
        map.replace("first",1,0);
        printMap();
        map.replace("first",1);
        printMap();
        map.remove("first");
        printMap();
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
