package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class LongestWord {
    public static void main(String args[]) {
        String str = "I am interested to grow in my organization";
        //System.out.println(longestWordLegacyStyle(str));
        System.out.println(longestWordJava8Style(str));

    }

    public static String longestWordLegacyStyle(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String st : str.split(" ")) {
            map.put(st, st.length());
        }

        int max = 0;
        String res = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }

    public static String longestWordJava8Style(String str) {
        Map<String,Integer> res = Arrays.stream(str.split(" ")).collect(Collectors.toMap(s -> s, s -> s.length()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(), (old,newly)->old,LinkedHashMap::new));

        System.out.println(res);
        return null;
    }

}
