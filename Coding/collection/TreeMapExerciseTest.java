package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Amy Liu
 * @date 10/17/22
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

    @Test
    public void learn_Inserting_And_Retrieving() {
        TreeMap<String, Integer> map= new TreeMap<>();
        map.put("key1",1);
        map.putIfAbsent("key1", 2);
        map.putIfAbsent("key2", 2);
        System.out.println("The original map: "+ map);

        TreeMap<String, Integer> subMap= new TreeMap<>();
        subMap.put("key3", 3);
        subMap.put("key2",4);// replace the existed key and value
        map.putAll(subMap); //{key1=1, key2=4, key3=3}
        System.out.println("map after insert submap: "+ map);

        int val1 = map.get("key1");
        int val2 = map.getOrDefault("key", 0);

        if(map.containsKey(("key1"))){
            System.out.println("key1 value: "+val1);
        }
        if(map.containsValue(val2)){
            System.out.println("val2: "+val2);
        }

        System.out.println("the first key: " + map.firstKey());
        System.out.println("the last key: " + map.lastKey());

        Map.Entry<String, Integer> firstEntry= map.firstEntry();
        Map.Entry<String, Integer> lastEntry= map.lastEntry();

        System.out.println("the first Entry: " + firstEntry);
        System.out.println("the last Entry: " + lastEntry);


        map.put("key4", 5);
        System.out.println("the current map:"+ map);
        map.pollFirstEntry();//remove first entry
        map.pollLastEntry();
        System.out.println("the current map after poll:"+ map);

        if(!map.isEmpty()){
            for(String key: map.keySet()){
                System.out.println(key);
            }
            System.out.println(map.keySet());
            for(int val: map.values()){
                System.out.println(val);
            }
            System.out.println(map.values());
        }
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new TreeMap<>();
        map.replace("key", 1, 2);
        map.replace("key", 6);
        System.out.println("the current map: " + map);

        map.put("key", 1);
        map.replace("key", 1, 2);
        System.out.println("the current map: " + map);

        map.replace("key", 6);
        System.out.println("the current map: " + map);

        map.put("key1", 66);
        map.remove("key");
        System.out.println("the current map: " + map);

    }
}
