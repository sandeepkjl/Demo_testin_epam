package com.example.demo.kthelement;

import java.util.*;

public class KthElementBySorting {
    public static void main(String args[]){


        int[] arr = {3,2,3,1,2,4,5,5,5,6};
        Set<Integer> set = new TreeSet<>();

        for (int i:arr){
           set.add(i);
        }
        System.out.println(set);
       Integer arr1[]= set.toArray(new Integer[set.size()]);
       for(int j:arr1){
           System.out.println(j);
       }

        int result = findMaxElement(arr1,4);
        System.out.println(result);



    }

    public static int findMaxElement(Integer[] arr, int k){
        int num= arr[arr.length-k];
        return num;
    }
}
