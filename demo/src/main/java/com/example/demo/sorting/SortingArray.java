package com.example.demo.sorting;

public class SortingArray {
    public static void main(String args[]){
       // Sorting sorting = new InsertionSort();

        Sorting sorting = new QuickSort();
        int a[]={2,4,1,7,5,9,6};
        a=sorting.sort(a);
        for (int n:a) {
            System.out.println(n);
        }
    }
}
