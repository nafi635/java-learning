package com.nafi.advanced.multithreading;

public class ThreadInterrupt {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        //Interrupting a thread
        thread.interrupt();
    }
}
