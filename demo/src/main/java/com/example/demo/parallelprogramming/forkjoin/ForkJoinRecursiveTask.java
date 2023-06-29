package com.example.demo.parallelprogramming.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class ForkJoinRecursiveTask extends RecursiveTask<Integer> {
    List<Integer> list;

    public ForkJoinRecursiveTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() > 1) {
            int mid = list.size() / 2;

            ForkJoinRecursiveTask forkJoinRecursiveTaskLeft =
                    new ForkJoinRecursiveTask(list.subList(0, mid));
            forkJoinRecursiveTaskLeft.fork();

            ForkJoinRecursiveTask reightTask =
                    new ForkJoinRecursiveTask(list.subList(mid, list.size()));

            int minLeft = forkJoinRecursiveTaskLeft.join();
            int minRight = reightTask.compute();

            if(minLeft>minRight)
                return minRight;
            else
                return minLeft;


        } else {
            return list.get(0);
        }

    }
}
