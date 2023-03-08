package com.nafi.advanced.thecollections;

public class IteratorMain {
    public static void main(String[] args) {
        var list = new ListGeneric<String>();
        var iterator = list.iterator();    // Iterator
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        // Even for each loop also implements iterable,
        // But
    }
}
