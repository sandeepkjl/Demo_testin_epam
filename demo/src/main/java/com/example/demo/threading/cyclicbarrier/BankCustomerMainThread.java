package com.example.demo.threading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class BankCustomerMainThread {

    public static void main(String args[]){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        AccountThread accountThread = new AccountThread(cyclicBarrier);
        CardThread cardThread = new CardThread(cyclicBarrier);
        LoanThread loanThread = new LoanThread(cyclicBarrier);

        accountThread.start();
        cardThread.start();
        loanThread.start();
    }
}
