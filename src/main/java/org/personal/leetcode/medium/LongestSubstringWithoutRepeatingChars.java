package org.personal.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {

        String s = "abcabcbb";
        //output = 3;

        char[] ar = s.toCharArray();

        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();
        int result = 0;

        for (r = 0; r < ar.length; r++) {

            while (set.contains(ar[r])) {
                set.remove(ar[l]);
                l++;
            }

            set.add(ar[r]);
            result = Math.max(result, (r - l + 1));
        }

        System.out.println(result);

//        for(int i=0; i<n; i++) {
//            for(j=i+1; j<n; j++)
        }
    }
