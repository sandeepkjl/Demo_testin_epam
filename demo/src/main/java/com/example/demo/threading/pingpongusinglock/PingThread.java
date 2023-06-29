package com.example.demo.threading.pingpongusinglock;

public class PingThread extends Thread {
    PingPongResource pingPongResource;
    String msg;

    public PingThread(PingPongResource pingPongResource, String msg) {
        this.pingPongResource = pingPongResource;
        this.msg = msg;
    }

    public void run() {
        try {
            pingPongResource.displayPing(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
