package org.example.StreamApi;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {

    @Test
    public void testCollection(){
        List<Integer> c = Arrays.asList(1, 2, 3, 4, 6);
        c.forEach(System.out::println);

        Stream<Integer> stream = c.stream();
        System.out.println("Stream object: "+ stream);
        //Stream object: java.util.stream.ReferencePipeline$Head@7c53a9eb

        Stream<Integer> parallelStream = c.parallelStream();
        System.out.println("Parallel Stream object: "+ parallelStream);
        //Parallel Stream object: java.util.stream.ReferencePipeline$Head@ed17bee

    }

    @Test
    public void testArray(){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);
        System.out.println("Stream object: "+ stream);
        //Stream object: java.util.stream.IntPipeline$Head@4e515669

        Employee a = new Employee(1, "Tom", 20, 2222 );
        Employee b = new Employee(2, "Jerry", 22, 2500 );
        Employee[] arr1 = new Employee[]{a, b};
        Stream<Employee> stream1 = Arrays.stream(arr1);
        System.out.println("Stream object: "+ stream1);
        //Stream object: java.util.stream.ReferencePipeline$Head@17d10166
    }

    @Test
    public void testOf(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 6);
        System.out.println("Stream object: "+ stream);
        //Stream object: java.util.stream.ReferencePipeline$Head@3b764bce
    }

    @Test
    public void testIterate(){
        //initial value(seed) = 0
        //print 10 elements
        Stream.iterate(0, t -> t+4).limit(10).forEach(System.out::println);
    }

    @Test
    public void testGenerate(){
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        // 10 "element"
        Stream<String> streamG = Stream.generate(() -> "element").limit(10);
        streamG.forEach(System.out::println);
    }

    @Test
    public void testBuilder(){
        //a, b, c
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
        streamBuilder.forEach(System.out::println);
    }

    @Test
    public void testStreamOfPrimitives(){
       IntStream intStream = IntStream.range(1, 5);//not include 5
       LongStream longStream = LongStream.rangeClosed(1, 5);

       System.out.println("Stream object: "+ intStream);
       intStream.forEach(System.out::println);

       System.out.println("Stream object: "+ longStream);
       longStream.forEach(System.out::println);

    }








}
