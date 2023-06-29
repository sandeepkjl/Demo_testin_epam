package com.example.demo;


public class Testing {
    public static void main(String args[]) {
        String s ="quest#global@abc";

        reverseString(s);
    }

    public static void reverseString(String s) {

        int start = 0;
        int end = s.length() - 1;
        char c[] = s.toCharArray();

        while (start < end) {
            if (!(c[end] >= 97) && (s.charAt(end) <=122)) {
                end--;
                continue;
            }

            if (!(s.charAt(start) >=97) && (s.charAt(start) <= 122)) {
                start++;
                continue;
            }
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;


        }
        String sr = new String(c);
        System.out.println(sr);

    }


}






