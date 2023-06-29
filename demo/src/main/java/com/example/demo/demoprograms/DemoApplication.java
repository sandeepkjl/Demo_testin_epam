package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        int A[] = {1, 3, 15, 11, 2};
        int B[] = {23, 127, 235, 19, 8};

        int min = findSmallestDifference(A, B, A.length, B.length);
        System.out.println(min);


    }


    public static int findSmallestDifference(int[] A, int[] B, int m, int n) {
        int minDiff = Integer.MAX_VALUE; // Initialize with maximum integer value
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int diff = Math.abs(A[i] - B[j]); // Calculate absolute difference
                if (diff < minDiff) {
                    minDiff = diff; // Update smallest difference found so far
                }
            }
        }
        return minDiff;
    }
}