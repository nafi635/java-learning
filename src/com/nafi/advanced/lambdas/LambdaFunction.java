package com.nafi.advanced.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFunction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6));
        printList((ArrayList<Integer>) list);
        int sum = list.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum);

    }

    //Method referrence
    public static void printList(ArrayList<Integer> list) {
        list.forEach((element) -> System.out.println(element));
    }

}
