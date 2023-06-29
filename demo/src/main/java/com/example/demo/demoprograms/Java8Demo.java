package com.example.demo;

import java.util.*;

public class Java8Demo {
    public static void main(String args[]) {
        try {
            int i=9/0;
            System.out.println(i);
            return;
        } catch (Exception e) {
            System.out.println("exception caught");

        }
        System.out.println("task completed");
    }


}

