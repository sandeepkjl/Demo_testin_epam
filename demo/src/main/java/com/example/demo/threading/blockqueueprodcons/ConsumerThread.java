package com.example.demo.threading.blockqueueprodcons;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread  extends Thread{

    BlockingQueue<Integer> blockingQueue;

    public ConsumerThread(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("consuming : " + blockingQueue.take());
                sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
