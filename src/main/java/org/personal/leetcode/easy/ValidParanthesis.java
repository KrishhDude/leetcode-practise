package org.personal.leetcode.easy;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (!st.isEmpty() &&
                        ((c == ')' && st.peek() == '(') ||
                                (c == '}' && st.peek() == '{') ||
                                (c == ']' && st.peek() == '['))) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
