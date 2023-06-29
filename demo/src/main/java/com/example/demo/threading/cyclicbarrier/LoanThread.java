package com.example.demo.threading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class LoanThread extends Thread{
    CyclicBarrier cyclicBarrier;

    public LoanThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
        try {
            System.out.println("Loan details:");
            System.out.println("Loan holder Name : Sandeep Kumar Patel");
            System.out.println("Loan holder age : 26");
            System.out.println("Loan holder city : gkp");
            cyclicBarrier.await();
            System.out.println("Loan Balance : 400000 rs");
            System.out.println("Loan type : Peasonl");
            cyclicBarrier.await();
            System.out.println("Loan Details Printed Successfully");
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("InterruptedException");
            throw new RuntimeException();
        }
    }
}
