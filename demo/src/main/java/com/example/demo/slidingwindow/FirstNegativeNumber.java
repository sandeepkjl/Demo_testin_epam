package com.example.demo.slidingwindow;

public class FirstNegativeNumber {

    public static void main(String args[]){
        int[] arr = {1,10,5,11,13,3,7,14,9,15,17,2};
        int maxSum  = maxSumOfWindowSize3(arr,3);

       // System.out.println("Index Value : "+index+" value : "+arr[index]);

    }

    public static int maxSumOfWindowSize3(int[] arr,int size){
      if(arr.length<size){
          return -1;
      }

      int i=0;
      int j=0;
      int maxSum = Integer.MIN_VALUE;
      int sum =0;

      //int sum1 =0;
      while(j<arr.length){
          if(j-i+1<=size){
              sum=sum+arr[j];
              j++;
          }
          else{
              if(maxSum<sum){
                  maxSum=sum;
              }
              sum=sum-arr[i];
              i++;

          }

          }

      return maxSum;
      }

}
