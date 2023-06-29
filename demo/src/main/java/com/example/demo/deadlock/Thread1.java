package com.example.demo.deadlock;

public class Thread1 extends Thread{



    public void run(){
        synchronized (Resource.firstName){
            System.out.println("Acquired lock for firstName by thread 1");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Resource.lasName){
                System.out.println("Acquired lock on lastName by thread 1");
            }

        }
    }

}
