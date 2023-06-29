package com.example.demo.controller;

public class NextGreatestElement {
    public static void main(String args[]){
        int ar[]= {15, 10, 16, 20, 8, 9, 7, 50};
        for(int i =0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]<ar[j]){
                    System.out.println(ar[i]+"-"+ar[j]);
                    break;
                }
            }
        }
        System.out.println(ar[ar.length-1]+"-"+ 1);
    }
}
