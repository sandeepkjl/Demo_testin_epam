package com.example.demo.divideandconquer;

public class FindMinimum {
    public static void main(String args[]) {
        int[] arr = {7, 9, 4, 10, 14, 19, 20, 33, 44};
        int minimum = findMinimumElement(arr,0,arr.length-1);

        System.out.println(minimum);
    }

    public static int findMinimumElement(int arr[], int start, int end){
        if(start>=end){
            return arr[start];
        }
        int mid = (start+end)/2;
        int min1 = findMinimumElement(arr,0,mid);
        int min2 = findMinimumElement(arr,mid+1,end);

        if(min1<min2){
            return min1;
        }else{
            return min2;
        }
    }
}
