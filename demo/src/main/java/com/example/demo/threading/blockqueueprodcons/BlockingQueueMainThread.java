package com.example.demo.threading.blockqueueprodcons;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class BlockingQueueMainThread {
    public static void main(String args[]){
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(1);
        SynchronousQueue<Integer> q = new SynchronousQueue<>();
        ConsumerThread consumerThread = new ConsumerThread(blockingQueue);
        ProducerThread producerThread = new ProducerThread(blockingQueue);
        consumerThread.start();
        producerThread.start();
    }
}
