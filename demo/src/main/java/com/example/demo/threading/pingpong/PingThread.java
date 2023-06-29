package com.example.demo.threading.pingpong;

public class PingThread extends Thread {
    String msg;


    private PingPongResource pingPongResource;

    public PingThread(String msg, PingPongResource pingPongResource) {
        this.msg = msg;
        this.pingPongResource = pingPongResource;
    }

    public void run() {
        try {
            pingPongResource.printPing(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
