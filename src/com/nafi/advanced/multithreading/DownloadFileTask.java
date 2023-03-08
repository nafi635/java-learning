package com.nafi.advanced.multithreading;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Implementing runnable class"+ Thread.currentThread().getName());

        for(var i=0; i< Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted())
                return;
            System.out.println("Downloadina byt"+ i);
        }
    }
}
