package com.example.demo.threading.conpordqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ProdConsMain {
    public static void main(String args[]){
        Queue queueResource = new LinkedList();
        ProducerThread producerThread = new ProducerThread(queueResource);
        ConsumerThread consumerThread = new ConsumerThread(queueResource);

        producerThread.start();
        consumerThread.start();

    }
}
