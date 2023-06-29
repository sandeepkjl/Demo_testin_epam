package com.example.demo.module3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddTwoListNumbers {
    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(2, 3, 5, 7,null);
        List<Integer> list2 = Arrays.asList(8, 2, 7,null);

        List<Integer> sumList = addTwoListInteger(list1, list2);
        System.out.println(sumList);
    }


    public static List<Integer> addTwoListInteger(List<Integer> list1, List<Integer> list2) {

        String s1 = list1.stream().filter(i->i!=null).map(i -> String.valueOf(i)).collect(Collectors.joining());

        String s2 = list2.stream().filter(i->i!=null).map(i -> String.valueOf(i)).collect(Collectors.joining());

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);

        List<Integer> res = Arrays.stream(String.valueOf(sum).split(""))
                .mapToInt(Integer::parseInt).mapToObj(i -> (Integer) i).collect(Collectors.toList());

        return res;
    }

}