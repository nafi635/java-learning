package com.nafi.advanced.Streams;

import java.util.stream.Stream;

public class SlicingStreams {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,3,4);
        stream.skip(2).forEach(System.out::println);

        stream.sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);

        var element = stream.reduce((a,b) -> a* b).get();

        var element2 = stream.reduce(Integer::sum).get();  // Method Referrence
    }
}
