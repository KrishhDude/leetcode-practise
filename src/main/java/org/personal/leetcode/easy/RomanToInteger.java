package org.personal.leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> rmToInt = new HashMap<>();
        rmToInt.put('I', 1);
        rmToInt.put('V', 5);
        rmToInt.put('X', 10);
        rmToInt.put('L', 50);
        rmToInt.put('C', 100);
        rmToInt.put('D', 500);
        rmToInt.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && (rmToInt.get(s.charAt(i)) < rmToInt.get(s.charAt(i + 1)))) {
                sum -= rmToInt.get(s.charAt(i));
            } else {
                sum += rmToInt.get(s.charAt(i));
            }
        }
        return sum;
    }
}
