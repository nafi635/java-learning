package com.nafi.advanced.executors;

public class Executors {
    public static void main(String[] args) {
        var executor = java.util.concurrent.Executors.newFixedThreadPool(2);
        for (int i=0;i<10;i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
