package streamApi;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApiCreationTest {

    @Test
    public void testCollection(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);
        // 返回一个顺序流
        Stream<Integer> stream = list.stream();
        System.out.println(stream);
        // 返回一个并行流

        Stream<Integer> stream1 = list.parallelStream();
        System.out.println(stream1);

    }
    @Test
    public void testArrays() {
        //Arrays.stream
        int[] arr = new int[]{1, 2, 3, 5, 6};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }
    @Test
    public void testOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Stream object:      " + stream);
    }
    @Test
    public void testGenerate() {
        /**
         * call Math.random() 10 times
         * limit(10)
         */
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(System.out::println);
    }
    @Test
    public void testBuilder() {
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println("Stream Object:  " + streamBuilder);
        streamBuilder.forEach(System.out::println);
    }

    @Test
    public void testStreamOfPrimitives() {
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        System.out.println("Stream Object:  " + intStream);
        intStream.forEach(System.out::println);

        System.out.println("Stream Object:  " + longStream);
        longStream.forEach(System.out::println);
    }

}
