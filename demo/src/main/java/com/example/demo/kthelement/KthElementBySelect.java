/*
package com.example.demo.kthelement;

import java.util.Collections;

public class KthElementBySelect {
    public static void main(String args[]){
        int[] arr = {3,2,1,5,6,4};
        int result = findByPartition(arr,0,arr.length,2);
        System.out.println(result);
    }
    public static int findByPartition(int[] arr,int start, int end,int k){
        if(arr[start]==k){
            return arr[start];
        }

        Collections.sort();

        int pivot=partition(arr,start,end-1);
        if(pivot+1<k){
           return findByPartition(arr,pivot+1,end,k);
        } else if (pivot+1>k) {
            return findByPartition(arr,start,pivot-1,k);

        }else{
            return arr[pivot];
        }

    }

    public static int partition(int arr[],int start,int end){
        int pivot = end;
        int j=start;

        for(int i=start;i<end;i++){
            if(arr[pivot]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        int t=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=t;
        return j;

    }
}
*/
