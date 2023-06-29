package com.example.demo.threading.pingpong;

public class PongThread extends Thread {

    String msg;

    PingPongResource pingPongResource;

    public PongThread(String msg, PingPongResource pingPongResource) {
        this.msg = msg;
        this.pingPongResource = pingPongResource;
    }

    public void run() {
        try {
            pingPongResource.printPong(msg);

        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
