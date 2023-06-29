package com.example.demo;

import java.util.Arrays;

public class CheckArrayEquality {
    public static void main(String args[]){
        int arr1[] = {21,6,8,9,10,5};
        int arr2[] = {10,21,5,8,6,9};

        boolean b = checkArrayEquals(arr1,arr2);
        System.out.println(b);

    }

    public static boolean checkArrayEquals(int arr1[], int arr2[]){
        int l1=arr1.length;
        int l2=arr2.length;
        if(l1!=l2){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean arrayEquals=true;
        for(int i=0;i<l1;i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            arrayEquals=false;
            break;
        }

        return arrayEquals;
    }

}
