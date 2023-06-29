package com.example.demo.threading.conpordqueue;

import java.util.Queue;

public class ConsumerThread extends Thread {
    public Queue queueResource;

    public ConsumerThread(Queue queueResource) {
        this.queueResource = queueResource;
    }

    public void run() {

        while (true) {
        synchronized (queueResource) {

                System.out.println("in consume");
                while (queueResource.isEmpty()) {

                    try {
                        queueResource.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            System.out.println("Consumed Number : " + queueResource.remove());
            queueResource.notify();
            }
        }
    }
}
