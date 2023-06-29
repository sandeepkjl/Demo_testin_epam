package com.example.demo.module3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCharacterCount {
    public static void main(String args[]) {
        String word = "organization";
        Map<Character, Integer> charCountMap =
                charCountInLegacyStyle(word);
        System.out.println("In Legacy Coding Style : " + charCountMap);

        Map<Character, Long> charCountInJava8 =
                charCountInJava8Style(word);
        System.out.println("In Java 8 Coding Style : " + charCountMap);
    }

    public static Map<Character, Integer> charCountInLegacyStyle(String word) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : word.toCharArray()) {
            if (!charCountMap.containsKey(c))
                charCountMap.put(c, 1);
            else
                charCountMap.put(c, charCountMap.get(c) + 1);
        }
        return charCountMap;
    }

    public static Map<Character, Long> charCountInJava8Style(String word) {
        Map<Character, Long> map = word.chars().mapToObj(i -> (char) i).collect(
                Collectors.groupingBy(i -> i, Collectors.counting()));

        return map;
    }

}
