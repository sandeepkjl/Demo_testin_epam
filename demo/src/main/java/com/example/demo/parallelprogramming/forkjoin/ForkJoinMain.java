package com.example.demo.parallelprogramming.forkjoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(4, 8, 1, 9, 5, 7, 11, 10);

        ForkJoinRecursiveTask forkJoinRecursiveTask = new ForkJoinRecursiveTask(list);

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        int min = forkJoinPool.invoke(forkJoinRecursiveTask);

        System.out.println(min);
    }
}
