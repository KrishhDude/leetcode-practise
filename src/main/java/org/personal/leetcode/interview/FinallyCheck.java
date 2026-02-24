package org.personal.leetcode.interview;

public class FinallyCheck {

    public static void main(String[] args) {

        System.out.println(test());
    }

    public static int test() {
        int n = 10;
        try {
            return n + 10;
        } finally {
            return n;
        }
    }
}
