package com.example.demo.sorting;

public class BubbleSort implements Sorting{

    @Override
    public int[] sort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        //{10,11,12,9,8.7}
        return a;
    }
}
