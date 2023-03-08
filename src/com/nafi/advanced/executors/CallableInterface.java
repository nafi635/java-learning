package com.nafi.advanced.executors;

import java.util.concurrent.Callable;

public class CallableInterface implements Callable<Integer> {
    int number;
    public Integer call()  {
        int fact = 1;
        // ...
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}
