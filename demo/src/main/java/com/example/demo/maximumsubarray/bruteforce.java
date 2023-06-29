package com.example.demo.maximumsubarray;

public class bruteforce {

    public static void main(String args[]) {
        int[] arr = {5,4,-1,7,8};
        int result = maxSumArray(arr, 0, arr.length);
        System.out.println(result);

    }

    private static int maxSumArray(int[] arr, int start, int end) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = start; i < end; i++) {
            currSum = currSum + arr[i];
            if (currSum > maxSum)
                maxSum = currSum;
            if(currSum<0)
                currSum=0;
        }
        return maxSum;

    }
}
