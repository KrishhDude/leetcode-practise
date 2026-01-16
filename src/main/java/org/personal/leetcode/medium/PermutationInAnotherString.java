package org.personal.leetcode.medium;

import java.util.Arrays;

import static java.lang.System.exit;

public class PermutationInAnotherString {

    public static void main(String[] args) {

        String s1 = "abbd";
        String s2 = "hbadbp";

        int n1 = s1.length();
        int n2 = s2.length();

        //initialize two arrays of 26 length, count of each char in s1 and s2
        int[] s1count = new int[26];
        int[] s2count = new int[26];

        //window size = size of smaller string, s1.length = n1;

        //calculate first window, first for loop, then check end condition
        for (int i = 0; i < n1; i++) {
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(s1count,s2count)){
            System.out.printf("true");
            exit(0);
        }

        //continue sliding window
        //start at current window end(window size, till end of bigger array)

        for (int i = n1; i < n2; i++) {
            s2count[s2.charAt(i) - 'a']++;
            s2count[s2.charAt(i-n1) - 'a']--;
            if(Arrays.equals(s1count,s2count)){
                System.out.printf("true");
                exit(0);
            }
        }

    }
}
