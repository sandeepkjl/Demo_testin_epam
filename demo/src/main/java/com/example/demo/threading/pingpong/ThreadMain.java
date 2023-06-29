package com.example.demo.threading.pingpong;

public class ThreadMain {
    public static void main(String args[]) {
        PingPongResource pingPongResource = new PingPongResource();
        PingThread pingThread = new PingThread("ping",pingPongResource);
        PongThread pongThread = new PongThread("pong", pingPongResource);
        pingThread.start();
        pongThread.start();
    }
}
