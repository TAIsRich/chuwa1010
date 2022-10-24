package org.example.StreamApi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
    @Test
    public void testMapAndFlatMap() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("world");

        List<String> stringList = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                        .distinct()
                        .collect(Collectors.toList());
        stringList.forEach(e -> System.out.println(e));
        //helo wrd

    }

    @Test
    public void testMapAndFlatMap2() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("world");

        List<Stream<String>> collect = words.stream()
                .map(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(e -> System.out.println(e));//java.util.stream.ReferencePipeline$Head@61064425......
        System.out.println("@@@@@@@stream objects above, following character@@@@@@@@@");
        for (Stream<String> stringStream : collect) {
            stringStream.forEach(System.out::println);
        }
    }
}
