package com.example.demo;

public class BenchWorkshop {
    public static void main(String args[]){
        printTopDown(5);
    }

    public static void printTopDown(int times){
        for(int i=1;i<=times;i++){
            for(int j=1;j<=times;j++){
                System.out.println(" ");
            }
            System.out.println("#");
        }

    }
}
