package com.example.demo.threading.ReentrantLock;

public class PongThread extends Thread {
    String msg;
    PingPongResource pingPongResource;

    public PongThread(PingPongResource pingPongResource, String msg) {
        this.msg = msg;
        this.pingPongResource = pingPongResource;
    }

    public void run() {
        pingPongResource.display(msg);
    }
}
