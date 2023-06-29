package com.example.demo;

public interface AnInterface {
    int sum(int a, int b);
    default int subtract(int a, int b) {
        return a - b;
    }
}
