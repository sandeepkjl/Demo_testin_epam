package com.example.demo.threading.pingpong;

public class PingPongResource {

    boolean pingPrinted = false;

    public void printPing(String msg) throws InterruptedException {
        synchronized (this) {

            while (true) {
                if (pingPrinted == true) {
                    wait();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println(msg);
                }
                pingPrinted = true;


                notify();
            }
        }


    }

    public void printPong(String msg) throws InterruptedException {
        synchronized (this) {

            while (true) {
                if (pingPrinted == false) {
                    wait();
                }

                for (int i = 0; i < 3; i++) {
                    System.out.println(msg);
                }
                pingPrinted = false;


                notify();
            }

        }

    }
}

