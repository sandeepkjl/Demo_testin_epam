package com.example.demo.sorting;

public class InsertionSort implements Sorting{

    @Override
    public int[] sort(int a[]) {
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j=i;
            while(j>0 && a[j-1]>key){
                    a[j]=a[j-1];
                    j--;
                }
            a[j]=key;

            }
        return a;
        }



}
//4,3,5,6,1