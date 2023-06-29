package com.example.demo.threading.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PingPongResource {

    static Lock lock = new ReentrantLock();

    public void display(String msg) {
        lock.lock();
        for (int i = 0; i < 20; i++) {
            System.out.println(msg);
        }
        lock.unlock();
    }
}
