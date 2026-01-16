package org.personal.leetcode.easy;

import java.util.Arrays;

public class ArrayOps {

    public static void main(String[] args) {

//        int[] arr = new int[5];
        int[] arr = {5,1,8,7,5};


        //sorting
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int x : arr) {
            System.out.println(arr[x]);
        }
    }
}
