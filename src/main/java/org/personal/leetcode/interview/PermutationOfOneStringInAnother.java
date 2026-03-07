package org.personal.leetcode.interview;

import java.util.Arrays;

public class PermutationOfOneStringInAnother {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";
        //op = true

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) System.out.println(false);

        int[] s1counts = new int[26];
        int[] s2counts = new int[26];

        for(int i = 0; i<n1; i++) {
            s1counts[s1.charAt(i) - 'a']++;
            s2counts[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1counts, s2counts)){
            System.out.println(true);
        }

        for(int i = n1; i< n2; i++) {

            s2counts[s2.charAt(i)- 'a']++;
            s2counts[s2.charAt(i-n1)-'a']--;
            if(Arrays.equals(s1counts, s2counts)){
                System.out.println(true);
                printal();
                printArray(s1counts);
                printArray(s2counts);
                return;
            }
        }



    }

    public static void printArray(int[] ar) {


        System.out.println();

        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

    public static void printal() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
}
