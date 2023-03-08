package com.nafi.advanced.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class SynchronizedCollections {
    public static void show() {
        Collection<Integer> collection = new ArrayList<>();

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1,2,3));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4,7,3));
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
