package com.example.demo.threading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class FullNameMainThread {
    public static void main(String args[]) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Thread firstName = new Thread(()-> {
            System.out.println("Sandeep");
            countDownLatch.countDown();
        });
        Thread mName = new Thread(()-> {
            System.out.println("Kumar");
            countDownLatch.countDown();
        });
        Thread lastName = new Thread(()-> {
            System.out.println("Patel");
            countDownLatch.countDown();
        });

        firstName.start();;
        mName.start();
        lastName.start();

        countDownLatch.await();
        System.out.println("full name printed");



    }
}
