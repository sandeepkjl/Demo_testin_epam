/*
package com.example.demo.threading.volatilevisibilty;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueResource {
    Queue<Integer> queue = new LinkedList<>();

    public void produce() {
        System.out.println("Produce Running");
        while (queue.size() == 3) {
            Random random = new Random();
            Integer e = random.nextInt();
            System.out.println("added Value: "+ e);
            queue.add(e);
        }
    }

    public void c

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }
}
*/
