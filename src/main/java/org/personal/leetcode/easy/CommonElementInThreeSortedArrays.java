package org.personal.leetcode.easy;

import java.util.ArrayList;

public class CommonElementInThreeSortedArrays {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 3, 4, 5};
        int[] a2 = {2, 3, 4, 4, 4, 5};
        int[] a3 = {3, 4};

        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length && k < a3.length) {

            if (a1[i] == a2[j] && a2[j] == a3[k]) {
                res.add(a1[i]);
                i++; j++; k++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else if (a2[j] < a3[k]) {
                j++;
            }
        }
        System.out.println(res);
    }
}
