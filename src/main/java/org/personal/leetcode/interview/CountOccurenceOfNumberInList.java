package org.personal.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

public class CountOccurenceOfNumberInList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int target = 3;
        long count = list.stream().filter(num -> num == target).count();

    }
}
