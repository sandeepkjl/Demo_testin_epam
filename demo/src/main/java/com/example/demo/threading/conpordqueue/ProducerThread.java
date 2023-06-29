package com.example.demo.threading.conpordqueue;

import java.util.Queue;
import java.util.Random;

public class ProducerThread extends Thread {
    public Queue queueResource;

    public ProducerThread(Queue queueResource) {
        this.queueResource = queueResource;
    }

    public void run() {
        while (true) {

            synchronized (queueResource) {

                while (queueResource.size() == 3) {
                    try {
                        queueResource.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                Random random = new Random();
                int i=random.nextInt();
                queueResource.add(i);
                System.out.println("produced number : " + i);
                queueResource.notify();


            }
        }
    }

}
