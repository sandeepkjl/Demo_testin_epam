package com.example.demo.threading.conpordqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueResource {
    public static  Queue<Integer> queue = new LinkedList<>();




    public void produce() throws InterruptedException {
        System.out.println("producing in the queue");
        while (queue.size() < 3) {
            Random random = new Random();
            System.out.println("produced number : " + queue.add(random.nextInt()));

        }
    }

    public void consume() throws InterruptedException {
        System.out.println("consuming in the key");
        while (!queue.isEmpty()) {
            System.out.println("Consumed Number : " + queue.remove());
        }

    }

    public static Queue<Integer> getQueue() {
        return queue;
    }

    public static void setQueue(Queue<Integer> queue) {
        QueueResource.queue = queue;
    }


}
