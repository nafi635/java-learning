package com.nafi.advanced.thecollections;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"Nafi");
        integerStringMap.put(2,"Nazzu");
        integerStringMap.put(3,"Nazeem");
        integerStringMap.put(null,"Zazeem");
        integerStringMap.put(null,"Zazeem");  // It allows only one null value, duplicating null values ..No exception
        System.out.println(integerStringMap.get(3));
        System.out.println(integerStringMap.toString());

        for(var key : integerStringMap.keySet()) {
            System.out.println(key);
        }

        for(var value : integerStringMap.values()) {
            System.out.println(value);
        }

        Map<Integer,String> integerStringMap1 = new TreeMap<>();
        integerStringMap1.put(5,"Nafi");
        integerStringMap1.put(2,"Aazzu");
        integerStringMap1.put(3,"Zazeem");
        //integerStringMap1.put(null,"Zazeem");   // Run time error
        System.out.println(integerStringMap1.toString());

        SortedMap<Integer,String> integerStringMap2 = new TreeMap<>();
        integerStringMap2.put(5,"Nafi");
        integerStringMap2.put(2,"Aazzu");
        integerStringMap2.put(3,"Zazeem");
        System.out.println(integerStringMap2.toString());



    }
}
