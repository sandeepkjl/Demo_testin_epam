package com.example.demo.threading.blockqueueprodcons;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerThread extends Thread {
    BlockingQueue<Integer> blockingQueue;

    public ProducerThread(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run()  {
        while(true) {

            Random random = new Random();
            int num = random.nextInt();
            System.out.println("Number putting in the blocking queue :" + num);
            try {
                blockingQueue.put(num);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
