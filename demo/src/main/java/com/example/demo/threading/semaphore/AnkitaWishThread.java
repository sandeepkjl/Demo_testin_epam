package com.example.demo.threading.semaphore;

public class AnkitaWishThread extends Thread{

    DisplayResource displayResource;

    public AnkitaWishThread(DisplayResource displayResource) {
        this.displayResource = displayResource;
    }

    public void run(){
        try {
            displayResource.wish("Ankita");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
