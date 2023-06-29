package com.example.demo.controller;

public class IndexOfElement {
    public static void main(String args[]) {
        int arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};
        System.out.println(binarySearch(arr, 111, 0, arr.length - 1));
    }

    public static int binarySearch(int ar[], int key, int start, int last) {
        while (start <= last) {
            int mid = (start + last) / 2;
            if (ar[mid] == key) {
                return mid;
            } else if (ar[mid] > key) {
                last = mid - 1;
            } else {
                start = start + 1;
            }
        }
        return -1;
    }

}
