package org.personal.leetcode.easy;

public class IndexOfFirstOccurrenceInString {

    public static void main(String[] args) {

        String hayStack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(hayStack, needle));
    }

    public static int strStr(String hayStack, String needle) {
        return hayStack.indexOf(needle);
    }
}
