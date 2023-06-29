package com.example.demo.maximumsubarray;

public class KadanesAlgo {
    public static void main(String args[]) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSumArray(arr, 0, arr.length);
        System.out.println(result);

    }

    private static int maxSumArray(int[] arr, int start, int end) {
        int maxSum = 0;
        for (int i = start; i < end; i++) {
            int currSum = 0;
            for (int j = i; j < end; j++) {
                currSum = currSum + arr[j];
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }
        return maxSum;
    }
}
