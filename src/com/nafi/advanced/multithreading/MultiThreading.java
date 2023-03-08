package com.nafi.advanced.multithreading;

import javax.swing.plaf.TableHeaderUI;

public class MultiThreading {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());


        System.out.println(Thread.currentThread().getName());


        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.sleep(5000);
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i=0;i<100;i++) {
            Thread thread1 = new Thread(new DownloadFileTask());
            thread1.start();
        }

        thread.setPriority(4);
    }
}
