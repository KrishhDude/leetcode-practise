package org.personal.leetcode.interview;

import java.util.Arrays;

public class Matrices {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
        for (int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {

                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }


        //reverse
        for (int[] row : matrix) {
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }

//        for(int i = 0; i<n; i++) {
//            int low = 0;
//            int high = n - 1;
//
//            while (low < high) {
//                int temp = matrix[i][low];
//                matrix[i][low] = matrix[i][high];
//                matrix[i][high] = temp;
//                low++;
//                high--;
//            }
//        }


        //reverse column
//        for(int i = 0; i<n; i++) {
//            for(int j = 0; j<n/2; j++) {
//                int temp = matrix[j][i];
//                matrix[j][i] = matrix[n-1-j][i];
//                matrix[n-1-j][i] = temp;
//            }
//        }


        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }





//        for (int i=0;i<matrix.length;i++) {
//            for(int j=0;j<matrix[0].length;j++) {
//                System.out.println(matrix[i][j]);
//            }
//        }
//
//        System.out.println("SUM: ");
//
//        int rowsum = 0;
//        int colsum = 0;
//
//        int[] x = {1,2,3};
//        int[] res = Arrays.stream(x).sorted().toArray();
//
//        for (int i=0;i<matrix.length;i++) {
//
//        }



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
