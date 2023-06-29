package com.example.demo.threading.semaphore;

public class WishMainThread {

    public static void main(String args[]){
        DisplayResource displayResource = new DisplayResource();
        RohanWishThread gm = new RohanWishThread(displayResource);
        SandeepWishThread gn = new SandeepWishThread(displayResource);
        AnkitaWishThread ge = new AnkitaWishThread(displayResource);

        gm.start();
        gn.start();
        ge.start();

    }
}
