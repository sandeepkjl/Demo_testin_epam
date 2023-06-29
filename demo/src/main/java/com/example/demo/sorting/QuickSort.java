package com.example.demo.sorting;

public class QuickSort implements Sorting{

    @Override
    public int[] sort(int[] a) {
      quickSort(a,0,a.length-1);
      return a;
    }

    public void quickSort(int a[],int start, int end){
        if(start<end){
            int pivot=partition(a,start,end);
            quickSort(a,0,pivot-1);
            quickSort(a,pivot+1,end);
        }
    }

    public int partition(int a[], int start, int end){
        int pivot = end;
        int j=start;

        for(int i=start;i<end;i++ ){
            if(a[pivot]>a[i]){
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
        }

        int t = a[pivot];
        a[pivot]=a[j];
        a[j]=t;

        return j;
    }
}
