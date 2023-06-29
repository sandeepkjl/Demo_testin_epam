package com.example.demo.module3;

public class StringPermutation {
    public static void main(String args[]){
        String s="ABC";
        permutationString(s.toCharArray(),0);

    }

    public static void permutationString(char[] s, int fi){
        if(fi==s.length){
          System.out.println(s);
          return;
        }
        for(int i=fi;i<s.length;i++){
            swap(s,fi,i);
            permutationString(s,fi+1);
            swap(s,fi,i);
        }

    }

    public static void swap(char[] s, int i, int j) {
       char temp=s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
