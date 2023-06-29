package com.example.demo.slidingwindow;

public class FindTheMaxSubArrayOfKSum {
    public static void main(String args[]) {

        int[] arr = {1,1, 1, 1, 2, 3};

        int res = getMaxSumArrayOfSumK(arr, 5);

        System.out.println(res);

    }

    public static int getMaxSumArrayOfSumK(int[] arr, int k) {
        int maxSize = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < arr.length) {
            if (sum < k) {
                sum = sum + arr[j];
                j++;
            } else if (sum > k) {
                while (sum > k) {
                    sum = sum - arr[i];
                    i++;
                }
                //j++;
            } else {
                if (maxSize < j - i + 1) {
                    maxSize = j - i + 1;
                }
                j++;
            }
        }
        if(maxSize<j-1+1)
            maxSize=j-i+1;
        return maxSize;
    }



}
