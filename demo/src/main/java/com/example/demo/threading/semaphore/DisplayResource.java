package com.example.demo.threading.semaphore;

import java.util.concurrent.Semaphore;

public class DisplayResource {

    Semaphore binarSemaphore = new Semaphore(1);

    public void wish(String msg) throws InterruptedException {
        binarSemaphore.acquire();
        for(int i=0;i<5;i++) {
            System.out.println("Good Morning :"+msg);
        }
        binarSemaphore.release();
    }
}
