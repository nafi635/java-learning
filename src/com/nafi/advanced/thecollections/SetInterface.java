package com.nafi.advanced.thecollections;

import java.util.*;

//Set intitialization can take, collection or list or nothing
//Print this class
public class SetInterface {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(); // We use 90 percent of the time
        stringSet.add("sky");
        stringSet.add("is");
        stringSet.add("blue");
        stringSet.add("blue");    // It doesn't take duplicate values
        stringSet.add(null);
        System.out.println(stringSet + "Printing elements for next row");


        Iterator<String> stringIterator= stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        System.out.println(stringSet.contains(null));

        Set<String> stringSet1 = new HashSet<>(Arrays.asList("a","b","c")); // list as a parameter
        stringSet1.forEach(System.out::println);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.forEach(System.out::println);

        Set<Size> enumSet = EnumSet.allOf(Size.class);   // It set of enums
        enumSet.forEach(System.out :: println);

        EnumSet<Size> enumSet1 = EnumSet.noneOf(Size.class);   // It creates an empty system array
        enumSet1.forEach(System.out :: println);


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.forEach(System.out::println);

    }

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
}
