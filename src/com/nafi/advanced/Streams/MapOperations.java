package com.nafi.advanced.Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class MapOperations {
    public static void main(String[] args) {
        Stream<Integer> interStream = Stream.of(1,2,3);

        interStream.map(key -> key + "Nafi").forEach(System.out :: println);

        var stream = Stream.of(List.of(23,4,5,6), List.of(4,5,6));

//        Set<Integer> integerSet = stream.flatMap(list -> list.stream());

    }
}
