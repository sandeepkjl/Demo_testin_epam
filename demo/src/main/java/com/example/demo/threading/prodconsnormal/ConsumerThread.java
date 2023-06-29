package com.example.demo.threading.prodconsnormal;

import java.util.concurrent.locks.Lock;

public class ConsumerThread extends Thread {
    Resource resource;


    public ConsumerThread(Resource resource) {
        this.resource = resource;
    }

    public void run(){
        try {
            resource.consume();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
