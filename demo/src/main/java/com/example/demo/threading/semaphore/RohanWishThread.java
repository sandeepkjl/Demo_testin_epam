package com.example.demo.threading.semaphore;

public class RohanWishThread extends Thread{
    DisplayResource resource;



    public RohanWishThread(DisplayResource resource) {
        this.resource = resource;
    }

    public void run(){
        try {
            resource.wish("Rohan");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
