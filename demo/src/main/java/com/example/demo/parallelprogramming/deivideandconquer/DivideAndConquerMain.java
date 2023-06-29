package com.example.demo.parallelprogramming.deivideandconquer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DivideAndConquerMain {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        int a[] = {4,8,1,9,5,7,11,10};
        int minimum = findMinimum(a,0,a.length-1);

        System.out.println(minimum);


    }

    public static int findMinimum(int a[],int start, int end) throws ExecutionException, InterruptedException {
        if (start < end) {
            int mid = (start + end) / 2;
            ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            Future<Integer> min1F = service.submit(()->findMinimum(a, start, mid));

            Future<Integer> min2F = service.submit(()->findMinimum(a, mid + 1, end));

            int min1= min1F.get();
            int min2 =min2F.get();



            if (min1 < min2)
                return min1;
            else
                return min2;
        } else {
            System.out.println(Thread.currentThread().getName()+" : "+a[start]);
            return a[start];
        }

    }


}
