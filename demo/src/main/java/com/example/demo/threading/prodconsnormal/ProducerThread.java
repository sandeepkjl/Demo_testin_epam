package com.example.demo.threading.prodconsnormal;

public class ProducerThread extends Thread{

    Resource resource;

    public ProducerThread(Resource resource) {
        this.resource = resource;
    }

    public void run(){
        try {
            resource.produce();
            sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
