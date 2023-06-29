package com.example.demo;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String args[]) {

        Stack<Character> stack = new Stack<>();

        String exp = "[(])";

        char ch[] = exp.toCharArray();

        for (char c : ch) {
            if (stack.empty()) {
                stack.push(c);
                continue;
            }
            Character cp = stack.peek();
            if ((cp == '(' && c == ')') || cp == '[' && c == ']' || cp == '{' && c == '}') {
                stack.pop();
                continue;
            }

            System.out.println(stack.peek());
            stack.push(c);
        }
        if (!stack.empty()) {
            System.out.println("Not Balanced");
        } else {
            System.out.println("Balanced");
        }

    }

}
