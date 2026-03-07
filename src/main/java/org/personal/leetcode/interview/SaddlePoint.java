package org.personal.leetcode.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SaddlePoint {

    public static void main(String[] args) {

        //saddle point in a matrix, each element such that it is:
        // min in row
        // max in col

        int[][] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17},
        };

        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        for (int i = 0; i < n; i++) {

            //traverse each row;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                System.out.println("current element: " + matrix[i][j]);
                min = Math.min(min, matrix[i][j]);
            }
            set.add(min);
        }

        //traverse each element column-wise of the matrix
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                System.out.println("current element: " + matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
            if(!set.add(max)) {
                ans.add(max);
            }
        }

        System.out.println("\n\n ans : " + ans);
    }
}
