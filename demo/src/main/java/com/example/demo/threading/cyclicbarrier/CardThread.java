package com.example.demo.threading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CardThread extends Thread {

    CyclicBarrier cyclicBarrier;

    public CardThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
        try {
            System.out.println("Card details:");
            System.out.println("Card holder Name : Sandeep Kumar Patel");
            System.out.println("Account holder age : 26");
            System.out.println("Account holder city : gkp");
            cyclicBarrier.await();
            System.out.println("Card Limt Balance : 20000 rs");
            System.out.println("Card type : MasterCard");
            cyclicBarrier.await();
            System.out.println("Card Details Printed Successfully");
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("InterruptedException");
            throw new RuntimeException();
        }
    }
}
