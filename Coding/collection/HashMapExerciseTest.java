package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amy Liu
 * @date 10/17/22
 */
public class HashMapExerciseTest {

    /**
     * e.g.
     * Map<String, Integer> map = new HashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * getOrDefault(Object key, V defaultValue)
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
        Map<String, Integer> map= new HashMap<>();
        map.put("fruit", 0);
        map.putIfAbsent("fruit", 00);
        map.putIfAbsent("tree", 11);
        System.out.println("the original map: "+ map );

        Map<String, Integer> subMap= new HashMap<>();
        subMap.put("apple",1);
        subMap.put("orange",2);
        map.putAll(subMap);
        System.out.println("the map after inserting: "+ map);
        //{orange=2, apple=1, fruit=0, tree=11}

        int val1= map.get("apple");//1
        int val2= map.getOrDefault("orange",0);//2

        if(map.containsKey(("apple"))){
            System.out.println(val1);
        }
        if(map.containsValue(val2)){
            System.out.println(val2);
        }

        if(!map.isEmpty()){
            for(String key: map.keySet()){
                System.out.println(key);
            }
            System.out.println(map.keySet());//[orange, apple, fruit, tree]
            for(int val: map.values()){
                System.out.println(val);
            }
            System.out.println(map.values());//[2, 1, 0, 11]
        }
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
     *
     * remove(Object key)
     * remove(Object key, Object value)
     *
     * compute(Key, BiFunction)
     * computeIfAbsent(Key, Function)
     * computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map= new HashMap<>();
        map.put("fruit", 0);
        map.putIfAbsent("fruit", 00);
        map.putIfAbsent("tree", 11);
        map.put("orange",2);
        System.out.println("the original map: "+ map );

        map.replace("orange", 2, 6);
        System.out.println("the map after replace orange value 2 with 6: "+ map);

        //map.replace("orange",66);//{orange=66, fruit=0, tree=11}
        System.out.println("the map after replace orange value with 66: "+ map);

        map.replaceAll((key,val) -> val+1);//{orange=67, fruit=1, tree=12}
        System.out.println("the current map after replaceAll((key, val) -> val + 1): " + map);

        map.replaceAll((key,val)-> 100);// {orange=100, fruit=100, tree=100}
        System.out.println("the current map after replaceAll((key, val) -> 66): " + map);

        map.remove("fruit");
        map.remove("tree",11);//tree is not removed
        System.out.println("Map after removing: "+ map);//{orange=100, tree=100}

        // compute method can change value but not key
        map.compute("orange", (key,val)-> val== null? 0: val+1);
        System.out.println("Map after map.computing orange: "+ map);

        map.compute("peach", (key,val)-> val== null? 0: val+1);//peach will be added
        System.out.println("Map after map.computing peach: "+ map);
        //{orange=101, peach=0, tree=100}

        map.computeIfAbsent("grape", val ->Integer.valueOf(5));
        //{orange=101, peach=0, tree=100, grape=5}
        map.computeIfAbsent("orange", val-> Integer.valueOf(0));
        //{orange=101, peach=0, tree=100, grape=5}
        System.out.println("Map after map.computeIfAbsent: "+ map);

        map.computeIfPresent("grape", (key,val)->val+1);
        map.computeIfPresent("banana", (key,val)->111);
        System.out.println("Map after map.computeIfPresent: "+ map);
        //{orange=101, peach=0, tree=100, grape=6}
    }
}
