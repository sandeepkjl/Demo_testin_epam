package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class VisualVMDemo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 7, 3, 4, 8, -1, -10, 15};
        int n = arr.length;
        int ans = firstMissingPositive(arr, n);
        //System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums, int n) {
        System.out.println(n);
        List<Integer> negativeList = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] < 0)) {
                if (i == 0) {
                    nums[c] = nums[i];
                    c++;
                } else {
                    insertionSort(nums,c,i);
                    c++;
                }
                }else{
                    negativeList.add(nums[i]);
                }
            }
            for (int nn : negativeList) {
                nums[c] = nn;
                c++;
            }
            for (int k : nums) {
                System.out.println(k);
            }
            return 0;
        }



    public static void insertionSort(int nums[],int c,int i){
        int key=nums[i];
        int temp=c-1;
        while(temp>=0 && nums[temp]>key){
            nums[temp+1]=nums[temp];
            temp--;
        }
        nums[temp+1]=key;
    }
}





