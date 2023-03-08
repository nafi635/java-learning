package com.nafi.advanced.thecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
        show();
    }

    public static void show() {

        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        System.out.println(collection);

        Collections.addAll(collection, "a","b");  // You can add multiple elements
        printCollection(collection);

        collection.remove("A");
        printCollection(collection);

        Object[] objects = collection.toArray();

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        list.remove(0);
        System.out.println(list);

    }

    public static void printCollection(Collection collection) {
        System.out.println(collection);
    }
}
