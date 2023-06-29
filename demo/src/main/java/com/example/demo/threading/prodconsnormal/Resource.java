package com.example.demo.threading.prodconsnormal;

public class Resource {
    public static int c;
    public static boolean updated = false;

    public void produce() throws InterruptedException {
        while(true) {
            synchronized (this) {
                if(updated){
                    wait();
                }
                c++;
                System.out.println("Produce : " + c);
                Thread.sleep(1000);
                updated=true;
                notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (!updated)
                    wait();
                System.out.println("Consume : " + c);
                Thread.sleep(1000);
                updated=false;
                notify();
            }
        }
    }
}

