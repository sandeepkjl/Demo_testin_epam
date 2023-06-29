package com.example.demo.deadlock;

public class Thread2 extends Thread{

    public void run(){
        synchronized (Resource.lasName){
            System.out.println("acquired lock on last name thread 2");

            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (Resource.firstName){
                System.out.println("Acquired lock on firstName thread 2");

            }
        }
    }
}
