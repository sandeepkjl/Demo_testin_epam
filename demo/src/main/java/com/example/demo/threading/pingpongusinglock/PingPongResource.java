package com.example.demo.threading.pingpongusinglock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PingPongResource {

    static Lock lock = new ReentrantLock();

    static boolean pingPrinted=false;
    Condition pingCondition = lock.newCondition();
    Condition pongCondition = lock.newCondition();


    public void displayPing(String msg) throws InterruptedException {
        while (true) {
            lock.lock();
            try {
                if (pingPrinted) {
                    pingCondition.await();
                }
                Thread.sleep(1000);
                System.out.println(msg);
                pingPrinted = true;
                pongCondition.signal();
            }
            finally {
                lock.unlock();
            }
        }
    }



    public void displayPong(String msg) {
        while (true) {
            lock.lock();
            try {
                if (!pingPrinted) {
                    pongCondition.await();
                }
                System.out.println(msg);
                Thread.sleep(1000);
                pingPrinted = false;
                pingCondition.signal();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }

    }
}
