package com.example.demo.threading.semaphore;

public class SandeepWishThread extends Thread{

    DisplayResource displayResource;

    public SandeepWishThread(DisplayResource displayResource) {
        this.displayResource = displayResource;
    }

    public void run(){
        try {
            displayResource.wish("Sandeep");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
