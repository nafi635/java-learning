package com.nafi.advanced.Streams;

import com.sun.jdi.request.StepRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,23,4,5);
        Predicate<Integer> element = (a) -> a > 4;
        System.out.println(list.stream().filter(element).count());;
        list.forEach(System.out::println);
        List<Integer> newIntegers = list.stream().filter(element).collect(Collectors.toList());
        newIntegers.forEach(System.out::println);
        System.out.println(list.stream().filter(num -> num > 10));


        Stream.Builder<String> stringStream = Stream.builder();
        stringStream.add("Nafi");
        stringStream.add("nafi");

        Stream<String> stream = stringStream.build();
        stream.forEach(System.out::println);


        Integer[] array = new Integer[] {1, 2, 3, 4, 5};
        Stream<Integer> integerStream = Arrays.stream(array);

        System.out.println("Square roots Numbers");
        List<Integer> rootNumbers = Stream.iterate(1, n -> n*2).limit(10).collect(Collectors.toList());
        rootNumbers.forEach(System.out::println);

        System.out.println("Even Numbers");
        List<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(10).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
    }
}
