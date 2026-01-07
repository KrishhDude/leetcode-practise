package org.personal.leetcode.easy;

public class PalindromeNumber {

    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        /* Python
        class Solution(object):
            def isPalindrome(self, x):
                s = str(x)
                return (s == s[::-1])
         */

        int res = 0;
        int fin = x;
        while (x > 0) {
            int rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }
        return res == fin;
    }
}
