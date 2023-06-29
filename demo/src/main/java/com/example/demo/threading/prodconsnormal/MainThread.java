package com.example.demo.threading.prodconsnormal;

public class MainThread {
    public static void main(String args[]) {
        Resource resource = new Resource();
        ProducerThread producerThread = new ProducerThread(resource);
        ConsumerThread consumerThread = new ConsumerThread(resource);

        producerThread.start();
        consumerThread.start();
    }


}
