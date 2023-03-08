package com.nafi.advanced.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableInterface factorialTask = new CallableInterface();
        Future<Integer> factorialFuture  = executorService.submit(factorialTask); // Callable interface returns Generic value and also returns Future

        var executor = Executors.newFixedThreadPool(2);
        try {
            var future = executor.submit(() -> {
                LongTask.simulate();
            });
        }
        finally {
            executor.shutdown();  //It shuts down the operation
        }

        var service = new MailService();
//        service.send();
//        System.out.println("Hello World");

        service.sendAsync();
        System.out.println("Hello World");
    }
}
