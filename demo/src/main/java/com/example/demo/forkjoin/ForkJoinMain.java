package com.example.demo.forkjoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {
    public static void main(String args[]){
        List<String> list = Arrays.asList("Sandeep","Karan","Ankita","Rohan","Ritesh");
        ForkJoinRecursiceTask forkJoinRecursiceTask = new ForkJoinRecursiceTask(list);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(forkJoinRecursiceTask);

    }
}
