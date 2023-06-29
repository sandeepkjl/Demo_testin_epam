package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class ReversalWithSpecialChar {
    public static void main(String args[]) {
        HashMap<String,Integer> map = new HashMap<>();
        /*map.put()*/
        String str = "Swa$pn&il"; //Output : lin$pa&wS
        char[] ch = str.toCharArray();
        int last = str.length() - 1;
        int start = 0;
        while (last > start) {
            int startCh = ch[start];
            int lastCh = ch[last];
            if (!((startCh >= 65 && startCh <= 90) || (startCh >= 97 && startCh <= 122))) {
                start++;
            } else if (!((lastCh >= 65 && lastCh <= 90) || (lastCh >= 97 && lastCh <= 122))) {
                last--;
            } else {
                char temp = ch[start];
                ch[start] = ch[last];
                ch[last] = temp;
                start++;
                last--;
            }
        }
        System.out.println(ch);
    }
}
