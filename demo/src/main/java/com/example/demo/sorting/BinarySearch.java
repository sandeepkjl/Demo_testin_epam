package com.example.demo.sorting;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {1, 4, 7, 9, 10,10, 10, 10,11, 13, 15, 17};
        int index = search(arr,10,0,arr.length-1);
        int key=arr[index];
        System.out.println(index);
        while(arr[index+1]==key){
            index++;
        }
        System.out.println(index);
    }

    public static int search(int[] arr,int key,int start,int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid;
            }else{
                start=mid+1;
            }
        }

        return -1;

    }

}
