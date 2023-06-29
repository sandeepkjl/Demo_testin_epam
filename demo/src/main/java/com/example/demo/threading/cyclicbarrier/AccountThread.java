package com.example.demo.threading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class AccountThread extends Thread {
    CyclicBarrier cyclicBarrier;

    public AccountThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
        try {
            System.out.println("Print account details:");
            System.out.println("Account holder Name : Sandeep Patel");
            System.out.println("Account holder age : 26");
            System.out.println("Account holder city : gkp");
            cyclicBarrier.await();
            System.out.println("Account Balance : 26000 rs");
            System.out.println("Account type : Saving");
            cyclicBarrier.await();
            System.out.println("Acoount Details Printed Successfully");
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("InterruptedException");
            throw new RuntimeException();
        }
    }

}
