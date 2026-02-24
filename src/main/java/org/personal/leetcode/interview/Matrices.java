package org.personal.leetcode.interview;

import java.util.Arrays;

public class Matrices {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.println(matrix[i][j]);
            }
        }

        System.out.println("SUM: ");

        int rowsum = 0;
        int colsum = 0;

        int[] x = {1,2,3};
        int[] res = Arrays.stream(x).sorted().toArray();

        for (int i=0;i<matrix.length;i++) {

        }



//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//
//        // Transpose the matrix
//        int[][] transposed = new int[cols][rows];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                transposed[j][i] = matrix[i][j];
//            }
//        }
//
//        // Print the transposed matrix
//        for (int i = 0; i < cols; i++) {
//            for (int j = 0; j < rows; j++) {
//    }            System.out.print(transposed[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

}
