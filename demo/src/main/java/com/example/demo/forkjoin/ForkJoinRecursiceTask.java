package com.example.demo.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinRecursiceTask extends RecursiveTask<List<Integer>> {
    List<String> list;

    public ForkJoinRecursiceTask(List<String> list) {
        this.list = list;
    }

    @Override
    protected List<Integer> compute() {
        if (list.size() <= 1) {

            list.forEach(e -> System.out.println(e.toUpperCase()));

        }

        int mid = (list.size()) / 2;
        ForkJoinTask<List<Integer>> leftInputList =
                new ForkJoinRecursiceTask(list.subList(0, mid)).fork();
        list = list.subList(mid, list.size());

        List<Integer> rightResult = compute();

        List<Integer> leftResult = leftInputList.join();

        leftResult.addAll(rightResult);

        return null;
    }
}


