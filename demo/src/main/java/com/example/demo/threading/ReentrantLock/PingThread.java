package com.example.demo.threading.ReentrantLock;

public class PingThread extends Thread {
    PingPongResource pingPongResource;
    String msg;

    public PingThread(PingPongResource pingPongResource, String msg) {
        this.pingPongResource = pingPongResource;
        this.msg = msg;
    }

    public void run() {
        pingPongResource.display(msg);
    }


}
