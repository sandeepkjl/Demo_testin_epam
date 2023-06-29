package com.example.demo.substringproblem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SubStringProblem {
    public static void main(String args[]){

        String s ="aaabb";

        int result = subStringWithKRepeatedChars(s,3);


    }

    public static int subStringWithKRepeatedChars(String s, int k){

        Map<Character,Long> map = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,
                LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);

        return 0;
    }


}
