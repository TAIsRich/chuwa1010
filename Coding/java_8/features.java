package com.chuwa.hw4_1019.Coding.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Chenyu
 * @date 10/20/22
 */

public class features {
    public static void main(String[] args) {
        //create stream
        int[] arr = new int[]{1, 4, 2, 5, 3};
        IntStream s1 = Arrays.stream(arr);
        IntStream s11 = Arrays.stream(arr, 1 ,3);

        List<Integer> list = new ArrayList<Integer>();
        for(int num : arr) {
            list.add(num);
        }
        Stream<Integer> s2 = list.stream();

        Stream<String> s3 = Stream.of("1", "2", "3");

        //stream api
        //filter: intermediate operation
        //collect: termination
        Integer[] evenNumArr = s2.filter(num -> num%2==0).toArray(Integer[]::new);
        List<Integer> evenNumList = s2.filter(num -> num%2==0).collect(Collectors.toList());

        //empty stream
        Stream<String> streamEmpty=Stream.empty();
    }
}
