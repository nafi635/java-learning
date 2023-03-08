package com.nafi.advanced.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFutures {
    public static void main(String[] args) {
        ForkJoinPool.commonPool();
        // var future =  CompletableFuture.runAsync();
        Supplier<Integer> task = () -> 1;
        var futureSupplier =  CompletableFuture.supplyAsync(task);


    }
}
