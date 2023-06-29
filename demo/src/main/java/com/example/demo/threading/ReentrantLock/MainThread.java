package com.example.demo.threading.ReentrantLock;

public class MainThread {
    public static void main(String args[]) {
        PingPongResource pingPongResource = new PingPongResource();

        PingThread pingThread = new PingThread(pingPongResource, "Ping....");
        PongThread pongThread = new PongThread(pingPongResource, "Pong");

        pingThread.start();
        pongThread.start();

    }

}
