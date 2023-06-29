package com.example.demo.sorting;

public class MergeSort implements Sorting{

    @Override
    public int[] sort(int[] a) {
       return mergeSort(a,0,a.length-1);

    }
    private int[] mergeSort(int a[], int start, int end){
        if(start>=end) {
            int r[]={a[start]};
            return r;
        }
            int mid = (start + end) / 2;
            int al[] = mergeSort(a, start, mid);
            int ar[] = mergeSort(a, mid + 1, end);
            int result[] = mergeSortedArray(al,ar,al.length,ar.length);


        return result;




    }

    private int[] mergeSortedArray(int al[], int ar[], int l, int r){
        int res[] = new int[l+r];
        int i=0;
        int j=0;
        int k=0;
        while(i<l && j<r){
            if(al[i]<ar[j]){
                res[k++]=al[i++];
            }else{
                res[k++]=ar[j++];
            }
        }

        while(i<l){
            res[k++] = al[i++];
        }
        while(j<r){
            res[k++] = ar[j++];
        }

        return res;
    }
}
