package org.personal.leetcode.interview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {

        String s = "abcabcbb";
        //output = abc

        int low = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();

        for(int r = 0; r < s.length(); r++) {

            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(low));
                low++;
            }

            set.add(s.charAt(r));
            res = Math.max(res, r - low +1);
        }

        System.out.println(res);
    }
}
