package com.nafi.advanced.lambdas;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(10);

        List<String> list = List.of("a","b","c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUpperCase));  // Sequenctial pringing, Consumer have this andThen method

        Supplier<Double> getRandom = () -> Math.random();  // Supplier, it just supplies the vlaue
        var random = getRandom;

        Function<String, String> consumer1 = (value) -> value.replace(":", "=") ;
        Function<String, String> consumer2 = str -> "{" + str + "}";

        var result = consumer1.andThen(consumer2).apply("Key:value");
        System.out.println(result);

        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println( isLongerThan5.test("Test"));

        BinaryOperator<Integer> add = (a,b) -> a+b;   // IntBinaryOperator
        var sum = add.apply(1,2);

        Function<Integer, Integer> square = (a) -> a* a;

        System.out.println(add.andThen(square).apply(10,10));

        UnaryOperator<Integer> square1 = (a) -> a* a;   // Unary operator
        var square2 = square1.apply(2);
        System.out.println("Square " + square2);
    }
}
