package com.example.demo.maximumsubarray;

public class Divideconquer {

    public static void main(String args[]) {
        int[] arr ={5,4,-1,7,8};
        int result = maxSumArray(arr, 0, arr.length-1);
        System.out.println(result);

    }

    private static int maxSumArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr[start];
        }

        int mid = (start+((end-start)/2));
        int lMaxSum = maxSumArray(arr,0,mid);
        int rMaxSum = maxSumArray(arr,mid+1, end);

        int lSum = Integer.MIN_VALUE;
        int rSum= Integer.MIN_VALUE;
        int currSum =0;

        for(int i=mid;i>=0;i--){
            currSum=currSum+arr[i];
            if(lSum<currSum){
                lSum=currSum;
            }
        }
        currSum=0;
        for(int j=mid+1;j<=end;j++){
            currSum=currSum+arr[j];
            if(rSum<currSum)
                rSum = currSum;
        }

        int cSum = rSum+lSum;



        if(lMaxSum> rMaxSum && lMaxSum>cSum)
            return lMaxSum;
        else if (rMaxSum>lMaxSum && rMaxSum>cSum) {
            return rMaxSum;
        }
        else{
            return cSum;
        }


    }
}
