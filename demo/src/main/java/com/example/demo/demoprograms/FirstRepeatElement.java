package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class FirstRepeatElement {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};

        int n1 = getFirstRepeatedElement(arr);
        int n2 = getFirstRepeatedElementJava8Approach(arr);

        System.out.println(n2);


    }

    public static int getFirstRepeatedElementJava8Approach(int arr[]) {
        Optional<Map.Entry<Integer,Long>> entry = Arrays.stream(arr).boxed().
                collect(Collectors.groupingBy(i -> i,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).findFirst();

        if(entry.isPresent()){
            return entry.get().getKey();
        }else{
            return -1;
        }
    }




    public static int getFirstRepeatedElement(int arr[]) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : arr) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                return entry.getKey();
        }
        return -1;
    }
}
